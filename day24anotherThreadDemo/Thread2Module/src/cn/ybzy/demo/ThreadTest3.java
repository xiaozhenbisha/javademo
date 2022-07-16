package cn.ybzy.demo;

public class ThreadTest3 {
    public static void main(String[] args) {
        new Thread(new MyThread1(),"子线程").start();
        for(int i=1;i<4;i++){
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

class MyThread1 implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(3000); //最佳写的位置是run方法里
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i=1;i<4;i++){
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
