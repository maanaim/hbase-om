package io.github.maanaim.hbaseom.sample;

import java.io.IOException;
import java.util.List;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HConstants;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.log4j.Logger;

import io.github.maanaim.hbaseom.exception.DataAccessObjectException;

public class TestHBase {
  
  private static final String TABELA_PESSOA_CONSOLIDADO = "VISAO360.CONSOLIDADO_CONTRATO";
  
  private static final Logger LOGGER = Logger.getLogger(TestHBase.class);
  
  public static void main(String[] args) throws DataAccessObjectException {
    
    Configuration config = HBaseConfiguration.create();
    config.set(HConstants.ZOOKEEPER_QUORUM, "lnxhom013.rootbrasil.intranet:2181,lnxhom014.rootbrasil.intranet:2181,lnxhom015.rootbrasil.intranet:2181");
    config.set("hbase.rpc.timeout", "1800000");
    config.set("hbase.client.scanner.timeout.period", "1800000");
    config.set("hbase.client.retries.number", "3");
    config.set("hbase.client.pause", "1000");
    config.set("zookeeper.recovery.retry", "1");

    long startTime = System.currentTimeMillis();
    Table table = null;
    try {
      Connection connection = ConnectionFactory.createConnection(config);
      table = connection.getTable(TableName.valueOf(TABELA_PESSOA_CONSOLIDADO));
      Get getByKey = new Get(Bytes.toBytes("key"));
      table.get(getByKey);
    } catch (IOException e) {
      LOGGER.warn("Erro ao conectar com o HBase.", e);
    }
    System.out.println("Time to warm-up the HBase Connection: " + (System.currentTimeMillis()-startTime));
    
    startTime = System.currentTimeMillis();
    ContratoDao dao = new ContratoDao();
    dao.setTable(table);
    List<Contrato> contratos = dao.search("28254830606");
    contratos.forEach(a -> System.out.println(a.toString()));
    System.out.println("Time to search and create objects: " + (System.currentTimeMillis()-startTime));
  }

}
