package io.github.maanaim.hbaseom.converter.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.maanaim.hbaseom.mapper.HBaseFormat;

public class StringConversorTest {
  
  private IConversor c = new StringConversor();

  @Test
  public void test() {
    assertEquals(null, c.convert(null, HBaseFormat.DEFAULT));
  }

  @Test
  public void test2() {
    assertEquals("", c.convert("".getBytes(), HBaseFormat.DEFAULT));
  }

  @Test
  public void test3() {
    assertEquals("3", c.convert("3".getBytes(), HBaseFormat.DEFAULT));
  }

  @Test
  public void test4() {
    assertEquals("3.0", c.convert("3.0".getBytes(), HBaseFormat.DEFAULT));
  }

  @Test
  public void test5() {
    assertEquals("xpto", c.convert("xpto".getBytes(), HBaseFormat.DEFAULT));
  }

  @Test
  public void test6() {
    assertEquals("xpto", c.convert("XPTO".getBytes(), HBaseFormat.LOWER_CASE));
  }

  @Test
  public void test7() {
    assertEquals("XPTO", c.convert("xpto".getBytes(), HBaseFormat.UPPER_CASE));
  }

  @Test
  public void test8() {
    assertEquals("xpto", c.convert("xpto".getBytes(), HBaseFormat.DATETIME));
  }

  @Test
  public void test9() {
    assertEquals("xpto", c.convert("xpto".getBytes(), HBaseFormat.DATE));
  }

  @Test
  public void test10() {
    assertEquals("3.0", c.convert("3.0".getBytes(), HBaseFormat.DATETIME));
  }
  
  @Test
  public void test11() {
    assertEquals(null, c.convert(null, HBaseFormat.UPPER_CASE));
  }

  @Test
  public void test12() {
    assertEquals(null, c.convert(null, HBaseFormat.LOWER_CASE));
  }
  
  @Test
  public void test13() {
    assertEquals("xptoOff", c.convert("XPTO OFF".getBytes(), HBaseFormat.LOWER_CAMEL_CASE));
  }

  @Test
  public void test14() {
    assertEquals("xptoOff", c.convert("Xpto Off".getBytes(), HBaseFormat.LOWER_CAMEL_CASE));
  }
  
  @Test
  public void test15() {
    assertEquals("xptoOff", c.convert("xpto off".getBytes(), HBaseFormat.LOWER_CAMEL_CASE));
  }

  @Test
  public void test16() {
    assertEquals("XptoOff", c.convert("XPTO OFF".getBytes(), HBaseFormat.UPPER_CAMEL_CASE));
  }

  @Test
  public void test17() {
    assertEquals("XptoOff", c.convert("Xpto Off".getBytes(), HBaseFormat.UPPER_CAMEL_CASE));
  }
  
  @Test
  public void test18() {
    assertEquals("XptoOff", c.convert("xpto off".getBytes(), HBaseFormat.UPPER_CAMEL_CASE));
  }
}
