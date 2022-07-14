package com.atguigu.exer;

/*
在Frock类中声明私有的静态属性currentNum，初始值为100000，作为衣服出厂的序列号起始值。
声明公有的静态方法getNextNum，作为生成上衣唯一序列号的方法。每调用一次，将currentNum增加100，
并作为返回值。
在TestFrock类的main方法中，分两次调用getNextNum方法，获取序列号并打印输出。
在Frock类中声明serialNumber(序列号)属性，并提供对应的get方法；
在Frock类的构造器中，通过调用getNextNum方法为Frock对象获取唯一序列号；
在TestFrock类的main方法中，分别创建三个Frock 对象，并打印三个对象的序列号，验证是否为按100递增。

在Frock类中声明静态语句块，语句块中将currentNum的初始值设为150000，作为衣服出厂的序列号起始值，并打印输出该值。
执行TestFrock类的main方法，分别创建三个Frock 对象，验证静态语句块是否只执行一次，以及序列号起始值是否已调整。

 */
public class FrockExer {

    public static void main(String[] args) {
        /*System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());*/

        Frock f1 = new Frock();
        Frock f2 = new Frock();
        Frock f3 = new Frock();

        System.out.println(f1.getSerialNumber());
        System.out.println(f2.getSerialNumber());
        System.out.println(f3.getSerialNumber());
    }

}

class Frock{

    static{
        currentNum = 15000;
    }

    private static int currentNum = 10000;

    private int serialNumber;


    public Frock(){
        this.serialNumber = getNextNum();
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public static int getNextNum(){
        return currentNum += 100;
    }



}