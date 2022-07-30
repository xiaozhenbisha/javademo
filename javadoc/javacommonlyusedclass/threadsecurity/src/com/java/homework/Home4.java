package com.java.homework;

/**
 * 练习：
 *    一个工人，在工作，生产玩具，每500毫秒就生产一个玩具，
 *    当生产到第20个玩具时，就吃三个馒头，每1000毫秒吃一个
 *    吃完后继续工作！
 *    吃一次馒头就可以，
 */
public class Home4 {
    public static void main(String[] args) {
        //启动工作的线程
        Worker worker=new Worker();
        worker.start();

        //不能算时间()
    }

}

class Worker extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <=100 ; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i%20==0){
                //吃馒头，此时再去启动吃馒头的线程就可以
                Eat eat=new Eat();//在一个子线程中是否可以启动另外一个子线程
                eat.start();
                try {
                    eat.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            System.out.println("生产了第"+i+"个玩具");//生产一个玩具可能是100行代码(执行时间是算不出来的)
        }
    }
}
class Eat extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("吃第个"+i+"馒头");
        }
    }
}

