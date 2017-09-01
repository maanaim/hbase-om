package io.github.maanaim.hbaseom.converter.strategy;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import io.github.maanaim.hbaseom.mapper.HBaseFormat;

public class BigDecimalConversorTest {
  
  private IConversor c = new BigDecimalConversor();

  @Test
  public void test() {
    assertEquals(null, c.convert(null, HBaseFormat.DEFAULT));
  }

  @Test
  public void test2() {
    assertEquals(null, c.convert("".getBytes(), HBaseFormat.DEFAULT));
  }

  @Test
  public void test3() {
    assertEquals(new BigDecimal(3), c.convert("3".getBytes(), HBaseFormat.DEFAULT));
  }

  @Test
  public void test4() {
    assertEquals(new BigDecimal("3.0"), c.convert("3.0".getBytes(), HBaseFormat.DEFAULT));
  }

  @Test
  public void test5() {
    assertEquals(null, c.convert("xpto".getBytes(), HBaseFormat.DEFAULT));
  }

  @Test
  public void test6() {
    assertEquals(null, c.convert("xpto".getBytes(), HBaseFormat.LOWER_CASE));
  }

  @Test
  public void test7() {
    assertEquals(null, c.convert("xpto".getBytes(), HBaseFormat.UPPER_CASE));
  }

  @Test
  public void test8() {
    assertEquals(null, c.convert("xpto".getBytes(), HBaseFormat.DATETIME));
  }

  @Test
  public void test9() {
    assertEquals(null, c.convert("xpto".getBytes(), HBaseFormat.DATE));
  }

  @Test
  public void test10() {
    assertEquals(new BigDecimal("3.0"), c.convert("3.0".getBytes(), HBaseFormat.DATE));
  }

}
