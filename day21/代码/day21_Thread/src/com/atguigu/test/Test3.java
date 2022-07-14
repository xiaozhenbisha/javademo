package com.atguigu.test;
/*
创建两个线程，第一个线程用第一种创建方式，第二个线程用第二种，分别为其设置线程名字
            同时启动
 */
public class Test3 {

    public static void main(String[] args) {
        Thread01 t1=new Thread01("第一个线程");
        Thread02 t=new Thread02();
        Thread t2=new Thread(t,"第二个线程");

        t1.start();
        t2.start();
        System.out.println(t1.getName());
        System.out.println(t2.getName());
    }
}

class Thread02 implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("*****"+i);
        }
    }
}

class Thread01 extends Thread{
    public Thread01(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("-----"+i);
        }
    }
}
