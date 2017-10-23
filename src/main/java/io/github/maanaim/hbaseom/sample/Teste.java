package io.github.maanaim.hbaseom.sample;

import io.github.maanaim.hbaseom.annotation.HBaseColumn;
import io.github.maanaim.hbaseom.annotation.HBaseRowKey;
import io.github.maanaim.hbaseom.annotation.HBaseTable;

@HBaseTable(name = "teste")
public class Teste {

  @HBaseRowKey
  private String id;

  @HBaseColumn(family = "0", qualifier = "NOME")
  private String nome;

  @HBaseColumn(family = "0", qualifier = "TELEFONE")
  private String telefone;

  public Teste() {
  }
  
  public Teste(String nome, String telefone) {
    this.nome = nome;
    this.telefone = telefone;
  }

  public Teste(String string) {
    this.nome = string;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  @Override
  public String toString() {
    return "Teste [id=" + id + ", nome=" + nome + ", telefone=" + telefone + "]";
  }
  
}
