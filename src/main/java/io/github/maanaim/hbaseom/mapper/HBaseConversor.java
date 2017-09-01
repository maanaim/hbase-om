package io.github.maanaim.hbaseom.mapper;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.Collectors;

import org.apache.hadoop.hbase.util.Bytes;
import org.apache.log4j.Logger;

public class HBaseConversor {
  
  private static final Logger LOGGER = Logger.getLogger(HBaseConversor.class);
  
  public static String convertBytesToString(byte[] value) {
    return value == null ? null : Bytes.toString(value);
  }

  public static String convertBytesToStringUpperCase(byte[] value) {
    String result = convertBytesToString(value); 
    return result == null ? null : result.toUpperCase();
  }
  
  public static String convertBytesToStringUpperCamelCase(byte[] value) {
    String result = convertBytesToString(value);
    String resultUpperCamelCase = Arrays.stream(result.split("\\s")).
        map(String::toLowerCase).
        map(s-> s.substring(0, 1).toUpperCase() + s.substring(1)).
        collect(Collectors.joining());
    
    return result == null ? null : resultUpperCamelCase;
  }
  
  public static String convertBytesToStringLowerCase(byte[] value) {
    String result = convertBytesToString(value); 
    return result == null ? null : result.toLowerCase();
  }

  public static String convertBytesToStringLowerCamelCase(byte[] value) {
    String result = convertBytesToString(value);
    String resultLowerCamelCase = Arrays.stream(result.split("\\s")).
        map(String::toLowerCase).
        map(s-> s.substring(0, 1).toUpperCase() + s.substring(1)).
        collect(Collectors.joining());
    resultLowerCamelCase = resultLowerCamelCase.substring(0, 1).toLowerCase() + resultLowerCamelCase.substring(1);
    
    return result == null ? null : resultLowerCamelCase;
  }

  public static Integer convertBytesToInt(byte[] value) {
    Integer result = null;
    String txtValue = convertBytesToString(value);
    if (txtValue != null) {
      try {
        result = new BigDecimal(txtValue).intValue();
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
        result = new BigDecimal(txtValue).longValue();
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
