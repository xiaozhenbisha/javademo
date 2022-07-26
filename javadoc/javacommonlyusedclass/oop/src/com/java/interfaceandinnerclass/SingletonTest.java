package com.java.interfaceandinnerclass;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();

        System.out.println(s1 == s2);
    }
}

//饿汉式
class Singleton{
    //2. 类的内部创建对象
    private static Singleton instance = new Singleton();

    //1. 构造器私有化
    private Singleton(){

    }

    //3. 提供公共的get方法
    public static Singleton getInstance(){
        return instance;
    }
}

//懒汉式(多线程安全问题)
class Singleton1{

    //2.
    private static Singleton1 instance = null;

    //1.
    private Singleton1(){

    }

    //3.
    public static Singleton1 getInstance(){
        if(instance == null){
            instance = new Singleton1();
        }

        return instance;
    }

}

