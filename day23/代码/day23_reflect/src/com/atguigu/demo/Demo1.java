package com.atguigu.demo;

import com.atguigu.bean.Person;

import java.util.Date;

/*
    反射机制(难)：方法比较多[源码不适合现在看]
        主要的学习内容是理解(以后使用的框架【框架内部有可能会用到反射：可以更好的理解框架原理】)
        工作后敲反射机制的代码不多，除非进入的公司是开发框架的
    正常的操作: 类、接口 ---> 实例化对象 ---> 访问其属性，调用其方法
    反射的操作: 类名、对象、全类名字符串  --->  获得类的所有内容  ---> 访问其属性，调用其方法
        "com.atguigu.bean.Person"   --->   获得Person类的所有内容(包括私有属性的)

    最主要的目的是为了自动化(框架的开发和使用)
        框架的作用：就是为了帮助我们程序员做一些事情
        讲解IO流的时候，做个文件内容一个词频的统计(完全是我们手写的)
                hadoop中词频的统计是统计一个目录(指定好需要统计的目录，指定好结果存放的位置)
        框架的作用就是，将我们程序员从繁杂的代码中替换出来，用更多的资源去分析业务
                Spring(Java端的框架)    IOC(控制反转)   主要就是帮助你去维护对象(创建，赋值，调用方法...)
        给框架提供一个全类名字符串，Spring就可以帮助我们去创建对象，并做一系列的事情
    学习反射主要就是理解框架时如何自动化的

    学习内容：
        如何通过反射获得  类的结构信息(属性、方法、构造器、内部类、父类、父接口、包名...)
        通过反射去创建对象、访问属性值、调用方法(★)
    类的加载:
        ① 类的加载时机(初始化的时机)
            第一次创建类的对象时
            第一次创建其子类的对象时
            第一次调用其静态资源(通过类名调用和main)
            第一次获得该类的Class对象时(通过反射)
     类的加载过程
        ① load --> link  --> 初始化
     类加载器：
        功能：加载类
        引导类加载器（Bootstrap Classloader）又称为根类加载器
            它负责加载jre/rt.jar核心库(jdk给我们提供的类都是由此类加载器加载)    一般返回null
        扩展类加载器（Extension ClassLoader）
            使用第三方的jar包(框架、工具)      在java项目中导入过第三方的jar?  junit
        应用程序类加载器（Application Classloader）
            其实就是我们自己创建的类(自己创建的类的类加载器都是同一个)


 */
public class Demo1 {
    public static void main(String[] args) {
        //获得Person类的类加载器对象
        ClassLoader classLoader = Person.class.getClassLoader();
        System.out.println(classLoader);

        ClassLoader classLoader1 = Demo1.class.getClassLoader();
        System.out.println(classLoader1);

        ClassLoader classLoader2 = Date.class.getClassLoader();
        System.out.println(classLoader2);



        /*Person person1=new Person();
        person1.setName("张三");
        Person person2=new Person();
        person2.setName("李四");

        System.out.println(person1);//李四
        System.out.println(person2);//李四*/
    }
}
