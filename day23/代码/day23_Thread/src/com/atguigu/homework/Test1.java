package com.atguigu.homework;
/*
一、请按要求编写多线程应用程序，模拟多个人(多个线程)通过一个山洞：
​	1、这个山洞每次只能通过一个人，每个人通过山洞的时间为5秒；
​	2、随机生成10个人(10个线程)，同时准备过此山洞
​	3、定义一个变量用于记录通过隧道的人数
​	4、显示每次通过山洞人的姓名(线程的名字)，和通过顺序；
​		显示信息：XXX已经通过隧道，TA是第n个通过的！
 */
public class Test1 {
    public static void main(String[] args) {
        Person per=new Person();
        for (int i = 0; i < 10; i++) {
            Thread t=new Thread(per,"张三"+i);
            t.start();
        }
    }
}

class Person implements Runnable{
    int num;
    @Override
    public void run() {
        synchronized (this){
            /*for (int i = 0; i <5 ; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("通过山洞的第"+(i+1)+"步");
            }*/
            System.out.println(Thread.currentThread().getName()+"已经通过山洞，他是第"+ ++num +"个通过");
        }
    }
}
