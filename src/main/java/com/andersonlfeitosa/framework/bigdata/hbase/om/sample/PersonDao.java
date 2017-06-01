package com.andersonlfeitosa.framework.bigdata.hbase.om.sample;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HConstants;

import com.andersonlfeitosa.framework.bigdata.hbase.om.dao.AbstractHBaseDao;

public class PersonDao extends AbstractHBaseDao<Person> {

  public PersonDao() {
    super(Person.class);
  }

  @Override
  public Configuration getConfiguration() {
    Configuration config = HBaseConfiguration.create();
    config.set(HConstants.ZOOKEEPER_QUORUM, "lnxhom013:2181");
    return config;
  }

}
