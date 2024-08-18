package com.example.demo.exception;

public class InvalidRequestException  extends Exception{
    public InvalidRequestException(String msg){
        super(msg);
    }
}
