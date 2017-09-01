package io.github.maanaim.hbaseom.converter.strategy;

import io.github.maanaim.hbaseom.mapper.HBaseFormat;

public interface IConversor {
  
  public abstract Object convert(byte[] value, HBaseFormat format);

}
