package com.java.demo;

import com.java.bean.Person;

/*
    此类用于演示 Class类的对象如何获得
类：     一组具有相同特性和相同行为对象的集合抽象成类
对象：    可以描述他的实体

     Class类是一个什么类？是由哪些对象抽象出来的类？
        由所有普通类在往上抽象出来的类

     第一次new Person()创建了两个对象，Class类对象，一个Person对象
     第n次new Person()创建一个，只有Persion对象

      //制作框架的时候，一般采用第三种
        //Spring框架可以帮助我们创建一个类的对象(全类名肯定是我们提供给框架的)
        //写框架的代码的时候，一般采用第三种
      那第三种什么时候创建Person呢?  Person类的Class对象？
 */
public class Demo2 {
    public static void main(String[] args) {
        //每个类在类加载的时候，都会创建一个Class类的对象指向普通类(jvm创建)
        //1. 如何去获得  4种
        //1.1 如果有类的类名  ☆
        Class c= Person.class;//获得Person类对应的Class对象
        System.out.println(c);//重写toString方法
        //1.2 如果有对象(Person)  ☆
        Person per=new Person();
        Class c1=per.getClass();
        System.out.println(c==c1);
        //1.3 如果全类名的字符串  ★     (编译阶段)不依赖于Person是否存在
        String str="com.atguigu.bean.Person1";
        try {
           Class c2= Class.forName(str);//通过反射操作Person类，先进行类加载
            System.out.println(c2==c1);
        } catch (ClassNotFoundException e) {//因为根据你的字符串有可能找不到类
            e.printStackTrace();
        }

        System.out.println("----------------");
        //1.4  通过类加载器(必须是应用程序类加载器)和全类名字符串
        try {
           Class c3= Demo1.class.getClassLoader().loadClass("com.atguigu.bean.Person1");
            System.out.println(c1==c3);
            //Demo1的类加载器，怎么可以加载Person类？   因为Demo1和Person都同一个类加载器
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
