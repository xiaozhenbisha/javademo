package com.atguigu.java;

/*
一：多态：一类事物的多种表现形态。   人 - 男人  女人    动物 - 小猫 小狗

1. 多态的体现：①方法的重载与重写  ②对象的多态性

2. 对象的多态性： 父类的引用指向子类的对象

        Java 程序的运行分为两种状态：
                在多态的情况下
               编译时：“看左边”，看的父类的引用。 （父类中不具备子类特有的方法）
               运行时：“看右边”，看的是子类对象。（实际运行的是子类重写父类的方法）

                    —————————— 虚拟方法调用（动态绑定）

3. 引用数据类型之间的转换：
前提：要有继承关系
向上转型：子类转父类。 系统自动完成
向下转型：父类转子类。 需要使用强转符“(需要转换的类型)”
            可能引发  ClassCastException
 */
public class PolymorphismTest1 {

    public static void main(String[] args) {
        /*Man man = new Man(); //本态
        man.eat();
        man.sleep();
        man.smoking();*/

        Person1 p = new Man(); //多态 - 向上转型
        p.eat();
        p.sleep();

        //p.smoking();

        //Man man = (Man)p; //向下转型
        //man.smoking();

        //Woman woman = (Woman)p;//编译： YES  运行？ NO
    }

}

class Person1{

    String name;
    int age;

    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }

}

class Man extends Person1{

    boolean mustache; //是否有胡子

    public void eat(){
        System.out.println("男人吃饭狼吞虎咽");
    }

    public void sleep(){
        System.out.println("男人坐着睡");
    }

    //特有的功能
    public void smoking(){
        System.out.println("男人爱抽烟");
    }
}

class Woman extends Person1{

    boolean beauty;

    public void eat(){
        System.out.println("女人吃饭细嚼慢咽");
    }

    public void sleep(){
        System.out.println("女人优美的睡觉");
    }

    //特有的功能
    public void shopping(){
        System.out.println("女人爱购物");
    }

}