package com.atguigu.java;

/*
一、多态的应用之一：多态数组
 */
public class PolymorphismTest3 {

    public static void main(String[] args) {

        Person1[] persons = new Person1[5]; //多态数组，不仅可以存 Person1 本类类型的对象及 Person1 子类类型对象

        persons[0] = new Person1();
        persons[1] = new Man();
        persons[2] = new Woman();
        persons[3] = new Man();
        persons[4] = new Woman();

        for(int i = 0; i < persons.length; i++){
            /*Person1 p = persons[i]; //多态
            p.eat(); //虚拟方法调用（动态绑定）
            p.sleep();*/

            persons[i].eat();
            persons[i].sleep();
        }

        System.out.println("----------------------------------");

        for(Person1 p : persons){//多态
            p.eat();//虚拟方法调用
            p.sleep();
        }
    }

}
