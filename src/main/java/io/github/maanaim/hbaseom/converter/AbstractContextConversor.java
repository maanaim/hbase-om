package io.github.maanaim.hbaseom.converter;

import java.util.Map;

import io.github.maanaim.hbaseom.converter.strategy.IConversor;
import io.github.maanaim.hbaseom.converter.strategy.StringConversor;
import io.github.maanaim.hbaseom.mapper.HBaseFormat;

public abstract class AbstractContextConversor implements IContextConversor {
  
  private Map<String, IConversor> context;
  
  public abstract Map<String, IConversor> getMapConversors();
  
  public AbstractContextConversor() {
    this.context = getMapConversors();
  }
  
  public Object convert(String clazz, byte[] value, HBaseFormat format) {
    IConversor conversor = context.getOrDefault(clazz, new StringConversor());
    return conversor.convert(value, format);
  }

  public Object convert(String clazz, byte[] value) {
    IConversor conversor = context.getOrDefault(clazz, new StringConversor());
    return conversor.convert(value, HBaseFormat.DEFAULT);
  }

}
