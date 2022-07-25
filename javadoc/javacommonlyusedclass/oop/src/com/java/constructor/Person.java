package com.java.constructor;

class Person{
    private String name = "张三";
    private int age;

    //声明一个构造器
    public Person(){
        System.out.println("Person's Constructor⋯⋯");
        cry();
        this.name = "张三";
    }

    public Person(String name){
        this.name = name;
    }


    public Person(String name, int age){
        this.name = name;
        this.age = age;
        //this.setName(name);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void cry(){
        System.out.println("哭。。。");
    }
}
