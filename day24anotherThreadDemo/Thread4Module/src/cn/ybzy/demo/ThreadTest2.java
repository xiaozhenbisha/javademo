package cn.ybzy.demo;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTest2 {
    public static void main(String[] args) {
        AtomicThread at = new AtomicThread();
        //创建10条子线程并启动
        for(int i=0;i<10;i++){
            new Thread(at,"线程"+i).start();
        }
    }
}
class AtomicThread implements  Runnable{
    //是线程共享变量
//    private volatile int serialNum = 0;
    private AtomicInteger serialNum = new AtomicInteger(0);

    public int getSerialNum() {
        return serialNum.getAndIncrement();
    }
    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("显示serialNum完后，然它自增一：" + getSerialNum());
    }
}
