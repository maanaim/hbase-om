package io.github.maanaim.hbaseom.sample;

import io.github.maanaim.hbaseom.dao.AbstractHBaseDao;

public class TesteDao extends AbstractHBaseDao<Teste> {

  public TesteDao() {
    super(Teste.class);
  }
  
}
