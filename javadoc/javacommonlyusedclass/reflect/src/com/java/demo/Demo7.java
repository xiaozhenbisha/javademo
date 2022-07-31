package com.java.demo;

import java.lang.reflect.Field;

/*
    此类用于演示   通过反射访问属性
        Field
            field.set(Object obj,Object value);  给obj对象设置field属性值为values
            Object returnValue field.get(Object obj)  获得obj对象的field属性值
        私有属性怎么办？依然是暴力访问
            field.setAccessible(true);
        如果遇到静态属性？
            有对象的情况下和上述操作一样
            没有对象的情况下怎么办？   类名.属性
                将obj的位置写成null就可以
 */
public class Demo7 {

    public static void main(String[] args) throws Exception {
        //1. 创建Person对象
        Class c=Class.forName("com.atguigu.bean.Person");

        //创建一个对象   o   Person的一个对象
//        Object o = c.newInstance();

        //2. 设置或获取普通属性值   普通属性值是需要对象的
        //2.1 需要获得属性对象
        Field field = c.getDeclaredField("name");
        System.out.println(field);
        //2.2 操作
        //①  设置属性值
        field.setAccessible(true);

        field.set(null,"张三");//给o对象设置field属性的值为张三
        //②  取属性值
        Object o1 = field.get(null);//获得o对象的field属性值
        System.out.println("取到的属性值："+o1);
//        System.out.println(o);

    }

}
