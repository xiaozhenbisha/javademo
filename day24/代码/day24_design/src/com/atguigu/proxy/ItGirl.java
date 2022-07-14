package com.atguigu.proxy;

public class ItGirl implements People {
    @Override
    public void buyHouse() {
        System.out.println("直接买，并全款，不讲价");
    }
}
