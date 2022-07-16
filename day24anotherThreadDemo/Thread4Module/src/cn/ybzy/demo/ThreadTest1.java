package cn.ybzy.demo;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTest1 {
    public static void main(String[] args) {
        //主线程
        VolatileThread vt = new VolatileThread();
        //创建一个子线程并启动
        new  Thread(vt,"子线程").start();
        //主线程中，写一个循环
        while (true){
            synchronized (vt){
                if (vt.isFlag()){
                    System.out.println("子线程中把flag给成了ture，主线程这里读到新值！");
                    break;
                }
            }
            //System.out.println("主线程每循环一次打印一次，此时的flage还是false");
        }

    }
}

class VolatileThread implements Runnable{

    //在线程类的属性位置，定义个属性，这个是属性变量就是所有线程共享的变量
    private boolean flag = false;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        //子线程执行体
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.flag = true;
        System.out.println("子线修改flage的值，改成了true");
    }
}
