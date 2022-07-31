package com.java.bean;

public class Person extends Animal{

    int id;//一个属性java也会将其看做一个对象(谁的对象？java.lang.reflect.Field的对象)
    private static String name;
    private int age;
    protected double salary;

     Person(int id) {
        this.id = id;
    }

    private Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    private void eat(){
        System.out.println("吃饭");
    }
    private static void eat(String name,int a){
        System.out.println(name+"吃饭");
    }
    public String run(){
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
