package com.java.creatthread.demo;

/**
 *    此类用于演示 Thread
 *    构造器：
 *         new Thread();   一般是创建其子类对象时，会调用到Thread类的空参构造器
 *             public Thread() {
 *                 init(null, null, "Thread-" + nextThreadNum(), 0);//初始化一些线程资源的
 *             }
 *         new Thread(String name);   给线程起个名字(线程还有名字？有的)
 *             如果不起名默认会给线程创建一个名字
 *             public Thread(String name) {
 *                 init(null, null, name, 0);
 *             }
 *             Ps:上述两种构造器主要针对的是采用继承Thread类创建线程的方式
 *         new Thread(Runnable runnable);
 *             public Thread(Runnable target) {
 *                 init(null, target, "Thread-" + nextThreadNum(), 0);
 *             }
 *         new Thread(Runnable runnable,String name);
 *             public Thread(Runnable target, String name) {
 *                 init(null, target, name, 0);
 *             }
 *     方法：睡眠/优先级/插队/礼让/停止... 睡眠和唤醒不是Thread类的方法
 *         getName()   获得线程的线程名字
 *
 *     //卖票    火车站窗口的卖票系统(三个窗口在售票)，三个窗口的业务是否是一样的？是
 *     练习：
 *         创建两个线程，第一个线程用第一种创建方式，第二个线程用第二种，分别为其设置线程名字
 *             同时启动
 */
public class demo3 {
    public static void main(String[] args) {
        /*PrintFor printFor=new PrintFor("张三");
        printFor.start();
        //想要获得printFor的线程名字
        System.out.println("printFor的线程名字："+printFor.getName());//Thread-0
        //PrintFor这个类是否可以启动多个线程？
        PrintFor printFor1=new PrintFor("李四");//第二个子线程，它的业务代码和第一个是一样的，如果需要区分，通过名字
        printFor1.start();
        System.out.println("printFor1的线程名字："+printFor1.getName());//Thread-1
*/

        //采用实现接口的方式创建线程

        //1. 目标创建
        PrintWhile printWhile=new PrintWhile();
        //线程对象创建
        Thread t=new Thread(printWhile,"翠花");
        t.start();//运行的就是目标的run方法
        System.out.println("t的线程名字："+t.getName());

        //采用实现的方式，一个类创建多个线程，如何做？
        //目标可以是同一个，重复的是2,3
        Thread t1=new Thread(printWhile,"来福");
        t1.start();
        System.out.println("t1的线程名字："+t1.getName());

        //t稍微有些许的优势的   t1


    }
}
