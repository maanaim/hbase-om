package org.hbaseom.mapper;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.hadoop.hbase.util.Bytes;

public class HBaseConversor {
  
  public static String convertBytesToString(byte[] value) {
    return value == null ? null : Bytes.toString(value);
  }
  
  public static Integer convertBytesToInt(byte[] value) {
    String newValue = convertBytesToString(value);
    return newValue != null ? Integer.parseInt(newValue) : null;
  }
  
  public static Long convertBytesToLong(byte[] value) {
    String newValue = convertBytesToString(value);
    return newValue != null ? Long.parseLong(newValue) : null;
  }

  public static BigDecimal convertBytesToBigDecimal(byte[] value) {
    String newValue = convertBytesToString(value);
    return newValue != null ? new BigDecimal(newValue) : null;
  }

  public static Date convertBytesToDate(byte[] value) {
    String dataTxt = convertBytesToString(value);
    Date newDate = null;
    if (dataTxt != null) {
      DateFormat df = new SimpleDateFormat(HBaseFormat.DATE.getFormat());
      try {
        newDate = df.parse(dataTxt);
      } catch (ParseException e) {
        e.printStackTrace();
      }
    }
    return newDate;
  }

  public static Date convertBytesToDateTime(byte[] value) {
    String dataTxt = convertBytesToString(value);
    Date newDate = null;
    if (dataTxt != null) {
      DateFormat df = new SimpleDateFormat(HBaseFormat.DATETIME.getFormat());
      try {
        newDate = df.parse(dataTxt);
      } catch (ParseException e) {
        e.printStackTrace();
      }
    }
    return newDate;
  }
  
  public static byte[] convertStringToBytes(String value) {
    return Bytes.toBytes(value);
  }
  
}
