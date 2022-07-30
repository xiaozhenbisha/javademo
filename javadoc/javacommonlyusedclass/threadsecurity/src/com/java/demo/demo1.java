package com.java.demo;

/**
 *  此类用于演示   Thread类的常用方法
 *         1. join()
 *           源码：  public final void join() throws InterruptedException {
 *                 join(0);
 *             }
 *        2.  join(long millis);//设置一个毫秒数(插队是可以设置时间的)
 *          源码：   public final synchronized void join(long millis)
 *                 throws InterruptedException {
 *                     long base = System.currentTimeMillis();//获得当前系统时间
 *                     long now = 0;
 *
 *                     if (millis < 0) {//检测负数
 *                         throw new IllegalArgumentException("timeout value is negative");
 *                     }
 *
 *                     if (millis == 0) {//  join()-->join(0);
 *                         while (isAlive()) {
 *                             wait(0);//等待的方法(Object类的方法)
 *                             //让当前线程等待(挂起)[无时间挂起，什么时候恢复？后面可以唤醒]
 *                             问题：也就是这个join(0)的休眠时间，不唤醒，一直休眠吗？  是的
 *                         }
 *                     } else {//join(millis)   millis>0 才会进入到else
 *                         while (isAlive()) {
 *                             long delay = millis - now;//计算一个时间   1：参数的值300
 *                             if (delay <= 0) {//说明时间到了
 *                                 break;
 *                             }
 *                             wait(delay);//等待这么长时间(300毫秒)，在等待的中途，有可能会被唤醒
 *                             now = System.currentTimeMillis() - base;//当前时间-最开始获得的时间(等待了多久)  100
 *                         }
 *                     }
 *        3.  join(long millis, int nanos);//设置时间  是毫秒+纳秒
 *            源码： public final synchronized void join(long millis, int nanos)
 *                 throws InterruptedException {
 *                     if (millis < 0) {//毫秒数不能小于0
 *                         throw new IllegalArgumentException("timeout value is negative");
 *                     }
 *                     if (nanos < 0 || nanos > 999999) {//检测纳秒的范围(如果不在范围内就报错)
 *                         throw new IllegalArgumentException(
 *                                             "nanosecond timeout value out of range");
 *                     }
 *                     //1. millis>0   nanos<500000    纳秒相当于没有设置
 *                     //2. millis=0   nanos>0        就按1毫秒算
 *                     //3. millis>0   nanos>500000    毫秒也是加1
 *                     if (nanos >= 500000 || (nanos != 0 && millis == 0)) {
 *                         millis++;
 *                     }
 *                     join(millis);//最终还是调用join(long millis)
 *                 }
 *          秒--毫秒     1秒=1000毫秒
 *          秒--纳秒     1秒=10的9次方(10亿)纳秒      1毫秒=1000000纳秒
 *        join() 和join(long millis, int nanos)  最终都会调用join(long millis)
 *
 *        stop(); 让线程停止(被标记过时，不建议使用[stop存在固有的安全问题])
 *         调用stop方法，相当于给台式机直接拔掉电源(有可能会造成数据的丢失)
 *        如果不建议使用stop,那么该怎么让线程终止？  通过flag的值，让run方法结束
 *         if(flag)
 *             return;
 *
 *        问题： 吃馒头这样等设定好的时间能实现么？但算时间好像也不太靠谱。。
 *         (公司规定，吃饭时间是3秒钟，无论你吃完没吃完都要干活)  join(3000)
 *         (公司国定，干完活，就吃三个馒头，吃完后继续干活)   join()
 */
public class demo1 {


    public static void main(String[] args)  {
        PrintNum printNum=new PrintNum();
        printNum.start();

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i==3){
               /* try {
                    printNum.join();//主线程会等待priintNum全部执行完，才会继续执行   大概3.5秒后执行
                    printNum.join(2000);//主线程会等待printNum2秒钟，时间到就会并行执行
                    printNum.join(2000,3333);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
//               printNum.stop();//被过时了(注解的时候)[jdk不在维护，原始功能是还存在的]
                printNum.setFlag(true);
            }
            if(i==5){
                System.out.println(printNum.isAlive());
            }
            System.out.println("main--"+i);
        }
    }
}

class PrintNum extends Thread{
    private boolean flag=false;

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if(flag){
                return;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("-----"+i);
        }

        System.out.println("222");
    }
}

