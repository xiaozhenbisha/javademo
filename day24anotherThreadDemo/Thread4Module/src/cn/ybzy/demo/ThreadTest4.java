package cn.ybzy.demo;

import java.util.concurrent.CountDownLatch;

public class ThreadTest4 {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(50);
        CountDownLatchThread cdlt = new CountDownLatchThread(latch);

        long start = System.currentTimeMillis();
        for(int i=1;i<51;i++){
            new Thread(cdlt,"线程"+i).start();
        }


        try {
            latch.await(); //这个方法在main线程里调用，阻塞的就是main线程，什么时候放开，初始化50的计数器倒计时为0的时候
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("50个子线运行了多长时间：" + ((end-start)/1000) + "秒");
    }
}

class CountDownLatchThread implements Runnable{
    private CountDownLatch latch;
    public CountDownLatchThread(CountDownLatch latch){
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            for(int i=0;i<50000;i++){
                if(i%2==0){
                    System.out.println(Thread.currentThread().getName() + "打印0-50000直接的偶数：" + i);
                }
            }
        }finally {
            latch.countDown(); //让CountDownLatch里的计数器-1
        }
    }
}
