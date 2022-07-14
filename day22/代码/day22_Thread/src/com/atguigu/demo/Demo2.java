package 解决线程安全问题方法一;
/*  此类用于演示的是  存在线程安全问题的卖票过程
    卖票，一共100张票，三个窗口去售票(一次卖一张)
        通过线程的两种创建方式去完成
 */
public class Demo2 {

    public static void main(String[] args) {
        /*Sell sell1=new Sell();
        sell1.start();
        Sell sell2=new Sell();
        sell2.start();
        Sell sell3=new Sell();
        sell3.start();*/

        //实现接口的方式创建的线程可以更好的处理共享资源
        Sell1 sell=new Sell1();

        Thread t1=new Thread(sell);
        t1.start();
        Thread t2=new Thread(sell);
        t2.start();
        Thread t3=new Thread(sell);
        t3.start();

    }
}
//以下两种方式都存在线程安全问题(下午主要讲解，如何处理线程安全)
class Sell extends Thread{
    private static int num=100;
    @Override
    public void run() {
        while(true){
            //1. 判断票数量是否满足本次销售
            if(num<=0){
                return;
            }
            //2. 票数的减少
            num--;

            //3. 告知结果
            System.out.println(Thread.currentThread().getName()+"卖出去了1张票，剩余:"+num);
        }
    }
}
class Sell1 implements Runnable{
    private int num=100;
    @Override
    public void run() {
        while(true){
            if(num<=0){
                return;
            }
            num--;
            System.out.println(Thread.currentThread().getName()+"卖出去了1张票，剩余:"+num);
        }
    }
}
