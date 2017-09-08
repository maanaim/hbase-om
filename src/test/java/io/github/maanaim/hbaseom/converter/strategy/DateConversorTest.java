package io.github.maanaim.hbaseom.converter.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.maanaim.hbaseom.mapper.HBaseFormat;

public class DateConversorTest {
  
  private IConversor c = new DateConversor();

  @Test
  public void test() {
    assertEquals(null, c.convert(null, HBaseFormat.DATE));
  }

  @Test
  public void test2() {
    assertEquals(null, c.convert("".getBytes(), HBaseFormat.DATE));
  }

  @Test
  public void test3() {
    assertEquals("Thu Aug 31 09:00:00 BRT 2017", c.convert("2017-08-31 09:00:00".getBytes(), HBaseFormat.DATETIME).toString());
  }

  @Test
  public void test4() {
    assertEquals("Thu Aug 31 00:00:00 BRT 2017", c.convert("2017-08-31 09:00:00".getBytes(), HBaseFormat.DATE).toString());
  }

  @Test
  public void test5() {
    assertEquals(null, c.convert("xpto".getBytes(), HBaseFormat.DATE));
  }

  @Test
  public void test6() {
    assertEquals(null, c.convert("xpto".getBytes(), HBaseFormat.DATETIME));
  }

  @Test
  public void test7() {
    assertEquals("Thu Aug 31 09:00:00 BRT 2017", c.convert("2017-08-31 09:00:00.000".getBytes(), HBaseFormat.DATETIME).toString());
  }

  @Test
  public void test8() {
    assertEquals("Wed Aug 30 23:59:59 BRT 2017", c.convert("2017-08-30 23:59:59.999".getBytes(), HBaseFormat.DATETIME).toString());
  }

  @Test
  public void test9() {
    assertEquals("Wed Aug 11 00:00:00 BRT 1982", c.convert("1982-08-11 00:00:00.000".getBytes(), HBaseFormat.DATETIME).toString());
  }
}
