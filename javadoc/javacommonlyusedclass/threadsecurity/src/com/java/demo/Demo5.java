package com.java.demo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 此类用于演示的是  Lock锁解决线程安全问题
 *     1. 还是关键代码上锁
 *         a. 创建lock锁对象 (多个互斥线程对于lock锁必须是同一个)
 *             Lock lock=new ReentrantLock();
 *         b. 上锁
 *             在需要上锁代码的上方调用   lock.lock()
 *         c. 释放锁
 *             在需要上锁代码的最末尾调用   lock.unlock();
 *     2. 发现程序没有运行完！不是死循环，是类似死锁！(一定要避免死锁)
 */
public class Demo5 {
    public static void main(String[] args) {
        /*Sell05 sell1=new Sell05();
        sell1.start();
        Sell05 sell2=new Sell05();
        sell2.start();
        Sell05 sell3=new Sell05();
        sell3.start();*/

        //实现接口的方式创建的线程可以更好的处理共享资源
        Sell06 sell=new Sell06();

        Thread t1=new Thread(sell);
        t1.start();
        Thread t2=new Thread(sell);
        t2.start();
        Thread t3=new Thread(sell);
        t3.start();

    }
}

//以下两种方式都存在线程安全问题(下午主要讲解，如何处理线程安全)
class Sell05 extends Thread{
    private static int num=100;

    //1. 锁对象的创建 ★★
    private static Lock lock=new ReentrantLock();

    @Override
    public void run() {
        while(true){

            //2. 上锁 ★★
            lock.lock();  //如果我们把 if 判断语句放lock()上面呢?  这样会导致线程不安全！！
            try {
                if(num<=0){
                    return;
                }
                num--;
                System.out.println(Thread.currentThread().getName()+"卖出去了1张票，剩余:"+num);
            }finally {
                //3. 释放锁 ★★
                lock.unlock();
            }

        }
    }
}

class Sell06 implements Runnable{
    private int num=100;
    private Lock lock=new ReentrantLock();
    @Override
    public void run() {
        while(true){
            try {
                lock.lock();
                if(num<=0){
                    return;
                }
                num--;
                System.out.println(Thread.currentThread().getName()+"卖出去了1张票，剩余:"+num);
            }finally {
                lock.unlock();
            }

        }
    }
}

