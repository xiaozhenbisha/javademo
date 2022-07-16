package cn.ybzy.demo;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class ThreadTest8 {

}


class Taxi{
    private Point location, destination;
    private Dispatcher dispatcher;

    public Taxi(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }


    public synchronized Point getLocation() {
        return location;
    }

    // setLocation 需要Taxi内置锁
    public void setLocation(Point location) {
//        this.location = location;
//        if (location.equals(destination)) //理解为locatino的位置是destination的5km之内
//            // 调用notifyAvailable()需要Dispatcher内置锁
//            dispatcher.notifyAvailable(this);

        boolean flag;

        //内置锁保护的范围做了缩小
        synchronized (this){
            this.location = location;
            flag = location.equals(destination);
        }
        //当程序运行完毕了此代码块，锁就被释放了

        if(flag){
            //在这里地方需要Dispatcher锁，就没关系了，没有锁交替
            dispatcher.notifyAvailable(this); //开放调用
        }





    }
}


class Dispatcher{
    private final Set<Taxi> taxis;
    private final Set<Taxi> availableTaxis;

    public Dispatcher() {
        taxis = new HashSet<Taxi>();
        availableTaxis = new HashSet<Taxi>();
    }

    public synchronized void notifyAvailable(Taxi taxi) {
        availableTaxis.add(taxi);
    }

    // 调用getImage()需要Dispatcher内置锁
    public  Image getImage() {
//        Image image = new Image();
//        for (Taxi t : availableTaxis) {
//            // 调用getLocation()需要Taxi内置锁
//            image.drawMarker(t.getLocation());
//        }
//        return image;
        Set<Taxi> copy;
        synchronized (this){
            copy = new HashSet<Taxi>(availableTaxis);
        }
        Image image = new Image();
        for (Taxi t : copy) {
            // 调用getLocation()需要Taxi内置锁
            image.drawMarker(t.getLocation());
        }
        return image;
    }
}



class Image {
    public void drawMarker(Point p) {
    }
}
