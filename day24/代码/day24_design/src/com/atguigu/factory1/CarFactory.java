package com.atguigu.factory1;
/*
    功能：生成汽车
 */
public class CarFactory {

    public Car getCar(String name){
        if(name.equals("audia4"))
            return new AudiA4L();
        else if(name.equals("audia6"))
            return new AudiA6();
        return null;
    }
}
