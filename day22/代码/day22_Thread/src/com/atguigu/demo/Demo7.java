package com.atguigu.demo;
/*
   此类用于演示    守护线程(了解)   gc就是一个守护线程
    1. 守护线程，守护其他的线程，(其他线程如果执行完毕了，守护线程没有执行完毕也会结束)
 */
public class Demo7 {
    public static void main(String[] args)  {
        Thread12 t1=new Thread12();
        t1.start();
        Thread13 t2=new Thread13();//将t3设置为守护线程
        //1. 如何设置守护线程,一定要在启动线程之前设置
        t2.setDaemon(true);
        t2.start();
        for (int i = 0; i <5 ; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("main---"+i);
        }
    }
}
class Thread12 extends  Thread{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread12---"+i);
        }
    }
}
class Thread13 extends  Thread{
    @Override
    public void run() {
        for (int i = 0; i <15 ; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread13---"+i);
        }
    }
}
