package cn.ybzy.demo;

import java.util.concurrent.Exchanger;

public class ThreadTest7 {
    public static String msg1 = null;
    public static String msg2 = null;

    //写两个方法，他们会分别在两个线程里被调用
    public void a(Exchanger<String> exchanger){
        try {
            msg1 = "111111111"; //交换前，msg1的数据值
            System.out.println("交换前msg1:" + msg1);
            //进行交换
            msg1 = exchanger.exchange(msg1); //交换完成后，要覆盖原来变量的值
            System.out.println("调用a方法的线程交换数据完成！");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void b(Exchanger<String> exchanger){
        try {
            msg2 = "2222222222"; //交换前，msg1的数据值
            System.out.println("交换前msg2:" + msg2);
            //进行交换
            msg2 = exchanger.exchange(msg2);
            System.out.println("调用b方法的线程交换数据完成！");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        final Exchanger<String> exchanger = new Exchanger<>();
        final ThreadTest7 threadTest7 = new ThreadTest7();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                threadTest7.a(exchanger);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
              threadTest7.b(exchanger);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join(); //保证t1线程执行完后，在继续执行下面的代码
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("交换完毕后msg1：" + msg1);
        System.out.println("交换完毕后msg2：" + msg2);
    }

}
