package cn.ybzy.demo;

public class ThreadTest {

    public static void main(String[] args) {
        for(int j=1;j<=10;j++){
            System.out.println("主线程的名字：" + Thread.currentThread().getName()+ "-" + j);
            if(j == 5){
                //创建第一条子线程Thread-0
                new FirstThread().start(); //并且启动该子线程
                //创建第二条子线程Thread-1，并启动
                new FirstThread().start();
            }
        }
    }

}

class FirstThread extends Thread{
    @Override
    public void run() {
        super.run();
        //线程的执行体，此线程预实现的任务代码
        for(int i=1;i<=10;i++){
            System.out.println("子线程的名字：" + this.getName() + "-" + i);
        }
    }
}
