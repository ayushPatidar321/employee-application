package com.example.demo.exception;

public class NoDocumentFoundException extends Exception {
    public NoDocumentFoundException(String message) {
        super(message);
    }
}