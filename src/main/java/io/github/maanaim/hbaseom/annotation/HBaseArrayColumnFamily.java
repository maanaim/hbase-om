package io.github.maanaim.hbaseom.annotation;

import io.github.maanaim.hbaseom.mapper.HBaseFormat;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation must be used when the column family uses the qualifier dynamically, so the column family will be
 * an array as key/value
 * */
@Retention(RetentionPolicy.RUNTIME)
@Target(value= ElementType.FIELD)
public @interface HBaseArrayColumnFamily {

    /**
     * String used to load the column family
     *
     * String family
     *
     * @return String
     * */
    String family();

    /**
     * The type to convert qualifier value
     *
     * @return String
     * */
    String qualifierType() default "String";

    /**
     * Main format to convert the qualifier data
     *
     * io.github.maanaim.hbaseom.mapper.HBaseFormat
     *
     * @return HBaseFormat
     * */
    HBaseFormat qualifierFormat() default HBaseFormat.DEFAULT;

    /**
     * The type to convert the value
     *
     * @return String
     * */
    String valueType() default "String";

    /**
     * Main format to convert the value data
     *
     * io.github.maanaim.hbaseom.mapper.HBaseFormat
     *
     * @return HBaseFormat
     * */
    HBaseFormat valueFormat() default HBaseFormat.DEFAULT;

}
