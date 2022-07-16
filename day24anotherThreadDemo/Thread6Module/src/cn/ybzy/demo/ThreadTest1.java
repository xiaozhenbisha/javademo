package cn.ybzy.demo;

public class ThreadTest1 {
    public static void main(String[] args) {
        for(int i=0;i<20;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton4.getInstance());
                }
            }).start();
        }
    }
}

//饿汉
class Singleton1 {
    private static Singleton1 singleton = new Singleton1();
    private  Singleton1(){}
    public static Singleton1 getInstance(){
        return singleton;
    }
}

//懒汉
class Singleton2{
    private volatile static Singleton2 singleton = null;
    private  Singleton2(){}
    public static Singleton2 getInstance(){
        if(singleton == null){  //第一次检查，高并发，很多线程会同时到达这里
            synchronized (Singleton2.class){ //第二层保护
                if(singleton == null){ //第三层保护，配合volatile关键字
                    singleton = new Singleton2(); //除了第一次进来的线程，其他所有线程都进不来了
                }
            }
        }
        return singleton;
    }
}

//静态内部类的单例
class Singleton3{
    private Singleton3(){}

    private static class SingleTonHoler{
        private static Singleton3 singleton = new Singleton3();
    }

    public static Singleton3 getInstance(){
        return SingleTonHoler.singleton;
    }
}

//枚举的方式
enum Singleton4{
    SINGLETON;

    //可以省略此方法，通过Singleton.INSTANCE进行操作
    public static Singleton4 getInstance() {
        return Singleton4.SINGLETON;
    }
}
