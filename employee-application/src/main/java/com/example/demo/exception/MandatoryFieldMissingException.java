package com.example.demo.exception;

public class MandatoryFieldMissingException extends Exception {
    public MandatoryFieldMissingException(String msg) {
        super(msg);
    }
}
