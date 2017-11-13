package io.github.maanaim.hbaseom.converter.exceptions;

public class WrongAttributeTypeException extends Exception {

    public WrongAttributeTypeException(String mustBe, String sent ) {
        super(
                "The attribute type must be [ " + mustBe + "] but was sent [ " + sent + " ]! "
        );
    }

}
