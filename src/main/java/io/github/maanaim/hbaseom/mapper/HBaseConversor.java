package io.github.maanaim.hbaseom.mapper;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.hadoop.hbase.util.Bytes;
import org.apache.log4j.Logger;

public class HBaseConversor {
  
  private static final Logger LOGGER = Logger.getLogger(HBaseConversor.class);
  
  public static String convertBytesToString(byte[] value) {
    return value == null ? null : Bytes.toString(value);
  }
  
  public static Integer convertBytesToInt(byte[] value) {
    Integer result = null;
    String txtValue = convertBytesToString(value);
    if (txtValue != null) {
      try {
        result = Integer.parseInt(txtValue);
      } catch (NumberFormatException e) {
        LOGGER.warn("Cannot convert '" + txtValue + "' to java.lang.Integer", e);
      }
    }
    
    return result;
  }
  
  public static Long convertBytesToLong(byte[] value) {
    Long result = null;
    String txtValue = convertBytesToString(value);
    if (txtValue != null) {
      try {
        result = Long.parseLong(txtValue);
      } catch (NumberFormatException e) {
        LOGGER.warn("Cannot convert '" + txtValue + "' to java.lang.Long", e);
      }
    }
    
    return result;
  }

  public static BigDecimal convertBytesToBigDecimal(byte[] value) {
    BigDecimal result = null;
    String txtValue = convertBytesToString(value);
    if (txtValue != null) {
      try {
        result = new BigDecimal(txtValue);
      } catch (NumberFormatException e) {
        LOGGER.warn("Cannot convert '" + txtValue + "' to java.math.BigDecimal", e);
      }
    }
    
    return result;
  }
  
  public static Date convertBytesToDate(byte[] value) {
    return convertDate(value, HBaseFormat.DATE);
  }
  
  public static Date convertBytesToDateTime(byte[] value) {
    return convertDate(value, HBaseFormat.DATETIME);
  }

  private static Date convertDate(byte[] value, HBaseFormat format) {
    String txtValue = convertBytesToString(value);
    Date result = null;
    if (txtValue != null) {
      DateFormat dateFormat = new SimpleDateFormat(format.getFormat());
      try {
        result = dateFormat.parse(txtValue);
      } catch (ParseException e) {
        LOGGER.warn("Cannot convert '" + txtValue + "' to java.util.Date using '" + format.getFormat() + 
            "' format.", e);
      }
    }
    return result;
  }

  public static byte[] convertStringToBytes(String value) {
    return Bytes.toBytes(value);
  }
  
}
