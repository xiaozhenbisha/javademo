package com.java.extendstest2;

/**
 * 一、子类继承父类后，类中各成员的特点：
 *     属性
 *     方法
 *     构造器
 *
 * 1、构造器的特点
 *     ①当子类继承父类后，子类中所有构造器的第一行第一句都有一个隐式的 super()
 *         super() 作用：调用父类无参构造器
 *         super() 目的：当子类继承父类后，继承了父类中所有的属性和方法，因此，子类需要知道父类
 *                       是如何进行初始化的。
 *     ②若父类中没有提供无参构造器，必须在子类“所有”构造器中显示调用父类中有参构造器
 *         （目的是要保证创建子类对象前先初始化父类）
 *     ③super() 必须写在当前构造器中可执行代码的首行
 *      this() 必须写在当前构造器中可执行代码的首行
 *
 *      因此，this() 和 super() 二者不能同时出现
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Student stu = new Student("学生张三", 18, 9527);
        System.out.println(stu.getName() + "," + stu.getAge() + "," + stu.getStuId());
    }
}

class Person{

    private String name;
    private int age;

    public Person(){

    }

    public Person(String name){
        this.name = "张三";
        System.out.println("Person's Constructor……");
    }

    public Person(String name, int age){
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
}

class Student extends Person{

    private int stuId;

    public Student(){}

    public Student(String name, int age){
        super("");
        System.out.println("Student's Constructor……");
    }

    public Student(String name, int age, int stuId){
        super(name, age);
        this.stuId = stuId;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }
}