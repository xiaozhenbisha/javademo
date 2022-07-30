package com.java.demo;

/**
 *  此类用于演示的是  通过同步代码块处理线程安全问题
 *     原理：让卖票的三个步骤，一个线程具有整个的执行权力
 *           将一些关键代码(处理共享资源的代码)，锁起来(防止一个线程在运行关键代码的时候，有其他线程也来运行，造成数据的错误)
 *     如何锁：
 *       1. 同步代码块
 *         语法： synchronized(锁对象){需要上锁的代码}
 *                锁对象：可以是任意对象(要求：互斥的线程对于锁对象要求必须是同一个)  ★
 *                 锁对象：   this    this.getClass() -- 获得当前对象的类加载信息(一个类只能加载一次)
 *                     对于继承方式不能用this(因为不是同一个)   this.getClass()
 *                     也可以使用一个常量(String对象)    "abc"
 *       问题：
 *         1. 一个线程在抢到时间片以后，在执行的同时也还在抢占cpu使用权么？ 不会
 *         2. this.getClass()获得的不是一个类的加载信息么？它也是一个对象么？ 是一个对象！Class类的对象(反射会讲Class类)
 */
public class Demo3 {
    public static void main(String[] args) {
       /* Sell01 sell1=new Sell01();
        Sell01 sell2=new Sell01();
        Sell01 sell3=new Sell01();

        sell1.start();
        sell2.start();
        sell3.start();*/

        //实现接口的方式创建的线程可以更好的处理共享资源
        Sell02 sell=new Sell02();

        Thread t1=new Thread(sell);
        t1.start();
        Thread t2=new Thread(sell);
        t2.start();
        Thread t3=new Thread(sell);
        t3.start();

    }
}

//以下两种方式都存在线程安全问题(下午主要讲解，如何处理线程安全)
class Sell01 extends Thread{
    private static int num=50;

    @Override
    public void run() {
        while(true){
//            System.out.println("进入到售票大厅，量体温、检查出入证、看健康宝");
            synchronized (this){//"java"对于三个线程是同一个对象
                //1. 判断票数量是否满足本次销售
                if(num<=0){
                    return;
                }
                //sleep只是为了加大空隙，对线程安全没有实质的影响   都是同一个窗口卖的
                //不是加睡眠了吗？加睡眠不就是为了让其他线程能抢到吗？
                //此时的睡眠时加在锁里面了，其他的线程也抢不到
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //2. 票数的减少
                num--;
                //3. 告知结果
                System.out.println(Thread.currentThread().getName()+"卖出去了1张票，剩余:"+num);
            }


//            System.out.println("打印车票，给乘客");

        }
    }
}

class Sell02 implements Runnable{
    private int num=100;
    @Override
    public void run() {
        while(true){
            synchronized (this.getClass()){
                if(num<=0){
                    return;
                }
                num--;
                System.out.println(Thread.currentThread().getName()+"卖出去了1张票，剩余:"+num);
            }

        }
    }
}

