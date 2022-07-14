package com.atguigu.demo;

import com.atguigu.bean.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;

/*
    此类用于演示 通过反射机制  去创建对象
        java.lang.Class
            c.newInstance();  通过空参构造器创建对象(不能传参)   为大家提供方便
        java.lang.reflect.Constructor
            con.newInstance(Object...params);   实参和形参必须要统一

            如果遇到私有的构造器，需要暴力访问
                con.setAccessible(true);
 */
public class Demo6 {
    @Test
    public void test1() throws Exception {
        //1. 创建Person对象
        Class c=Class.forName("com.atguigu.bean.Person");
        //2. 通过空参创建对象  ★
        Object o = c.newInstance();
        System.out.println(o);
        //3. 通过有参创建对象 (通过c调用方法是办不到)
        //3.1  先获得想要通过那个有参构造器创建对象
        Constructor con = c.getDeclaredConstructor(int.class, String.class, int.class);//获得私有构造器是可以滴
        System.out.println(con);
        //3.2 在通过这个构造器对象调用方法
        //3.3 权限压制  暴力访问
        con.setAccessible(true);
        Person zhangsan = (Person)con.newInstance(1, "张三", 18);
        System.out.println(zhangsan);

        //有一个具有私有构造器，在外界可以创建其对象吗？   反射可以
    }
}
