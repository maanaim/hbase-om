package com.andersonlfeitosa.framework.bigdata.hbase.om.annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.andersonlfeitosa.framework.bigdata.hbase.om.mapper.HBaseFormat;

@Retention(RetentionPolicy.RUNTIME)
@Target(value=ElementType.FIELD)
public @interface HBaseColumn {

  String family();
  
  String qualifier();
  
  HBaseFormat format() default HBaseFormat.DEFAULT;
  
}
