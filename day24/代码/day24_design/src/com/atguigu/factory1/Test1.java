package com.atguigu.factory1;

import sun.security.smartcardio.SunPCSC;

public class Test1 {
    public static void main(String[] args) {
        //简单工厂(在新增功能时，违反了开闭原则)   获得一些内容(对象)，可以采用工厂模式
        Car car=new AudiA4L();//没有工厂模式会这样去获得对象   1万个位置这样去获得对象
        car.run();
        //在开发第二个版本的时候
        //1. 换代  AudiA4 --> AudiA4L        没有工厂模式(1万个地方就需要手动去修改)
        //2. 新增  AudiA6   才存在开闭原则   违反了开闭原则(你去修改CarFactory类中的代码了)
        CarFactory factory=new CarFactory();
        //简单工厂
        Car car1=factory.getCar("audia4");  //1万个地方都是这样获得
        car1.run();

        Car car2=factory.getCar("audia6");
        car2.run();
    }
}
