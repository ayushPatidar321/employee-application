package com.example.demo.exception;

public class ApplicationNotFoundException extends Exception{
    public ApplicationNotFoundException(String msg){
        super(msg);
    }
}
