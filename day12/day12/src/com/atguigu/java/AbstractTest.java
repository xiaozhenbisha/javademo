package com.atguigu.java;

/*
一、为什么使用抽象类：
        类用于描述现实生活中的一类事物，类中有属性、有方法，方法都有方法体。
        某种情况下，父类只能知道子类应该具备一个怎样的方法，但是不能明确知道子类是如何实现该方法。
        例如：几何图形（多态练习），所有几何图形都应该具备一个计算面积的方法，但是不同几何图形计算面积的方式不同

 Java 为上述问题提供了相应的解决办法
 Java 允许父类中只是提供一个方法的声明，不提供具体的实现
 具体的实现交给子类来完成，该方法称为“抽象方法”
 拥有一个或多个抽象方法的类，称为“抽象类”

 二、如何使用抽象：abstract
 1、abstract修饰的类称为“抽象类”
 ①格式： public abstract class 类名{}
 ②拥有一个或多个抽象方法的类必须是抽象类
 ③抽象类中可以有非抽象方法
 ④抽象类中可以没有抽象方法
 ⑤**抽象类不能创建实例
 ⑥抽象类中可以声明构造器。
    目的：子类继承父类后，子类继承父类中所有的属性和方法，因此子类需要知道父类如何进行初始化

 2、abstract 修饰的方法称为“抽象方法”
 ①格式：访问控制修饰符 abstract 返回值类型 方法名(参数列表);
 ②当子类继承父类后，若重写了父类中所有的抽象方法，该类是一个具体的类，可以创建实例。
 ③当子类继承父类后，若没有重写父类中“所有”的抽象方法，该类是一个抽象类，不能创建实例

 3、
 ①abstract 和 final 不能同时使用
 ②abstract 和 static 不能同时使用
 ③abstract 和 private 不能同时使用
 */
public class AbstractTest {

    public static void main(String[] args) {

        Chinese c1 = new Chinese();//本态
        c1.speak();

        Person p = new Chinese();//多态
        p.speak();//虚拟方法调用（动态绑定）

//        American a = new American();

    }

}

abstract class Person{

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

    //所有人都应该具备一个说话的功能，但是不同的人说话的方式不同
    public abstract void speak();

    public abstract void show();
}

class Chinese extends Person{
    public void speak(){
        System.out.println("中国人说汉语！");
    }

    public void show(){

    }
}

abstract class American extends Person{
    public void speak(){
        System.out.println("美国人说美语");
    }

    //public abstract void show();
}