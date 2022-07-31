package com.java.homework;
/*
    启动3个线程打印递增的数字, 线程1先打印1,2,3,4,5,
    然后是线程2打印6,7,8,9,10, 然后是线程3打印11,12,13,14,15.
    接着再由线程1打印16,17,18,19,20….以此类推, 直到打印到75。
    效果图如下：

    1线程   1,2,3,4,5     16,17,18,19,20     31 32 33 34 35
    2线程   6 7 8 9 10     21 22 23 24 25
    3号线程  11 12 13 14    15 26 27 28 29 30

    1<num<5    就让1号线程运行，让2,3等待，一号线程运行完，唤醒2,3号线程
    6<num<10   就让2线程运行，让1,3等待，2号线程运行完，唤醒1,3号线程


    16<num<20  就让1号线程运行，让2,3等待，一号线程运行完，唤醒2,3号线程


    算法就是      1<num<5   num/5=0 和  16<num<20  num/5=3  和  31<num<35 num/5=6      和 1 产生联系
                 6<num<10  num/5%3+1=2  和  21<num<25  num/5%3+1=2       和 2 产生联系

            num/5%3=0  0%3=0   1   num/5=3  3%3=0   1   num/5=6  6%3=0  1

            num/5%3+1=id
 */
public class Home3 {
    public static void main(String[] args) {
        //创建三个目标(三个目标打印的是1-75[共享的])，每个目标创建一个线程
        //要为每个目标创建一个标识
        new Thread(new PrintNum(1)).start();
        new Thread(new PrintNum(2)).start();
        new Thread(new PrintNum(3)).start();

        //如果你把目标对象提出来 只建一个的话就不用加static了   想要给每个线程起一个标识(id)
        // 如果标识想要创建到线程名称的时候，可以采用将目标对象提取出来了
        //既然这样为啥不用继承...   用继承是可以的

    }
}

class PrintNum implements Runnable{
    int id;
    static int num=1;

    public PrintNum(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        while(num<=75){
            synchronized (this.getClass()) {//可以的
                if(num/5%3+1==id){//符合条件的线程进入if
                    System.out.println("---------------"+id+"号线程--------------");
                    for (int i = 0; i < 5; i++) {
                        System.out.print(num+" ");
                        num++;
                    }
                    System.out.println();//作用就是换行
                    //当前线程打印完毕后，唤醒所有线程
                    this.getClass().notifyAll();
                }else{//不符合条件的线程进入else，就立刻进入等待状态
                    try {
                        this.getClass().wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
