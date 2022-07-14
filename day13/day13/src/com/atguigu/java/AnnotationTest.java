package com.atguigu.java;

import java.util.ArrayList;
import java.util.List;

/*
一、注解：是 jdk1.5出的特性，是一个代码级别的说明。是一个元数据。
         在 Java 中以"@注解名" 的方式呈现

       String name = "atguigu";

1、JDK 内置的常用注解
    ① @Override ：用于注解方法，说明该方法必须是重写方法
    ② @Deprecated ：用于注解属性、方法、类。 说明已经过时
    ③ @SuppressWarnings ：用于抑制编译器警告

2、自定义注解
    格式：
        public @interface MyAnnotation{}

3、元注解
    @Retention : 描述注解的生命周期
    @Target : 描述注解可用于修饰哪些程序元素
    @Documented ：随之生成说明文档，但注解的生命周期必须是 RUNTIME
    @Inherited: 被它修饰的 Annotation 将具有继承性.
 */
public class AnnotationTest {

    public static void main(String[] args) {
        /*Person p = new Person();
        p.sleep();*/

        @SuppressWarnings("unused")
        int num = 10;

        List list = new ArrayList();
    }

}

@MyAnnotation("hahaha")
@Deprecated
class Person{

    @Deprecated
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @MyAnnotation("hello")
    public void sleep(){
        System.out.println("睡觉");
    }
}

class Student extends Person{

    @Override
    public void sleep(){
        System.out.println("学生上课偷偷睡觉");
    }

}