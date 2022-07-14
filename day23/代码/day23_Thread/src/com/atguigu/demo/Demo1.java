package com.atguigu.demo;
/*多线程：
        1. 多线程的等待剩余两个方法(了解)
        2. 两种创建方式的区别(了解)
            继承Thread类
            实现Runnable接口
                第二种线程创建的优势：
                    ① 更好处理共享资源
                    ② 避免java中的单继承
                    ③ 线程池(容器)中不接受继承Thread类的线程
                    ④ 增加程序的健壮性，实现解耦操作，代码可以被多个线程共享，代码和线程独立
        3. 线程的生命周期(★)   头去面试刷刷面试题
            生命周期：线程从出生到死亡的过程
                新生线程            线程对象刚刚创建还没有启动
                就绪(可运行)线程     调用了start方法，但是没有抢到时间片或阻塞疏通后，没有抢到时间片
                运行线程            就是就绪线程抢到时间片
                阻塞线程             阻塞线程结束之后会回到哪里？回到就绪
                    睡眠、等待、join、IO阻塞...
                死亡线程            run方法结束
        4. wait和sleep的释放锁问题(★)
            wait()  在等待时会释放当前锁资源
            sleep(int)   在睡眠时不会释放当前锁资源
      反射机制(难)：学习io流差不多(方法比较多[源码不适合现在看])
        主要的学习内容是理解(以后使用的框架【框架内部有可能会用到反射：可以更好的理解框架原理】)
        工作后敲反射机制的代码不多，除非进入的公司是开发框架的

     */
public class Demo1 {
    /*
        wait();         一直等待，直到被唤醒
            源码：public final void wait() throws InterruptedException {
                wait(0);
            }
        wait(int millis)   设置等待时间(睡眠差不多)
            public final native void wait(long timeout) throws InterruptedException;

        wait(int millis，int naons)
            public final void wait(long timeout, int nanos) throws InterruptedException {
                if (timeout < 0) {
                    throw new IllegalArgumentException("timeout value is negative");
                }
                if (nanos < 0 || nanos > 999999) {
                    throw new IllegalArgumentException(
                                        "nanosecond timeout value out of range");
                }
                if (nanos > 0) {
                    timeout++;
                }
                wait(timeout);
            }
     */
    public static void main(String[] args) {
        new Thread01().start();
        for (int i = 0; i <10 ; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i==9){
                synchronized ("java"){
                    "java".notify();
                }
            }
            System.out.println("main-"+i);
        }
    }
}

class Thread01 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i==5){
                synchronized ("java"){
                    try {
                        "java".wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("-----"+i);
        }
    }
}
