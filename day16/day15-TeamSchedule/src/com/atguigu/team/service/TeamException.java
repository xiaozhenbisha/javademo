package com.atguigu.team.service;

/**
* 自定义异常
* @author Hefei Li
* 2020/6/12 16:02
*/
public class TeamException extends Exception{

    public TeamException(){

    }

    public TeamException(String message){
        super(message);
    }

}
