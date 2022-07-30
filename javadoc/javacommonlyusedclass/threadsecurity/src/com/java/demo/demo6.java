package com.java.demo;

/**
 *  此类用于演示  死锁
 */
public class demo6 {
    public static void main(String[] args) {
        Thread01 t1=new Thread01();
        t1.start();

        synchronized ("yyy"){
            System.out.println("yyy");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("进入到了yyy这把锁");
            synchronized ("xxx"){
                System.out.println("这是yyy中的xxx锁");
            }
        }
    }
}
class Thread01 extends Thread{
    @Override
    public void run() {
        synchronized ("xxx"){
            System.out.println("xxxx");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("进入到了xxx这把锁");
            //yyy锁是在xxx内部的，导致yyy执行不完毕，xxx也执行不完毕
            synchronized ("yyy"){
                System.out.println("这是xxx中的yyy锁");
            }
        }
    }
}

