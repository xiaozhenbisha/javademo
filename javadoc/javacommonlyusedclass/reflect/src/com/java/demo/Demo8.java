package com.java.demo;

import java.lang.reflect.Method;

/*
    通过反射去  调用方法
       Object method.invoke(Obejct obj, Object...params);  调用obj对象的method方法，params是参数,返回值是Object

    遇到私有方法怎么办？
        暴力破解   method.setAccessible(true);
    静态方法怎么办？
        obj位置传递null值
 */
public class Demo8 {
    public static void main(String[] args) throws Exception {
        //1. 创建Person对象
        Class c=Class.forName("com.atguigu.bean.Person");

        Object o = c.newInstance();

        //2. 调用方法   普通方法(需要对象)   静态方法
        //2.1 获得方法对象
        Method method = c.getDeclaredMethod("eat", String.class, int.class);
        //2.2 调用
        method.setAccessible(true);
        Object lisi = method.invoke(null, "李四", 20);//调用o对象的method方法,参数是李四和20
        System.out.println(lisi);
    }
}
