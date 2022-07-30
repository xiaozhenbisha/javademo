package com.java.creatthread.demo;

/**
 *  此类用于演示 Thread类的常用方法1
 *     run()   线程真正执行的内容
 *     getName()   获得线程的名字
 *     static Thread currentThread() :返回对当前正在执行的线程对象的引用
 *         此行代码运行在哪个线程，就会返回哪个线程的引用
 *         问题：运行在哪个线程这句话，一个线程的范围怎么看呢？
 *             主线程：main方法大括号
 *             子线程：run方法哪个大括号
 *    final boolean isAlive()：测试线程是否处于活动状态(看此线程是否还活着)
 *         线程什么时候死亡？   线程执行完毕(run方法结束)     stop()也是可以让线程立刻死亡
 *    - public final int getPriority() ：返回线程优先级
 *     - public final void setPriority(int newPriority) ：改变线程的优先级
 *             public final void setPriority(int newPriority) {
 *                 ThreadGroup g;
 *                 checkAccess();
 *                 //判断设置的级别是否在  1-10之间
 *                 if (newPriority > MAX_PRIORITY || newPriority < MIN_PRIORITY) {
 *                     throw new IllegalArgumentException();
 *                 }
 *                 if((g = getThreadGroup()) != null) {
 *                     if (newPriority > g.getMaxPriority()) {
 *                         newPriority = g.getMaxPriority();
 *                     }
 *                     //这是线程优先级的方法   private native void setPriority0(int newPriority);
 *                     setPriority0(priority = newPriority);
 *                 }
 *             }
 *         1. 优先级有多少个级别   [1,10]
 *             Thread类为我们提供了三个常量  MIN_PRIORITY(1)  NORM_PRIORITY(5)  MAX_PRIORITY(10)
 *         2. 一个线程的优先级默认是多少？是以他的父级线程为准的！(源码见Thread--init.txt)
 *                private void init(ThreadGroup g, Runnable target, String name,
 *                               long stackSize) {
 *                 init(g, target, name, stackSize, null, true);
 *                 }
 *                 没有集合的源码难
 *
 *        练习：
 *         currentThread()在主线程和子线程中应用
 *         优先级，大家可以设置，并感受一下
 */
public class demo4 {
    public static void main(String[] args) {
        System.out.println("主线程的优先级bdfore："+Thread.currentThread().getPriority());
//        问题：父级的优先级怎么来呢   main的父级是System  System的父级是null
//          问题：Thread11 extends main ？不是
//            ThreadGroup
//                    System -> main-->  t1,t2
        //给线程设置优先级！可以

        //通过线程的名称   创建子线程时，默认和主线程是一样的优先级
        Thread11 t1=new Thread11();
        Thread11 t2=new Thread11();

        t1.setPriority(12);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();//    Thread-0  ---  1 2 3
        t2.start();//    Thread-1  ---- 1 2 3

        Thread.currentThread().setPriority(2);//一共只有10级，传个11会怎么样，会报错
        System.out.println("主线程的优先级after："+Thread.currentThread().getPriority());

        //优先级
        //1. 所有的线程都默认具有优先级(默认的优先级是多少？)固定是5吗？不是的(以父级的优先级为准)

        System.out.println("t1的优先级为："+t1.getPriority());
        System.out.println("t2的优先级为："+t2.getPriority());


       /* System.out.println("t1是否还活着："+t1.isAlive());

        System.out.println("子线程的名称："+t1.getName());
        //获得主线程的名称    getName()   没有主线程的线程引用
        Thread thread = Thread.currentThread(); //此行代码运行在哪个线程，就会返回哪个线程的引用
//        thread就是主方法的线程对象引用
        System.out.println("主线程名称："+thread.getName());//主线程的名称是main
        try {
            Thread.sleep(2000);//让当前线程(主线程)睡眠2秒    子线程早就执行完了
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("2秒后t1是否还活着："+t1.isAlive());*/
    }
}

class Thread11 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName()+"----"+i);
        }
    }
}

