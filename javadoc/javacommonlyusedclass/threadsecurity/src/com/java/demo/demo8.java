package com.java.demo;

/**
 *  此类用于演示的是    线程的通信
 *         经典的生产者消费者的问题！
 *         有一个包子铺，还有一个吃货    都操作包子这个资源
 *         包子铺只生产一个包子(如果有一个包子没有被吃货吃，包子铺就不生产包子)
 *             判断是否有包子资源，如果没有就生产包子，生产完包子，喊吃货来吃(唤醒)
 *                                如果有，那么包子铺就等待(线程的挂起)
 *         吃货有包子就吃，没有就等待
 *             判断是否有包子资源，如果没有 就等待(挂起)
 *                                 如果有，就开始吃，吃完后，喊包子铺继续做包子(唤醒)
 *
 *       当子线程打印到5的时候，进行等待，当主线程在打印到10的时候，唤醒子线程(子线程是继续运行)
 *
 *
 *       等待;
 *         wait()
 *                     <pre>
 *                  *     synchronized (obj) {//监视器对象
 *                  *         while (&lt;condition does not hold&gt;)
 *                  *             obj.wait();
 *                  *         ... // Perform action appropriate to condition
 *                  *     }
 *                 * </pre>
 *          ① wait和notify方法只能运行在互斥锁中， ② wait方法的调用者和notify方法的调用者必须是监视器对象
 *             public final void wait() throws InterruptedException {
 *                 wait(0);
 *             }
 *         wait(int millis);
 *             public final native void wait(long timeout) throws InterruptedException;//本地方法
 *         wait(int millis,int nanos);
 *
 *
 *         唤醒：
 *             public final native void notify();   随机唤醒一个线程
 *                public final native void notifyAll();  唤醒所有
 *
 *         问题：
 *             为什么对象不是t
 *             保证只有一个对象进来等待?
 *        今天的重点：
 *             1. 线程安全
 *             2. 线程通信(还有两个wait方法待讲)
 */
public class demo8 {

    public static void main(String[] args) {
        Thread14 t=new Thread14();
        t.start();
        Thread14 t1=new Thread14();
        t1.start();

        for (int i = 0; i <20; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i==10){
                //要唤醒子线程   唤醒哪个对象(notify的调用者)下等待的一个线程
                //也是必须运行在锁中，调用对象也是锁对象
                synchronized (t.getClass()){
                    t.getClass().notify();
                }
            }
            if(i==15){
                synchronized (t.getClass()){
                    t.getClass().notify();
                }
            }
            System.out.println("main---"+i);
        }
    }
}

class Thread14 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <20; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this.getClass()){
                if(i==5){
                    //让当前线程进行等待   wait()  这个方法来自于Object(任何对象都可以调用此方法)
                    try {
                        this.getClass().wait();//让当前线程(运行此方法的线程)，在指定对象下等待(调用wait方法的对象)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Thread14---"+i);
            }

        }
    }
}

