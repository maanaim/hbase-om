package io.github.maanaim.hbaseom.converter;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;

import io.github.maanaim.hbaseom.mapper.HBaseFormat;

public class HBaseRowKeyContextConversorTest {
  
  private IContextConversor ctx = new HBaseRowKeyContextConversor();

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
    assertEquals("1", ctx.convert(Date.class.getName(), "1".getBytes()));
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

}
