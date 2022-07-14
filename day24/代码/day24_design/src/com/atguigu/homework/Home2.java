package com.atguigu.homework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
案例：榨汁机(Juicer)榨汁的案例，分别有水果(Fruit)苹果(Apple)香蕉(Banana)桔子(Orange)榨汁(squeeze)
效果：
开发提示：
1、声明(Fruit)水果接口，包含榨汁抽象方法：void squeeze();
2、声明榨汁机(Juicer)，包含运行方法：public void run(Fruit f)，方法体中，调用f的榨汁方法squeeze()
3、声明各种水果类，实现(Fruit)水果接口，并重写squeeze();
4、在src下，建立配置文件：config.properties，并在配置文件中配上fruitName=xxx（其中xx为某种水果的全类名）
读取配置文件Map的实现类Properties(IO知识点)
5、在Test02测试类中，
（1）读取配置文件，获取水果类名，并用反射创建水果对象，
（2）创建榨汁机对象，并调用run()方法
 */
public class Home2 {
    public static void main(String[] args) {
        Properties pro=new Properties();
        try {
            pro.load(new FileInputStream("./day24_design/src/config.properties"));
            String fruitName = pro.getProperty("fruitName");//全类名字符串

            Class c=Class.forName(fruitName);
            Fruit o=(Fruit)c.newInstance();//o就是水果对象

            new Juicer().run(o);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

interface Fruit{
    void squeeze();
}
class Juicer{
    public void run(Fruit f){
        f.squeeze();
    }
}


class Apple implements Fruit{
    @Override
    public void squeeze() {
        System.out.println("苹果汁");
    }
}
