package org.hbaseom.sample;

import java.sql.Date;

import org.hbaseom.annotation.HBaseColumn;
import org.hbaseom.annotation.HBaseRowKey;
import org.hbaseom.annotation.HBaseTable;

@HBaseTable(name="VISAO360.CONSOLIDADO_PESSOA")
public class Person {

  @HBaseRowKey
  private String cpf;
  
  @HBaseColumn(family = "0", qualifier="NOM_PESSOA")
  private String nome;
  
  @HBaseColumn(family = "0", qualifier="EMAIL")
  private String email;

  @HBaseColumn(family = "0", qualifier="DTH_NASCIMENTO")
  private String dataNascimento;

  @HBaseColumn(family = "0", qualifier="DTH_ATUALIZACAO")
  private String dataAtualizacao;

  private Date somedate;

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public String getDataAtualizacao() {
    return dataAtualizacao;
  }

  public void setDataAtualizacao(String dataAtualizacao) {
    this.dataAtualizacao = dataAtualizacao;
  }

  @Override
  public String toString() {
    return "Person [cpf=" + cpf + ", nome=" + nome + ", email=" + email + ", dataNascimento=" + dataNascimento
        + ", dataAtualizacao=" + dataAtualizacao + ", somedate=" + somedate + "]";
  }

}
