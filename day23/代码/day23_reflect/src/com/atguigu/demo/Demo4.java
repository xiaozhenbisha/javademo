package com.atguigu.demo;

import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
此类用于演示   通过反射获得类的方法信息    目的是后期要调用这些方法
    java.lang.Class
        getMethod(String name,Class...params);  根据名称和形参列表获得方法对象  公有的  包括父类的
        getDeclaredMethod(String name,Class...params); 本类中所有的方法对象  任意修饰符   不包括父类的
        getMethods();   获得所有的公有方法对象     公有的   包括继承下来的
        getDeclaredMethods()   获得本类中所有的方法对象    任意修饰符  不包括继承下来的
    java.lang.reflect.Method   (该类的对象代表一个方法)
        修饰符 返回值类型 方法名(形参列表){}    想要单独获得这些内容
        method.getModifiers()  获得修饰符  需要转换格式  String Modifier.toString(int)
        method.getReturnType()  获得返回值类型  返回的是Class对象
        method.getName()   获得方法名
        method.getParameterTypes()  获得形参列表   返回的是Class[]
 */
public class Demo4 {
    /*
    单独获得方法的详细信息
     */
    @Test
    public void test2() throws Exception {
        Class c=Class.forName("com.atguigu.bean.Person");
        Method[] declaredMethods = c.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println("修饰符："+ Modifier.toString(method.getModifiers()));
            System.out.println("返回值类型："+method.getReturnType());//返回值是一个Class对象
            System.out.println("方法名："+method.getName());
            System.out.println("-------形参列表--------");//可能会有n个
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("形参列表："+parameterType);
            }
        }
    }
    /*
        获得方法信息
     */
    @Test
    public void test1() throws Exception {
        Class c=Class.forName("com.atguigu.bean.Person");
       /* Method method =c.getMethod("eat",String.class);//空参eat方法
        System.out.println(method);*/
        /*Method eat = c.getDeclaredMethod("eat");
        System.out.println(eat);*/
        /*Method[] methods = c.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }*/
        Method[] declaredMethods = c.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
    }
}
