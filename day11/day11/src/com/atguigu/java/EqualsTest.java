package com.atguigu.java;

/*
一、 public boolean equals(Object obj) ： 用于比较两个对象是否相等
①在 java.lang.Object 类中
②equals() 只能比较两个引用数据类型
③ Object 类中的 equals() 比较的是两个对象的地址值。（通过查看源码发现，实际使用 == 完成的）
④若 Object 类中的 equals 对于我们来说不适用，我们可以对其进行重写


1. "==" 运算符：
基本数据类型：比较两个基本数据类型的 值 是否相等
引用数据类型：比较两个引用数据类型的 地址值 是否相等

【面试题】 "==" 和 equals 的区别？
 */
public class EqualsTest {

    public static void main(String[] args) {
        /*int a = 65;
        char ch = 'A';
        double d = 65.0;

        System.out.println(a == ch);
        System.out.println(ch == d);
        System.out.println(a == d);*/

       /* Person p1 = new Person("张三", 18);
        Person p2 = new Person("张三", 18);

        Person p3 = p1;

        System.out.println(p1 == p2);   this == obj
        System.out.println(p1 == p3);
        System.out.println(p2 == p3);*/

        //若两个人的姓名年龄一样，视为同一个人，equals 方法返回true
        Person p1 = new Person("张三", 18);
        Person p2 = new Person("张三", 18);

        boolean b = p1.equals(p2);//false  true
        System.out.println(b);

        /*String str1 = new String("AA");
        String str2 = new String("AA");

        boolean b2 = str1.equals(str2);
        System.out.println(b2);//true*/
    }

}

class Person /*extends java.lang.Object*/{

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

    //重写 Object 类的 toString
    public String toString(){
        return "姓名：" + name + " 年龄：" + age;
    }

    //重写 Object 类的 equals
    public boolean equals(Object obj){
        if(obj instanceof Person){
            Person p = (Person) obj;

            if(p.getName().equals(this.getName()) && p.getAge() == this.getAge()){
                return true;
            }
        }

        return false;
    }
}