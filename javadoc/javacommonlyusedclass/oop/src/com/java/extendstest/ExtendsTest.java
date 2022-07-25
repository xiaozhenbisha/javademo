package com.java.extendstest;

/*
一、面向对象的特性之二：继承

问题：当创建 Student 和 Employee 类时，产生了大量的共性内容
解决：将多个类中的共性内容进行提取，提取到相应的 Java 类中， 与之建立关系

1、 继承：
    关键字： extends  ----  "扩展" 明确子类是父类的扩展
    例如：
        class A extends B{}

        子类：A  父类（超类、基类、SuperClass）：B

2. 通过继承，子类可以继承父类中所有的属性和方法。

3. 继承的注意：
    ①不能为了简化代码，获取某功能而继承，若要继承，两个类之间必须满足一定的所属关系：is a
    ②Java 只支持单继承，不支持多继承（一个父类可以有多个子类，但是一个子类只能有一个父类）
    ③Java 支持多层继承

 */
public class ExtendsTest {

    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "学生张三";
        stu.age = 18;
        stu.stuId = 9527;

        stu.eat();
        stu.sleep();
        stu.study();

        System.out.println(stu.name + "," + stu.age + "," + stu.stuId);

        Employee emp = new Employee();
        emp.name = "职员王五";
        emp.age = 20;

        emp.eat();
        emp.sleep();
        emp.work();
        System.out.println(emp.name + "," + emp.age);

        Manager mgr = new Manager();
        mgr.name = "经理赵六";
        mgr.age = 35;

        mgr.eat();
        mgr.sleep();
        mgr.work();
        System.out.println(mgr.name + "," + mgr.age);
    }

}

class Person{
    String name;
    int age;

    public void eat(){

        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }
}

class Student extends Person{

    int stuId;

    public void study(){
        System.out.println("学习");
    }

}

class Employee extends Person{

    /*String name;
    int age;

    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }*/

    public void work(){
        System.out.println("工作");
    }
}

class Manager extends Employee{

}