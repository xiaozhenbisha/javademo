package com.atguigu.proxy;
/*
    目标客户(被代理的对象)
 */
public class ItBoy implements People {
    @Override
    public void buyHouse() {
        System.out.println("1.我看上这个房子了，2. 我付钱买这个房子");
    }
}
