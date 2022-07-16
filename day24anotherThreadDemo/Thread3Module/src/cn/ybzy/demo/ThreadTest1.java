package cn.ybzy.demo;

public class ThreadTest1 {
    public static void main(String[] args) {
        SychronizedThread st = new SychronizedThread();
        //创建并开启4个线程来卖100张票
        new Thread(st,"线程1").start();
        new Thread(st,"线程2").start();
        new Thread(st,"线程3").start();
        new Thread(st,"线程4").start();
    }
}

class SychronizedThread implements Runnable{
    //定义在这里的属性是所有线程共享的变量数据
    private int ticketNumber = 100; //总共100张票

    @Override
    public void run() {
        //子线程做的任务的卖票
        while(true){
            if(ticketNumber > 0){
                System.out.println("线程" + Thread.currentThread().getName() + "卖掉第" + ticketNumber + "号票");
                ticketNumber--;
            }else {
               break;
            }
        }
    }
}
