package com.atguigu.demo;
/*
     此类用于演示   Thread类的常用方法2
     start()
     sleep(ong millis);   让正在运行此方法的线程进入睡眠(到时间后自动苏醒)
        public static native void sleep(long millis) throws InterruptedException;
            throws InterruptedException  当线程处于睡眠/线程的插队/等待状态，有其他的线程打断我的睡眠，就会抛出异常
    static void yield(): 线程的礼让(效果是不明显)
            当线程抢到时间片(执行权),如果遇到yield().会让出此次执行权(优先级更高或者同级的线程)
            A同学和B同学同时饮水机接水，A同学抢到这一滴水时，调用yield(),A同学就放弃这一滴水，
                退出和B同学在次站在同一起跑线上，继续争夺这滴水的权利(在第二次还是有可能是A同学得到这滴水的)
        public static native void yield();
    void join() :线程的插队    源码明天在读(join(long millis))
        插队线程    ：   调用方法的线程为插队线程
        被插队线程：     执行join方法的线程为被插队线程
    void join(long millis) ：等待该线程终止的时间最长为 millis 毫秒。如果millis时间到，将不再等待。
    void join(long millis, int nanos) ：等待该线程终止的时间最长为 millis 毫秒 + nanos 纳秒。
     练习：
        可以做一个倒计时10秒钟，提示新年快乐
     练习：
        一个工人，在工作，生产玩具，每500毫秒就生产一个玩具，当生产到第20个玩具时，就吃三个馒头，每1000毫秒吃一个
        吃完后继续工作！
 */
public class Demo5 {
    public static void main(String[] args) {
        Thread12 t1=new Thread12();
        t1.start();

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           /* if(i%5==0){
                //效果不明显
                Thread.yield();//每次都礼让，到不到一直礼让的效果的！
            }*/
           if(i==5){//当主方法的i==5，让t1来插队
               try {
                   t1.join();//t1线程来插队，插队到谁前面(运行join方法的线程)？
                    // 被插队的线程只能等插队线程执行完毕才能继续执行
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
            System.out.println(Thread.currentThread().getName()+"--"+i);
        }
        //有礼让，执行时间会延长    携程抢票(加速包+好友点的多加速包就多)   12306改系统(轮候)


        /*try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //中断t1的睡眠，看一下这个异常
        t1.interrupt();*/
    }
}
class Thread12 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            try {
                Thread.sleep(500);//运行到此处，当前线程就会睡眠500毫秒，到时间后自动苏醒
//                t.join(); 插队线程就是t    被插队线程就是  this
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"--"+i);
        }
    }
}
