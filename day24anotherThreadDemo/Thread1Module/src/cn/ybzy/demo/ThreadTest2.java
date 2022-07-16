package cn.ybzy.demo;

public class ThreadTest2 {
    public static void main(String[] args) {
        SecondThread secondThread = new SecondThread();
        for(int j=1;j<=10;j++){
            System.out.println("主线程的名字：" + Thread.currentThread().getName()+ "-" + j);
            if(j == 1){
                //创建第一条子线程Thread-0,并且启动该子线程
                new Thread(secondThread,"子线程1").start();
                //创建第二条子线程Thread-1，并启动
                new Thread(secondThread,"子线程2").start();
            }
        }
    }
}

class SecondThread implements Runnable{

    @Override
    public void run() {
        //线程执行体
        for(int i=1;i<=10;i++){
            System.out.println("子线程的名字：" + Thread.currentThread().getName() + "-" + i);
        }
    }
}
