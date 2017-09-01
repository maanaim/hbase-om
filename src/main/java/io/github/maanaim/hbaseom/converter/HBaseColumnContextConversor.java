package io.github.maanaim.hbaseom.converter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import io.github.maanaim.hbaseom.converter.strategy.BigDecimalConversor;
import io.github.maanaim.hbaseom.converter.strategy.DateConversor;
import io.github.maanaim.hbaseom.converter.strategy.IConversor;
import io.github.maanaim.hbaseom.converter.strategy.IntegerConversor;
import io.github.maanaim.hbaseom.converter.strategy.LongConversor;
import io.github.maanaim.hbaseom.converter.strategy.StringConversor;

public class HBaseColumnContextConversor extends AbstractContextConversor {
  
  @Override
  public Map<String, IConversor> getMapConversors() {
    Map<String, IConversor> context = new HashMap<>();
    context.put(Integer.class.getName(), new IntegerConversor());
    context.put(String.class.getName(), new StringConversor());
    context.put(Date.class.getName(), new DateConversor());
    context.put(Long.class.getName(), new LongConversor());
    context.put(BigDecimal.class.getName(), new BigDecimalConversor());
    
    return context;
  }

}
