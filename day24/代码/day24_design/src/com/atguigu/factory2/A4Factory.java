package com.atguigu.factory2;

public class A4Factory implements CarFactory {
    @Override
    public Car getCar() {
        return new AudiS4();
    }
}
