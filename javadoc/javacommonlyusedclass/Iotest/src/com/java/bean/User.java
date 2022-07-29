package com.java.bean;

import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private transient String name;//源码中会有
    private static int age;//静态的
    private Dog dog;//宠物

    public User(int id, String name, int age,Dog dog) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dog=dog;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}'+dog;
    }
}
