package io.github.maanaim.hbaseom.dao;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.filter.PrefixFilter;
import org.apache.log4j.Logger;

import io.github.maanaim.hbaseom.annotation.HBaseColumn;
import io.github.maanaim.hbaseom.annotation.HBaseRowKey;
import io.github.maanaim.hbaseom.annotation.HBaseTable;
import io.github.maanaim.hbaseom.mapper.HBaseConversor;

public abstract class AbstractHBaseDao<E> {
  
  private static final Logger LOGGER = Logger.getLogger(AbstractHBaseDao.class);

  private Connection connection;
  
  private Table table;
  
  final Class<E> typeParameterClass;

  public AbstractHBaseDao(Class<E> typeParameterClass) {
    long timeToConnection = System.currentTimeMillis();
    this.typeParameterClass = typeParameterClass;
    try {
      this.connection = ConnectionFactory.createConnection(getConfiguration());
      table = connection.getTable(TableName.valueOf(getTableName()));
      Get getByKey = new Get(HBaseConversor.convertStringToBytes("key"));
      table.get(getByKey);
      LOGGER.debug("Time wasted to connection: " + (System.currentTimeMillis()-timeToConnection));
    } catch (IOException e) {
      LOGGER.fatal("Cannot open connection!", e);
    }
  }
  
  public abstract Configuration getConfiguration();
  
  public List<E> search(String prefixKey) {
    List<E> objects = new ArrayList<E>();
    try {
      Scan scan = new Scan();
      PrefixFilter prefixFilter = new PrefixFilter(HBaseConversor.convertStringToBytes(prefixKey));
      scan.setFilter(prefixFilter);
      ResultScanner resultScanner = table.getScanner(scan);
      resultScanner.forEach( result -> {
        objects.add(creteEntity(result));
      });
    } catch (IOException e) {
      LOGGER.fatal("Cannot open connection!", e);
    }
    
    return objects;
  }
  
  private E creteEntity(Result result) {
    try {
      E typeGeneric = typeParameterClass.newInstance();
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
            d = HBaseConversor.convertBytesToDate(value);
          }
        }

        boolean accessible = field.isAccessible();
        field.setAccessible(true);
        field.set(typeGeneric, d);
        field.setAccessible(accessible);
      }
      
      return typeGeneric;
      
    } catch (InstantiationException | IllegalAccessException e) {
      LOGGER.fatal("Cannot open connection!", e);
    }
    
    return null;
  }

  private String getTableName() {
    String tableName = null;
    
    if (typeParameterClass.isAnnotationPresent(HBaseTable.class)) {
      Annotation annotation = typeParameterClass.getAnnotation(HBaseTable.class);
      HBaseTable testerInfo = (HBaseTable) annotation;
      tableName = testerInfo.name();
    }
    
    return tableName;
  }

  public E getByKey(String key) {
    try {
      Get getByKey = new Get(HBaseConversor.convertStringToBytes(key));
      Result result = table.get(getByKey);
      return creteEntity(result);
    } catch (IOException e) {
      LOGGER.fatal("Cannot open connection!", e);
    }
    
    return null;
  }
  
}
