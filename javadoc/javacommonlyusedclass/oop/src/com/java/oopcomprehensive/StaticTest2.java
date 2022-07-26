package com.java.oopcomprehensive;

public class StaticTest2 {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        //p1.cry();

        /*System.out.println(p1.getName());*/

        Person1 p2 = new Person1("");
        //p2.cry();

        /*Person1 p3 = new Person1("张三", 18);*/
        //p3.cry();
    }
}

class Person1{

    private String name = "张三";
    private int age;

    public Person1() {
        //cry();
        System.out.println("Person's Constructor……");
    }

    public Person1(String name){
        //cry();
    }

    public Person1(String name, int age) {
        //cry();
        this.name = name;
        this.age = age;
    }

    static{
        System.out.println("静态代码块1……");
    }

    static{
        System.out.println("静态代码块3……");
    }


    static{
        System.out.println("静态代码块2……");
    }

    {
        //cry();
        this.name = "李四";
        System.out.println("非静态代码块1……");
    }

    {
        System.out.println("非静态代码块3……");
    }

    {
        System.out.println("非静态代码块2……");
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

    public void cry(){
        System.out.println("哭……");
    }

    @Override
    public String toString() {
        return "Person1{" +  "name='" + name + '\'' + ", age=" + age + '}';
    }
}