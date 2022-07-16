package cn.ybzy.demo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest9 {
    public static void main(String[] args) {
        System.out.println("开始");
        Lock lock = new ReentrantLock();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if(lock.tryLock()){
                        System.out.println("获取到了锁");
                        try {
                            for (int i=1;i<6;i++){
                                System.out.println(Thread.currentThread().getName() + "--" + i);
                            }
                        }catch (Exception e){

                        }finally {
                           lock.unlock();
                        }
                    }else{
                        System.out.println("没获取到锁");
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "线程1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if(lock.tryLock()){
                        System.out.println("获取到了锁");
                        try {
                            for (int i=1;i<6;i++){
                                System.out.println(Thread.currentThread().getName() + "--" + i);
                            }
                        }catch (Exception e){

                        }finally {
                            lock.unlock();
                        }
                    }else{
                        System.out.println("没获取到锁");
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "线程2").start();

        System.out.println("结束");
    }
}
