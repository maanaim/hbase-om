package io.github.maanaim.hbaseom;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import io.github.maanaim.hbaseom.converter.HBaseColumnContextConversorTest;
import io.github.maanaim.hbaseom.converter.HBaseRowKeyContextConversorTest;
import io.github.maanaim.hbaseom.converter.strategy.BigDecimalConversorTest;
import io.github.maanaim.hbaseom.converter.strategy.DateConversorTest;
import io.github.maanaim.hbaseom.converter.strategy.IntegerConversorTest;
import io.github.maanaim.hbaseom.converter.strategy.LongConversorTest;
import io.github.maanaim.hbaseom.converter.strategy.StringConversorTest;

@RunWith(Suite.class)
@SuiteClasses({ 
  BigDecimalConversorTest.class, 
  IntegerConversorTest.class, 
  LongConversorTest.class,
  DateConversorTest.class,
  StringConversorTest.class,
  HBaseColumnContextConversorTest.class,
  HBaseRowKeyContextConversorTest.class
  })
public class AllTests {

}
