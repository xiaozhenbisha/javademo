package com.atguigu.java;

/*
一、final 修饰符：代表最终的，可用于修饰变量、方法、类

1. final 修饰的类不能被继承
2. final 修饰的方法不能被重写
3. final 修饰的变量叫常量，一旦被赋值，值不能改变。
        ①常量的命名规范：所有字母都大写，每个单词之间以“_”隔开. 如 XXX_YYY_ZZZ
        ②**常量没有默认值，在使用之前必须赋值。(直接显示赋值、构造器赋值、代码块赋值)
            若选择使用构造器为常量赋值，必须保证所有构造器都为该常量赋值
 */
public class FinalTest {
    public static void main(String[] args) {
       /* Person2 p = new Person2();
        System.out.println(p.NUM);

        //p.NUM = 200;

        Person2 p2 = new Person2(100);*/
    }

    /*public static void add(final int NUM){
    }*/

    public static void add(final Number number){
//        System.out.println(number.num++);
//        number = new Number();
    }
}

class Number{
    int num = 100;
}

class Person2{

    public final int NUM;

    public Person2(){
        this.NUM = 100;
    }

    public Person2(int num){
        this.NUM = 200;
    }


    public void eat(){

    }

}

class Student extends Person2{

    public void eat(){

    }

}