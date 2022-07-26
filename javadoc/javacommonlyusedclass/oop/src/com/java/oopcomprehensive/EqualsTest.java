package com.java.oopcomprehensive;

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

        System.out.println(p1 == p2);
        System.out.println(p1 == p3);
        System.out.println(p2 == p3);*/

        //若两个人的姓名年龄一样，视为同一个人，equals 方法返回true
        //Person p1 = new Person("张三", 18);
       // Person p2 = new Person("张三", 18);

        //boolean b = p1.equals(p2);//false  true
        //System.out.println(b);
       // System.out.println(p2);
        String str1 = new String("AA");
        String str2 = new String("AA");

       // boolean b2 = str1.equals(str2);
        System.out.println(str1==str2);//true
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
