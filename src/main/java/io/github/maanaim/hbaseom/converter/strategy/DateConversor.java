package io.github.maanaim.hbaseom.converter.strategy;

import io.github.maanaim.hbaseom.mapper.HBaseConversor;
import io.github.maanaim.hbaseom.mapper.HBaseFormat;

public class DateConversor implements IConversor {

  @Override
  public Object convert(byte[] value, HBaseFormat format) {
    switch (format) {
    case DATETIME:
      return HBaseConversor.convertBytesToDateTime(value);
    default:
      return HBaseConversor.convertBytesToDate(value);
    }
  }

}
