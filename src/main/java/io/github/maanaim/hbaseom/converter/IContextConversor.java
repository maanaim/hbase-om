package io.github.maanaim.hbaseom.converter;

import io.github.maanaim.hbaseom.mapper.HBaseFormat;

public interface IContextConversor {
  
  public abstract Object convert(String clazz, byte[] value, HBaseFormat format);

  public abstract Object convert(String clazz, byte[] value);

}
