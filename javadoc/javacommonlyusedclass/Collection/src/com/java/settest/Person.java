package com.java.settest;

import java.util.Comparator;

public class Person implements Comparable {
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //重写 Object 类的 hashCode 方法，若对象的内容一样，生成的 hashCode 值也一样
    public int hashCode(){
        return name.hashCode() + age * 31;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name);
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Person){
            Person p = (Person) o;

            if(this.getAge() == p.getAge()){
                return this.getName().compareTo(p.getName());
            }else{
                return -(this.getAge() - p.getAge());
            }
        }

        return 0;
    }

}
