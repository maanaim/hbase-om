package io.github.andersonlf.hbaseom.sample;

import java.math.BigDecimal;
import java.sql.Date;

import io.github.andersonlf.hbaseom.annotation.HBaseColumn;
import io.github.andersonlf.hbaseom.annotation.HBaseRowKey;
import io.github.andersonlf.hbaseom.annotation.HBaseTable;
import io.github.andersonlf.hbaseom.mapper.HBaseFormat;

@HBaseTable(name="VISAO360.CONSOLIDADO_CONTRATO")
public class Person {

  @HBaseRowKey
  private String id;
  
  @HBaseColumn(family = "0", qualifier="SISTEMA")
  private String sistema;
  
  @HBaseColumn(family = "0", qualifier="VLR_PREMIO_BRUTO")
  private BigDecimal valorIof;

  @HBaseColumn(family = "0", qualifier="DTH_INI_VIGENCIA", format=HBaseFormat.DATE) 
  private String dataInicioVigencia;

  @HBaseColumn(family = "0", qualifier="DTH_ATUALIZACAO", format=HBaseFormat.DATETIME)
  private String dataAtualizacao;

  @HBaseColumn(family = "0", qualifier="IND_CONTRATO")
  private Integer indContrato;

  @HBaseColumn(family = "0", qualifier="NUM_PROPOSTA")
  private Long numProposta;
  
  private Date somedate;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getSistema() {
    return sistema;
  }

  public void setSistema(String sistema) {
    this.sistema = sistema;
  }

  public BigDecimal getValorIof() {
    return valorIof;
  }

  public void setValorIof(BigDecimal valorIof) {
    this.valorIof = valorIof;
  }

  public String getDataInicioVigencia() {
    return dataInicioVigencia;
  }

  public void setDataInicioVigencia(String dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
  }

  public String getDataAtualizacao() {
    return dataAtualizacao;
  }

  public void setDataAtualizacao(String dataAtualizacao) {
    this.dataAtualizacao = dataAtualizacao;
  }

  public Integer getIndContrato() {
    return indContrato;
  }

  public void setIndContrato(Integer indContrato) {
    this.indContrato = indContrato;
  }

  public Long getNumProposta() {
    return numProposta;
  }

  public void setNumProposta(Long numProposta) {
    this.numProposta = numProposta;
  }

  public Date getSomedate() {
    return somedate;
  }

  public void setSomedate(Date somedate) {
    this.somedate = somedate;
  }

  @Override
  public String toString() {
    return "Person [id=" + id + ", sistema=" + sistema + ", valorIof=" + valorIof + ", dataInicioVigencia="
        + dataInicioVigencia + ", dataAtualizacao=" + dataAtualizacao + ", indContrato=" + indContrato
        + ", numProposta=" + numProposta + ", somedate=" + somedate + "]";
  }

}
