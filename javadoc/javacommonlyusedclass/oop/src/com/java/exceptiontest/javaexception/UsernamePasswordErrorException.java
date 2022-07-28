package com.java.exceptiontest.javaexception;

public class UsernamePasswordErrorException extends RuntimeException {
    public UsernamePasswordErrorException(){

    }

    public UsernamePasswordErrorException(String message){
        super(message);
    }

}
