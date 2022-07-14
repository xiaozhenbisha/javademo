package com.atguigu.factory2;

public class X5Factory implements CarFactory {
    @Override
    public Car getCar() {
        return new X5();
    }
}
