package com.java.interfaceandinnerclass;

public class InnerClassTest1 {
    public static void main(String[] args) {
        //创建静态内部类的实例
        Person1.Mobile pm = new Person1.Mobile();
        pm.show();

        //创建非静态内部类的实例
        Person1 p = new Person1();
        Person1.Computer pc = p.new Computer();
        pc.setName("IBM");
        //System.out.println(pc.getName());
    }
}

class Person1{

    private String name = "张三";
    private int age;

    public Person1() {
    }

    public Person1(String name, int age) {
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

    //成员内部类
    public class Computer{

        private String name = "联想";

        public Computer() {
        }

        public Computer(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            System.out.println(age);
            System.out.println("局部变量的name:" + name);
            System.out.println("Computer 内部类对象的name：" + this.name);
            System.out.println("Person1 外部类对象的name:" + Person1.this.name);

            System.out.println(this.getName());
            System.out.println(Person1.this.getName());
            this.name = name;
        }
    }

    //实现对类的隐藏
    private class Head{

    }

    //静态内部类
    static class Mobile{
        public void show(){
            System.out.println("静态内部类中的方法");
        }
    }
}