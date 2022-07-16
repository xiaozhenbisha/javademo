package cn.ybzy.demo;

public class ThreadTest2 {
    public static void main(String[] args) {
        SychronizedThread2 st = new SychronizedThread2();
        //创建并开启4个线程来卖100张票
        new Thread(st,"线程1").start();
        new Thread(st,"线程2").start();
        new Thread(st,"线程3").start();
        new Thread(st,"线程4").start();
    }
}

class SychronizedThread2 implements Runnable{
    //定义在这里的属性是所有线程共享的变量数据
    private int ticketNumber = 100; //总共100张票
    private Object obj = new Object();

    @Override
    public void run() {
        //子线程做的任务的卖票
        while(true){
            synchronized (obj){
                if(ticketNumber > 0){
                    try {
                        Thread.sleep(100); //起到放大线程安全问题的作用
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程" + Thread.currentThread().getName() + "卖掉第" + ticketNumber + "号票");
                    ticketNumber--;
                }else {
                    break;
                }
            }
        }
    }
}