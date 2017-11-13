package io.github.maanaim.hbaseom.dao;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.*;

import io.github.maanaim.hbaseom.annotation.HBaseArrayColumnFamily;
import io.github.maanaim.hbaseom.converter.exceptions.WrongAttributeTypeException;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.filter.CompareFilter.CompareOp;
import org.apache.hadoop.hbase.filter.Filter;
import org.apache.hadoop.hbase.filter.FilterList;
import org.apache.hadoop.hbase.filter.FilterList.Operator;
import org.apache.hadoop.hbase.filter.SingleColumnValueFilter;
import org.apache.log4j.Logger;

import io.github.maanaim.hbaseom.annotation.HBaseColumn;
import io.github.maanaim.hbaseom.annotation.HBaseRowKey;
import io.github.maanaim.hbaseom.annotation.HBaseTable;
import io.github.maanaim.hbaseom.converter.HBaseColumnContextConversor;
import io.github.maanaim.hbaseom.converter.HBaseRowKeyContextConversor;
import io.github.maanaim.hbaseom.converter.IContextConversor;
import io.github.maanaim.hbaseom.exception.DataAccessObjectException;
import io.github.maanaim.hbaseom.mapper.HBaseConversor;

public abstract class AbstractHBaseDao<E> {
  
  private static final Logger LOGGER = Logger.getLogger(AbstractHBaseDao.class);

  private Table table;
  
  final Class<E> typeParameterClass;
  
  public AbstractHBaseDao(Class<E> typeParameterClass) {
    this.typeParameterClass = typeParameterClass;
  }
  
  public Table getTable() throws DataAccessObjectException {
    if (this.table == null) {
      throw new DataAccessObjectException("Table was not configured.");
    }
    
    return table;
  }

  public void setTable(Table table) {
    this.table = table;
  }
  
  public E getByKey(String key) throws DataAccessObjectException {
    E object = null;
    try {
      Get getByKey = new Get(HBaseConversor.convertStringToBytes(key));
      Result result = getTable().get(getByKey);
      object = createEntity(result);
    } catch (WrongAttributeTypeException | IOException e) {
      throw new DataAccessObjectException(e);
    }
    
    return object;
  }
  
  public List<E> search(String prefixKey) throws DataAccessObjectException {
    List<E> objects = new ArrayList<E>();
    try {
      Scan scan = new Scan();
      scan.setRowPrefixFilter(HBaseConversor.convertStringToBytes(prefixKey));
      ResultScanner resultScanner = getTable().getScanner(scan);
      resultScanner.forEach( result -> {
        try {
          objects.add(createEntity(result));
        } catch ( WrongAttributeTypeException e) {
          throw new RuntimeException(e);
        }
      });
    } catch (IOException e) {
      throw new DataAccessObjectException(e);
    }
    
    return objects;
  }

  public List<E> search(E entity) throws DataAccessObjectException {
    List<E> objects = new ArrayList<E>();
    
    try {
      List<Filter> filters = new ArrayList<>();
      for (Field field : entity.getClass().getDeclaredFields()) {

        if (field.isAnnotationPresent(HBaseColumn.class)) {
          Annotation annotation = field.getAnnotation(HBaseColumn.class);
          HBaseColumn hbaseAnnotation = (HBaseColumn) annotation;
          
          field.setAccessible(true);
          Object o = field.get(entity);
          field.setAccessible(false);
          if (o != null) {
            SingleColumnValueFilter f = new SingleColumnValueFilter(
                HBaseConversor.convertStringToBytes(hbaseAnnotation.family()), 
                HBaseConversor.convertStringToBytes(hbaseAnnotation.qualifier()), 
                CompareOp.EQUAL, 
                HBaseConversor.convertStringToBytes(o.toString()));
            
            f.setFilterIfMissing(true);
            filters.add(f);
          }
        }
      }
      
      Scan scan = new Scan();
      FilterList filterList = new FilterList(Operator.MUST_PASS_ALL);
      filters.forEach(a -> filterList.addFilter(a));
      scan.setFilter(filterList);
      ResultScanner resultScanner = getTable().getScanner(scan);
      resultScanner.forEach( result -> {
        try {
          objects.add(createEntity(result));
        } catch ( WrongAttributeTypeException e) {
          throw new RuntimeException(e);
        }
      });
      
    } catch (IOException | IllegalArgumentException | IllegalAccessException e) {
      throw new DataAccessObjectException(e);
    }
    
    return objects;
  }
  
  private E createEntity(Result result) throws WrongAttributeTypeException {
    E typeGeneric = null;
    IContextConversor rowKeyConversor = new HBaseRowKeyContextConversor();
    IContextConversor columnConversor = new HBaseColumnContextConversor();
    
    try {
      typeGeneric = typeParameterClass.newInstance();
      for (Field field : typeParameterClass.getDeclaredFields()) {
        String fieldNameType = field.getType().getName();

        Object d = null;
        
        if (field.isAnnotationPresent(HBaseRowKey.class)) {
          d = rowKeyConversor.convert(fieldNameType, result.getRow());
        }
        
        if (field.isAnnotationPresent(HBaseColumn.class)) {
          Annotation annotation = field.getAnnotation(HBaseColumn.class);
          HBaseColumn hbaseAnnotation = (HBaseColumn) annotation;
          
          byte[] value = result.getValue(HBaseConversor.convertStringToBytes(hbaseAnnotation.family()),
              HBaseConversor.convertStringToBytes(hbaseAnnotation.qualifier()));
          
          d = columnConversor.convert(fieldNameType, value, hbaseAnnotation.format());
        }

        // For HBaseArrayColumnFamily annotation
        if ( field.isAnnotationPresent(HBaseArrayColumnFamily.class) ) {

          String mapClassName = Map.class.getName();
          if ( fieldNameType != mapClassName )
            throw new WrongAttributeTypeException(mapClassName, fieldNameType );

          HBaseArrayColumnFamily hbaseAnnotation = field.getAnnotation(HBaseArrayColumnFamily.class);
          byte[] familyConverted = HBaseConversor.convertStringToBytes(hbaseAnnotation.family());

          NavigableMap<byte[], byte[]> familyMap = result.getFamilyMap(familyConverted);

          d = this.iterateOverFamilyMap(
                  hbaseAnnotation.qualifierType(),
                  hbaseAnnotation.valueType(),
                  familyMap,
                  new HashMap<>() );
        }

        boolean accessible = field.isAccessible();
        field.setAccessible(true);
        field.set(typeGeneric, d);
        field.setAccessible(accessible);
      }
      
    } catch (InstantiationException | IllegalAccessException e) {
      LOGGER.fatal("Cannot create entity!", e);
    }
    
    return typeGeneric;
  }

  /**
   * Iterates over a FamilyMap, converts the values and returns a Map<String, String>
   *
   * @param navMap: NavigableMap<byte[], byte[]>
   * @param accumulator: Map<String,String>
   *
   * @return Returns a column/value map with all byte array values converted to String
   * */
  private Map<String, String> iterateOverFamilyMap(
          String qualifierFieldType,
          String valueFieldType,
          NavigableMap<byte[], byte[]> navMap,
          Map<String,String> accumulator
  ) {

    if ( navMap.isEmpty() )
      return accumulator;
    else {
      IContextConversor rowKeyConversor = new HBaseRowKeyContextConversor();

      Map.Entry<byte[], byte[]> entry = navMap.pollFirstEntry();

      String key = rowKeyConversor.convert(qualifierFieldType,entry.getKey()).toString();
      String value = rowKeyConversor.convert(valueFieldType,entry.getValue()).toString();

      accumulator.put(key, value);
      return iterateOverFamilyMap( qualifierFieldType, valueFieldType, navMap, accumulator );
    }

  }


  @SuppressWarnings("unused")
  // TODO Temporariamente inutilizado após mudança de estratégia 
  private String getTableName() {
    String tableName = null;
    
    if (typeParameterClass.isAnnotationPresent(HBaseTable.class)) {
      Annotation annotation = typeParameterClass.getAnnotation(HBaseTable.class);
      HBaseTable testerInfo = (HBaseTable) annotation;
      tableName = testerInfo.name();
    }
    
    return tableName;
  }
  
}
