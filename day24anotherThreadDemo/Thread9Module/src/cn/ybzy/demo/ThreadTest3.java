package cn.ybzy.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest3 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        service.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
        service.shutdown();
    }
}
