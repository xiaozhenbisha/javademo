package com.java.extendstest;

/**
 * 一、子类继承父类后，类中各成员的特点：
 *     属性
 *     方法
 *     构造器
 *
 *
 * 1、当子类继承父类后，若子类出现了与父类方法签名一模一样的方法时，创建子类对象
 *    调用该方法，实际运行的是子类的方法，如同将父类的方法覆盖了一样
 *         ——————————方法的重写（方法的覆盖 Override）
 *  若父类中的方法对于子类来说不适用时，子类可以对父类中的方法进行重写
 *
 * 2、方法重写的规则：
 * 前提：子类继承父类
 * ①方法名必须相同
 * ②参数列表必须相同（参数的个数、参数的类型）
 * ③子类重写方法的访问控制修饰符不能小于父类被重写方法的访问控制修饰符
 * ④子类方法返回值类型必须是父类被重写方法返回值类型的子类
 * (通常使用时，使方法签名一模一样)
 *
 *
 * 【面试题】 Override 和 Overload 的区别？
 */
public class ExtendsTest3 {
    public static void main(String[] args) {
        Student1 stu = new Student1();
        stu.eat();
    }
}
class Person1{

    String name;
    int age;

    public Person1 eat(){
        System.out.println("吃饭");
        return null;
    }

    public void sleep(){
        System.out.println("睡觉");
    }
}

class Student1 extends Person1{

    public Student1 eat(){
        super.eat();
        System.out.println("学生吃大餐");
        return null;
    }

}