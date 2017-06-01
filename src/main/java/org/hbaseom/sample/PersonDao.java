package org.hbaseom.sample;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HConstants;
import org.hbaseom.dao.AbstractHBaseDao;

public class PersonDao extends AbstractHBaseDao<Person> {

  public PersonDao() {
    super(Person.class);
  }

  @Override
  public Configuration getConfiguration() {
    Configuration config = HBaseConfiguration.create();
    config.set(HConstants.ZOOKEEPER_QUORUM, "lnxhom013:2181,lnxhom014:2181,lnxhom015:2181");
    return config;
  }

}
