package cn.ybzy.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadTest4 {
    public static void main(String[] args) {
        ThirdThread thirdThread = new ThirdThread();
        FutureTask<Integer> futureTask = new FutureTask<>(thirdThread);
        for (int j = 1; j <= 10; j++) {
            System.out.println("主线程的名字：" + Thread.currentThread().getName() + "-" + j);
            if (j == 1) {
                //创建第一条子线程1,并且启动该子线程
                new Thread(futureTask, "子线程1").start();
            }
        }

        try {
            System.out.println("子线程返回的值是：" + futureTask.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class ThirdThread implements Callable {

    @Override
    public Object call() throws Exception {
        int i = 1;
        //线程执行体
        for (; i <= 10; i++) {
            System.out.println("子线程的名字：" + Thread.currentThread().getName() + "-" + i);
        }
        return i;
    }
}
