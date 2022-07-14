package com.atguigu.review;

public class DefaultMethodTest {

    public static void main(String[] args) {
        SubClass sc = new SubClass();
        //若接口中与父类中具有相同方法签名的方法时，默认为类优先原则，接口中的默认方法会被忽略
        sc.show();

        MyInterface.test();
    }

}

interface MyInterface{

    default void show(){
        System.out.println("接口中的默认方法");
    }

    public static void test(){
        System.out.println("接口中的静态方法");
    }
}

interface MyFun{

    default  void show(){
        System.out.println("MyFun 接口中的默认方法");
    }

}

class MySuperClass{

    public void show(){
        System.out.println("父类中的方法");
    }

}

class SubClass /*extends MySuperClass*/ implements MyInterface, MyFun{
    @Override
    public void show() {
        MyFun.super.show();
    }
}