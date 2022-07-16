package cn.ybzy.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadTest3 {
    public static void main(String[] args) {
        CollectionsThread ct = new CollectionsThread();
        new Thread(ct,"1").start();
        new Thread(ct,"2").start();
        new Thread(ct,"3").start();
        new Thread(ct,"4").start();

    }
}

class CollectionsThread implements Runnable{
    //线程共享变量
//    private static List<String> list = Collections.synchronizedList(new ArrayList<>());
    private static CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

    static {
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
    }


    @Override
    public void run() {
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
            //上面读，下面马上有写，一边读一遍写的操作就是集合的复合操作
            list.add("eeeee");
        }
    }
}
