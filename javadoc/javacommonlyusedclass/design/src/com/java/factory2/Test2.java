package com.java.factory2;

public class Test2 {
    public static void main(String[] args) {
        //工厂方法   主要就是解决简单工厂中对新增功能的开闭原则问题
        //1. 先创建A4的工厂
        CarFactory factory=new A4Factory();
        //2. 通过工厂去获得对象
        Car car = factory.getCar();
        car.running();

        //①  换代   A4---S4
        //②  新增   x5
        //  永远都是新增代码，没有去修改过之前的代码(遵守了开闭原则)
        CarFactory factory1=new X5Factory();
        Car car1 = factory1.getCar();//多态的知识点   Car car=new X5();
        car1.running();
    }
}
