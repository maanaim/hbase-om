package io.github.maanaim.hbaseom.dao;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.client.Table;
import org.apache.log4j.Logger;

import io.github.maanaim.hbaseom.annotation.HBaseColumn;
import io.github.maanaim.hbaseom.annotation.HBaseRowKey;
import io.github.maanaim.hbaseom.annotation.HBaseTable;
import io.github.maanaim.hbaseom.exception.DataAccessObjectException;
import io.github.maanaim.hbaseom.mapper.HBaseConversor;
import io.github.maanaim.hbaseom.mapper.HBaseFormat;

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
    } catch (IOException e) {
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
        objects.add(createEntity(result));
      });
    } catch (IOException e) {
      throw new DataAccessObjectException(e);
    }
    
    return objects;
  }
  
  private E createEntity(Result result) {
    E typeGeneric = null;
    
    try {
      typeGeneric = typeParameterClass.newInstance();
      for (Field field : typeParameterClass.getDeclaredFields()) {
        
        Object d = null;
        if (field.isAnnotationPresent(HBaseRowKey.class)) {
          if (field.getType().getName().equalsIgnoreCase(String.class.getName())) {
            d = HBaseConversor.convertBytesToString(result.getRow());
          } else if (field.getType().getName().equalsIgnoreCase(Integer.class.getName())) {
            d = HBaseConversor.convertBytesToInt(result.getRow());
          } else if (field.getType().getName().equalsIgnoreCase(Long.class.getName())) {
            d = HBaseConversor.convertBytesToLong(result.getRow());
          } else if (field.getType().getName().equalsIgnoreCase(BigDecimal.class.getName())) {
            d = HBaseConversor.convertBytesToBigDecimal(result.getRow());
          }
        } else if (field.isAnnotationPresent(HBaseColumn.class)) {
          Annotation annotation = field.getAnnotation(HBaseColumn.class);
          HBaseColumn hbaseAnnotation = (HBaseColumn) annotation;
          
          byte[] value = result.getValue(HBaseConversor.convertStringToBytes(hbaseAnnotation.family()),
              HBaseConversor.convertStringToBytes(hbaseAnnotation.qualifier()));
          
          if (field.getType().getName().equalsIgnoreCase(String.class.getName())) {
            d = HBaseConversor.convertBytesToString(value);
          } else if (field.getType().getName().equalsIgnoreCase(Integer.class.getName())) {
            d = HBaseConversor.convertBytesToInt(value);
          } else if (field.getType().getName().equalsIgnoreCase(Long.class.getName())) {
            d = HBaseConversor.convertBytesToLong(value);
          } else if (field.getType().getName().equalsIgnoreCase(BigDecimal.class.getName())) {
            d = HBaseConversor.convertBytesToBigDecimal(value);
          } else if (field.getType().getName().equalsIgnoreCase(Date.class.getName())) {
            if (hbaseAnnotation.format().equals(HBaseFormat.DATETIME)) {
              d = HBaseConversor.convertBytesToDateTime(value);
            } else {
              d = HBaseConversor.convertBytesToDate(value);
            }
          }
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
