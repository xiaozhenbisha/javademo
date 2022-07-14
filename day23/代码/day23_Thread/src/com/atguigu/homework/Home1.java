package com.atguigu.homework;
/*
创建和启动2个子线程，一个打印1-100之间奇数，一个打印1-100之间偶数，
（1）要求每个线程要么不打印，要么就连续打印5个数，每个数打印间隔500毫秒
（2）但两个线程不要求交替打印。
 */
public class Home1 {

    public static void main(String[] args) {
        new Thread(new PrintJi()).start();
        new Thread(new PrintOu()).start();
    }
}

class PrintJi implements Runnable{
    @Override
    public void run() {
        int i=1;
        while(i<100){
            synchronized ("java") {//this ×  this.getClass ×  一个常量(字符串)
                for (int j = 0; j < 5; j++) {//打印就连续打印5个
                    /*try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }*/
                    System.out.println("奇数---："+i);
                    i=i+2;
                }
            }
        }
    }
}
class PrintOu implements Runnable{
    @Override
    public void run() {
        int i=2;
        while(i<100){
            synchronized ("java") {
                for (int j = 0; j < 5; j++) {//打印就连续打印5个
                    /*try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }*/
                    System.out.println("偶数："+i);
                    i=i+2;
                }
            }
        }
    }
}
