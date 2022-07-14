package com.atguigu.proxy;

public class Test1 {
    public static void main(String[] args) {
        //代理模式   主要是代理工作
        //有一些功能，只需要交给代理去完成(准备工作和收尾功能)
        //如何提高代码的复用性
        //静态代理    动态代理(难度系数比较高)

        //中介(代理)   目标客户

        //1. 静态代理

        //1. 被代理对象
        ItBoy itBoy=new ItBoy();
        //2. 创建代理对象
        PeopleProxy proxy=new PeopleProxy(itBoy);//张三
        //3. 买房
        proxy.buyHouse();


        ItGirl itGirl=new ItGirl();
        PeopleProxy proxy1=new PeopleProxy(itGirl);//李四
        proxy1.buyHouse();




    }
}
