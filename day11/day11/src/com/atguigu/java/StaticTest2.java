package com.atguigu.java;

/*
一、类的成员之一：代码块（属性、方法、构造器）

1. 非静态代码块（初始化块）：
①格式：类中的一对 {}
②在每次创建对象时执行
③非静态代码块的执行优先于对象
④非静态代码块用于为对象进行初始化(通常为多个构造器中的共性内容进行初始化)
⑤非静态代码块可以有多个，依次向下的顺序执行

2.为属性赋初始值的方式
①默认值（缺省值）
②直接显示赋值
③构造器赋值
④代码块

顺序：①  ②④   ③
注意：②④ 顺序执行

3. 静态代码块：
①格式： static{}
②静态代码块随着类的加载而加载,并且只加载一次
③静态代码块的执行优先于非静态代码块
④静态代码块中不能使用非静态成员，也不能使用 this 和 super
⑤静态代码块可以有多个，依次向下的顺序执行
 */
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
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}