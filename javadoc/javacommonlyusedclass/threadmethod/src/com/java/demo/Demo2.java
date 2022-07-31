package com.java.demo;

public class Demo2 {
    public static void main(String[] args) {
        new Thread02().start();

        synchronized ("java") {
            for (int i = 0; i < 10; i++) {
                System.out.println("main----"+i);
                if(i==5){
                    try {
//                        Thread.sleep(5000);
                        "java".wait(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

class Thread02 extends Thread{
    @Override
    public void run() {
        synchronized ("java") {
            for (int i = 0; i < 10; i++) {
                System.out.println("----"+i);
                if(i==5){
                    try {
//                        Thread.sleep(5000);//睡眠不会释放锁资源
                        "java".wait(5000);//在等待的时候，释放锁资源
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

