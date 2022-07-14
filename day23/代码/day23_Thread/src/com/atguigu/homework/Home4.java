package com.atguigu.homework;
/*
单例模式（static）懒汉式(存在线程安全问题)、饿汉式
 */
public class Home4 {
}

//单例模式，只对外提供一个对象，讲单例模式的时候，没有讲枚举
//存在一个线程安全问题
class Singleton{//枚举
    private static Singleton singleton;
    private Singleton(){}
    /*
        ① 效率是比较低的(每次获得都需要判断锁资源)，实例化对象只有第一次才有用，
     */
    public static Singleton getSingleton(){
        if(singleton==null){
            //这个空隙，不存在线程安全问题
            synchronized ("java") {
                if(singleton==null)
                    //这个空隙
                    singleton=new Singleton();
            }
        }
        return singleton;
    }
}
