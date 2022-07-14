package com.atguigu.java;

public class UsernamePasswordErrorException extends RuntimeException{

    public UsernamePasswordErrorException(){

    }

    public UsernamePasswordErrorException(String message){
        super(message);
    }

}
