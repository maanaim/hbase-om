package io.github.maanaim.hbaseom.converter;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;

import io.github.maanaim.hbaseom.mapper.HBaseFormat;

public class HBaseColumnContextConversorTest {
  
  private IContextConversor ctx = new HBaseColumnContextConversor();

  @Test
  public void test() {
    assertEquals(1, ctx.convert(Integer.class.getName(), "1".getBytes()));
  }
  
  @Test
  public void test2() {
    assertEquals(new BigDecimal("1.0"), ctx.convert(BigDecimal.class.getName(), "1.0".getBytes(), HBaseFormat.DEFAULT));
  }
  
  @Test
  public void test3() {
    assertEquals(null, ctx.convert(Date.class.getName(), "1".getBytes()));
  }

  @Test
  public void test4() {
    assertEquals(74343929203043043l, ctx.convert(Long.class.getName(), "74343929203043043".getBytes()));
  }
  
  @Test
  public void test5() {
    assertEquals(null, ctx.convert(Long.class.getName(), "txt".getBytes()));
  }

  @Test
  public void test6() {
    assertEquals(null, ctx.convert(Integer.class.getName(), "txt".getBytes()));
  }
  
  @Test
  public void test7() {
    assertEquals("txt", ctx.convert(String.class.getName(), "txt".getBytes()));
  }
  
  @Test
  public void test8() {
    assertEquals("Thu Aug 31 09:00:00 BRT 2017", ctx.convert(Date.class.getName(), "2017-08-31 09:00:00".getBytes(), HBaseFormat.DATETIME).toString());
  }
  
  @Test
  public void test9() {
    assertEquals("Thu Aug 31 00:00:00 BRT 2017", ctx.convert(Date.class.getName(), "2017-08-31 00:00:00".getBytes(), HBaseFormat.DATETIME).toString());
  }


}
