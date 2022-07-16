package cn.ybzy.demo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest4 {
    public static void main(String[] args) {
        SychronizedThread4 st = new SychronizedThread4();
        //创建并开启4个线程来卖100张票
        new Thread(st, "线程1").start();
        new Thread(st, "线程2").start();
        new Thread(st, "线程3").start();
        new Thread(st, "线程4").start();
    }
}

class SychronizedThread4 implements Runnable {
    //定义在这里的属性是所有线程共享的变量数据
    private int ticketNumber = 100; //总共100张票
    Lock lock = new ReentrantLock(); //创建了一个lock锁

    @Override
    public void run() {
        //子线程做的任务的卖票
        while (true) {
            //在读取共享数据前，加上所
            lock.lock();
            try {
                if (ticketNumber > 0) {
                    try {
                        Thread.sleep(100); //起到放大线程安全问题的作用
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程" + Thread.currentThread().getName() + "卖掉第" + ticketNumber + "号票");
                    ticketNumber--;
                } else {
                    break;
                }
            }catch (Exception e){

            }finally {
                lock.unlock(); //上面的程序都运行完后，必须要释放锁
            }
        }
    }
}