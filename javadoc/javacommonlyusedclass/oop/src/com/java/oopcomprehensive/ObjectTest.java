package com.java.oopcomprehensive;

/**
 * 一、java.lang.Object 类：是所有类的父类。若一个类没有显示的继承任何类时，默认 extends java.lang.Object
 * 注意：java.lang 是默认包
 * ①既然 Object 类是所有类的父类，因此 Object 类中的内容是最具共性的，所有类都适用
 * ②既然 Object 类是所有类的父类，因此子类可以继承 Object 所有的方法。
 * ③既然 Object 类是所有类的父类，若 Object 类中方法对于子类来说不适用，子类可以重写 Object 类中的方法
 *
 * 1. public String toString(): 用于返回当前对象的字符串表现形式
 * ① 在 java.lang.Object 类中
 * ② 当直接输出对象的引用时，默认调用 toString() 方法
 * ③ Object 类中的 toString() 方法返回的格式为：
 *     getClass().getName() + '@' + Integer.toHexString(hashCode())
 * ④因此，Object类中的 toString 对于我们来说不适用，我们可以对其进行重写
 */
public class ObjectTest {
    public static void main(String[] args) {
        Person p = new Person("张三", 18);

        System.out.println(p.toString());
        System.out.println(p);
    }
}
