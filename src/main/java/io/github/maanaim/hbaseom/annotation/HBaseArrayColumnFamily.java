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
     * @var String family
     * */
    String family();

    /**
     * The type to convert qualifier value
     * */
    String qualifierType() default "String";

    /**
     * Main format to convert the qualifier data
     *
     * @var io.github.maanaim.hbaseom.mapper.HBaseFormat
     * */
    HBaseFormat qualifierFormat() default HBaseFormat.DEFAULT;

    /**
     * The type to convert the value
     * */
    String valueType() default "String";

    /**
     * Main format to convert the value data
     *
     * @var io.github.maanaim.hbaseom.mapper.HBaseFormat
     * */
    HBaseFormat valueFormat() default HBaseFormat.DEFAULT;

}
