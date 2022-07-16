package cn.ybzy.demo;

public class ThreadTest2 {
    public static void main(String[] args) {
        Thread daemonThread = new DaemonThread("后台子线程");
        daemonThread.setDaemon(true); //设置daemonThread线程为后台线程的关键语句
        daemonThread.start();
        try {
            Thread.sleep(5000); //main线程沉睡5s
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //5s后，main线程会回来，执行主线程里的任务代码
        for(int i=1;i<101;i++){
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
        new ForegroundThread("前台子线程").start();
    }
}

class DaemonThread extends Thread{
    public DaemonThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for(int i=1;i<101;i++){
            try {
                Thread.sleep(500);  //让该线程沉睡1s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName() + ":" + i);
        }
    }
}

class ForegroundThread extends Thread{
    public ForegroundThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for(int i=1;i<101;i++){
            try {
                Thread.sleep(1000); //每次输出的时候，沉睡0.5s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName() + ":" + i);
        }
    }

}
