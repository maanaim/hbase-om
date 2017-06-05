package io.github.maanaim.hbaseom.mapper;

public enum HBaseFormat {
  
  DEFAULT(""),
  
  DATETIME("yyyy-MM-dd HH:mm:ss"),
  
  DATE("yyyy-MM-dd");
  
  private String format;
  
  private HBaseFormat(String format) {
    this.format = format;
  }

  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }
  
}
