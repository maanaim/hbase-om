package io.github.maanaim.hbaseom.converter.strategy;

import io.github.maanaim.hbaseom.mapper.HBaseConversor;
import io.github.maanaim.hbaseom.mapper.HBaseFormat;

public class StringConversor implements IConversor {

  @Override
  public Object convert(byte[] value, HBaseFormat format) {
    switch (format) {
    case LOWER_CASE :
      return HBaseConversor.convertBytesToStringLowerCase(value);
    case UPPER_CASE :
      return HBaseConversor.convertBytesToStringUpperCase(value);
    case LOWER_CAMEL_CASE :
      return HBaseConversor.convertBytesToStringLowerCamelCase(value);
    case UPPER_CAMEL_CASE :
      return HBaseConversor.convertBytesToStringUpperCamelCase(value);
    default:
      return HBaseConversor.convertBytesToString(value);
    }
  }

}
