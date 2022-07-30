package com.java.creatthread.test;

/**
 * 创建一个子线程，打印1-100之间的偶数，main方法打印1-100之间的奇数，两个同时打印
 */
public class Test2 {
    public static void main(String[] args) {

        PrintNum printNum=new PrintNum();
        printNum.start();

        for (int i = 1; i <= 100; i=i+2) {
            System.out.println("奇数----"+i);
        }
    }
}

class PrintNum extends Thread{
    @Override
    public void run() {
        for (int i = 2; i <=100 ; i=i+2) {
            System.out.println("偶数---"+i);
        }
    }

}
