package cn.ybzy.demo;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest2 {
    public static void main(String[] args) {
        ABCABCThread t = new ABCABCThread();
        //创建并启动3条线程
        new Thread(new Runnable() {
            @Override
            public void run() {
               for (int i=1;i<11;i++){
                   t.loopA(i);
               }
            }
        },"A").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<11;i++){
                    t.loopB(i);
                }
            }
        },"B").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<11;i++){
                    t.loopC(i);
                }
            }
        },"C").start();
    }
}

class ABCABCThread{
    private int number = 1; //起到一会个标记的作用，用它来判断我们执行的是哪个线程。
    private Lock lock = new ReentrantLock();
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();
    private Condition condition3 = lock.newCondition();

    //A
    public void loopA (int totalLoop){
        lock.lock();
        try{
            if(number != 1){
               condition1.await();  //阻塞当前线程
            }
            System.out.println(Thread.currentThread().getName() + "\t" + totalLoop);
            number = 2;
            condition2.signal(); // 唤醒B线程
        }catch (Exception e){

        }finally {
            lock.unlock();
        }
    }

    //B
    public void loopB (int totalLoop){
        lock.lock();
        try{
            if(number != 2){
                condition2.await();  //阻塞当前线程
            }
            System.out.println(Thread.currentThread().getName() + "\t" + totalLoop);
            number = 3;
            condition3.signal(); // 唤醒B线程
        }catch (Exception e){

        }finally {
            lock.unlock();
        }
    }

    //C
    public void loopC (int totalLoop){
        lock.lock();
        try{
            if(number != 3){
                condition3.await();  //阻塞当前线程
            }
            System.out.println(Thread.currentThread().getName() + "\t" + totalLoop);
            number = 1;
            condition1.signal(); // 唤醒B线程
        }catch (Exception e){

        }finally {
            lock.unlock();
        }
    }
}
