package com.atguigu.demo;
/*
   此类用于演示  线程的第二种创建方式
    5.2 实现Runnable接口
        a. 新建一个类
        b. 实现接口Runnable
        c. 实现抽象方法run方法

        d. 启动方式
            ① 创建线程对象
                准备目标资源
                PrintWhile printWhile=new PrintWhile();
                封装线程对象
                Thread t=new Thread(printWhile);
            ② 调用start方法
                 t.start();//执行的是目标中的run方法

    6. 两种线程的创建方式有什么区别
        6.1  继承Thread类(Thread类也是实现的Runnable接口)
        6.2  实现Runnable接口
            避免java中的单继承
            更好的处理多个线程之间的共享资源  ★
 */
public class Demo2 {
    public static void main(String[] args) {
        //程序的入口
        //1. 创建PrintWhile对象  相当于线程的目标
        PrintWhile printWhile=new PrintWhile();
        //2. 通过Thread类进行包装 (通过Thread类的构造器)
        Thread t=new Thread(printWhile);
        //3. 启动线程
        t.start();//

        for (int i = 0; i <100 ; i++) {
            System.out.println("*********"+i);
        }
    }
}

class PrintWhile implements Runnable{
    @Override
    public void run() {
        //循环相当于我之后的业务代码
        int i=0;
        while(i<100){
            System.out.println("----------------"+i);
            i++;
        }
    }
}
