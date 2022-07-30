package com.java.demo;

/**
 * 此类用于演示的是  通过同步方法解决安全问题
 *     1、 原理依然是将处理共享资源的代码锁起来(而是放到一个独立的方法中)
 *         a. 创建一个同步方法
 *              public synchronized boolean sell(){需要上锁的代码}
 *                  public synchronized boolean sell(){}  锁对象是this(在继承方式中是不同对象)
 *                  public static synchronized boolean sell(){}   锁对象是this.getClass()
 *     2. 练习：
 *         解决卖票的线程安全问题
 */
public class Demo4 {

    public static void main(String[] args) {
        /*Sell03 sell1=new Sell03();
        sell1.start();
        Sell03 sell2=new Sell03();
        sell2.start();
        Sell03 sell3=new Sell03();
        sell3.start();*/

        //实现接口的方式创建的线程可以更好的处理共享资源
        Sell04 sell=new Sell04();

        Thread t1=new Thread(sell);
        t1.start();
        Thread t2=new Thread(sell);
        t2.start();
        Thread t3=new Thread(sell);
        t3.start();

    }
}

//以下两种方式都存在线程安全问题(下午主要讲解，如何处理线程安全)
class Sell03 extends Thread{
    private static int num=10000;

    @Override
    public void run() {
        while(true){
//            System.out.println("进入到售票大厅，量体温、检查出入证、看健康宝");
            boolean flag = sell();
            if(flag){
                return;
            }

//            System.out.println("打印车票，给乘客");

        }
    }
    /*
        三个线程，看谁先执行到sell方法，谁先执行sell方法，谁就有权利全部执行完
            方法中的代码全部锁住(锁还在，知识不需要我们指定)
                public synchronized boolean sell(){}  锁对象是this(在继承方式中是不同对象)
                public static synchronized boolean sell(){}   锁对象是this.getClass()
            千万不要把循环放到锁里面，为什么？肯定是一个线程执行完
         sell方法中的return是结束谁的？目的：结束run方法，但是现在的代码是结束sell方法的
     */
    public static synchronized boolean sell(){
        //1. 判断票数量是否满足本次销售
        if(num<=0){
            return true;//结束run方法
        }
        //2. 票数的减少
        num--;
        //3. 告知结果
        System.out.println(Thread.currentThread().getName()+"卖出去了1张票，剩余:"+num);
        return false;
    }
}

class Sell04 implements Runnable{
    private int num=100;
    @Override
    public void run() {
        while(true){
            boolean flag = sell();
            if(flag){
                return;
            }
        }
    }
    public synchronized boolean sell(){//没有加static
        if(num<=0){
            return true;
        }
        num--;
        System.out.println(Thread.currentThread().getName()+"卖出去了1张票，剩余:"+num);
        return false;
    }
}

