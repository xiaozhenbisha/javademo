package cn.ybzy.demo;

import java.util.concurrent.Semaphore;

public class ThreadTest5 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(5);
        SemaphoreThread spt = new SemaphoreThread(semaphore);

        for(int i=1;i<9;i++){
            new Thread(spt,""+i).start();
        }
    }
}

class SemaphoreThread implements Runnable{
    private Semaphore semaphore;
    public SemaphoreThread(Semaphore semaphore){
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            //第二句代码开始才是，线程体里的具体的任务代码
            System.out.println("工人"+Thread.currentThread().getName()+"占用一个机器在生产...");
            Thread.sleep(2000);
            System.out.println("工人"+Thread.currentThread().getName()+"释放出机器");
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
