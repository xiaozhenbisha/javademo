package com.java.demo;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/*
    此类用于演示  获得构造器
       java.lang.Class
            getConstructor(Class...params);  根据形参列表获得构造器对象   公有的     和父类有关？没关
            getDeclaredConstructor(Class...params)   获得本类中任意修饰符的构造器对象
            getConstructors();  获得所有公有的构造器对象
            getDeclaredConstructors()  获得所有的构造器对象
       java.lang.reflect.Constructor
            修饰符 构造器名称(形参列表){}
            和方法获得信息的内容是一样的
 */
public class Demo5 {

    @Test
    public void test2()throws Exception {
        Class c=Class.forName("com.atguigu.bean.Person");
        Constructor[] declaredConstructors = c.getDeclaredConstructors();
        for (Constructor constructor : declaredConstructors) {
            System.out.println("修饰符："+ Modifier.toString(constructor.getModifiers()));

            System.out.println("名称(类名)："+constructor.getName());

            Class[] parameterTypes = constructor.getParameterTypes();
            for (Class parameterType : parameterTypes) {
                System.out.println(parameterType);
            }
        }
    }

    @Test
    public void test1() throws Exception {
        Class c=Class.forName("com.atguigu.bean.Person");
        /*Constructor constructor =  c.getConstructor(int.class);
        System.out.println(constructor);*/

        /*Constructor declaredConstructor = c.getDeclaredConstructor(int.class);
        System.out.println(declaredConstructor);*/

       /* Constructor[] constructors = c.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }*/

        Constructor[] declaredConstructors = c.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
    }
}
