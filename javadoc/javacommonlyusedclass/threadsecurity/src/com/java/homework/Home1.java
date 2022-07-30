package com.java.homework;

/**
 *     在子线程中输出1-20之间的偶数，主线程输出1-20之间的奇数。
 *     当子线程打印到10的时候，主线程进行插队(只有主线程运行，子线程就应该等待)，
 *     直到子线程执行完毕！(主线程结束之后，子线程要继续运行，直到完毕)
 *
 *     那前天课上讲的nit方法源代码里面是怎么通过currentThread()获取主线程的呢？
 *     Thread parent = currentThread();可以吗
 *     我直接构造器.main（null）能调主的方法吗？   子线程是调用不了main方法(系统调用[程序的入口])
 */
public class Home1 {

    public static void main(String[] args) {
        //运行在哪个线程中获得的就是哪个线程对象(此时获得的是主线程对象)
        Thread t=Thread.currentThread();

        PrintNum printNum=new PrintNum(t);//在main方法这个线程中执行的new PrintNum()  先调用Thread类的构造器-->init
        printNum.start();

        for (int i = 1; i <=20 ; i=i+2) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("奇数："+i);
        }
    }
}

class PrintNum extends  Thread{
    private Thread t;//t就是插队的线程(不关是不是主线程)

    public PrintNum(Thread t) {
        this.t = t;
    }

    @Override
    public void run() {
        for (int i = 2; i <=20 ; i=i+2) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i==10){
                //主线程进行插队    插队的线程对象.join()
                //需要在子线程中获得主线程的对象

                try {
                    Thread.currentThread().join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("偶数："+i);
        }
    }
}
