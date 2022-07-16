package cn.ybzy.demo;

public class ThreadTest1 {
    //运行测试的main方法
    public static void main(String[] args) {
        Object lock = new Object();
        P p = new P(lock);
        C c = new C(lock);
        p.start();
        c.start();
    }

}


//定义一个类，模拟生产者和消费者之间的缓冲区
class ValueObject{
    public static String value = ""; //模拟的缓冲区
}

//实现生产者的线程类
class P extends Thread{

    private Object lock;
    public P(Object lock){
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true){
            try{
                synchronized (lock){
                    //作为生产者的基本功能，生产数据
                    if(!ValueObject.value.equals("")){
                        //缓存区里有数据的情况下，生产者不生产数据的
                        lock.wait();//让当前线程阻塞，把当前线程的同步锁释放出去
                    }
                    //这时我们才真正的开始生产数据
                    System.out.println("缓存区没的数据，这时我们才真正的开始生产数据");
                    ValueObject.value = System.currentTimeMillis()+"";
                    //这个生产数据完毕，放进了缓冲区了，通知消费者线程，消费数据
                    lock.notify();
                }
            }catch (Exception e){

            }
        }

    }
}

//实现消费者线程类
class C extends Thread{

    private Object lock;
    public C(Object lock){
        this.lock = lock;
    }
    @Override
    public void run() {
        while (true){
          try {
            synchronized (lock){
               //判断缓冲区里有数据没的
               if(ValueObject.value.equals("")){
                   lock.wait();
               }
                System.out.println("缓冲区里有数据，现在把数据消费掉！");
               ValueObject.value = "";
               //消费者把数据消费后，通知生产者，生产数据
                lock.notify();
            }
          }catch (Exception e){

          }
        }

    }
}