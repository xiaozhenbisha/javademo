package cn.ybzy.demo;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ThreadTest2 {
    public static void main(String[] args) {
        CachedData cd = new CachedData();
        for(int i=1;i<=10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    cd.putCachedData(Thread.currentThread().getName() + "放入的新数据");
                }
            },"t"+i).start();
        }
    }

}

class CachedData{
    //定义一个线程共享的变量
    private String data = "共享变量原有的值";
    //定义一个标记
    private volatile boolean isUpadte;

    //拿到读写锁
    private ReadWriteLock rwl = new ReentrantReadWriteLock();

    //模拟放置数据到缓存
    public void putCachedData(String data){
        //获取写锁之前，先获取读锁
        rwl.readLock().lock();
        if(!isUpadte){ //缓存是过期的
            rwl.readLock().unlock(); //锁不能升级，先用的读锁，要释放
            //获取写锁
            rwl.writeLock().lock();
            try {
                if(!isUpadte){
                    //更新缓存
                    this.data = data; //把写过来的最新数据放入缓存中
                    isUpadte = true;
                }
                //拥有写锁的情况下，是可以重入读锁
                rwl.readLock().lock();
            }finally {
                rwl.writeLock().unlock();// 同时拥有写锁和读锁，在这里释放写锁，锁降级
            }
        }

        //使用读锁，来使用缓存
        try {
            System.out.println("最新的缓存数据打印一下：" + this.data);
        }finally {
            rwl.readLock().unlock();
        }

    }


}
