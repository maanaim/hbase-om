package io.github.maanaim.hbaseom.sample;

import io.github.maanaim.hbaseom.dao.AbstractHBaseDao;

public class ContratoDao extends AbstractHBaseDao<Contrato> {

  public ContratoDao() {
    super(Contrato.class);
  }
  
}
