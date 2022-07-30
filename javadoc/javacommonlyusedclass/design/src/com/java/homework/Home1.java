package com.java.homework;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
1、声明一个类：com.atguigu.test01.demo.AtguiguDemo，
（1）包含静态变量：学校school（显式初始化为"尚硅谷"）
（2）包含属性：班级名称className
（3）并提供构造器，get/set等
（4）实现Serializable和Comparable接口（按照班级名称排序）
2、在测试类Test01的test01()测试方法中，
    用反射获取AtguiguDemo类的Class对象，并获取它的所有信息，包括类加载器、包名、类名、父类、父接口、属性、构造器、方法们等。
3、在测试类Test01的test02()测试方法中，用反射获取school的值，并修改school的值为“尚硅谷大学”，
    然后再获取school的值
4、在测试类Test01的test03()测试方法中，用反射创建AtguiguDemo类的对象，
    并设置班级名称className属性的值，并获取它的值
5、在测试类Test01的test04()测试方法中，用反射获取有参构造创建2个AtguiguDemo类的对象，
    并获取compareTo方法，调用compareTo方法，比较大小。
 */
public class Home1 {
    @Test
    public void test04() throws Exception {
        Class c = Class.forName("com.atguigu.homework.AtguiguDemo");

        Constructor constructor = c.getDeclaredConstructor(String.class);
        Object o1 = constructor.newInstance("class1");
        Object o2 = constructor.newInstance("class1");

        Method method = c.getDeclaredMethod("compareTo", AtguiguDemo.class);
        Object invoke = method.invoke(o1, o2);
        System.out.println("返回值："+invoke);

    }
    @Test
    public void test03() throws Exception {
        Class c=Class.forName("com.atguigu.homework.AtguiguDemo");
        Object o = c.newInstance();
        Field className = c.getDeclaredField("className");
        className.setAccessible(true);
        className.set(o,"class1");
        System.out.println(className.get(o));
    }
    @Test
    public void test02() throws Exception {
        Class c=Class.forName("com.atguigu.homework.AtguiguDemo");
        Field school = c.getDeclaredField("school");
        school.setAccessible(true);
        Object o = school.get(null);
        System.out.println(o);
        school.set(null,"尚硅谷大学");
        System.out.println(school.get(null));

    }
    @Test
    public void test01(){
        try {
            Class c=Class.forName("com.atguigu.homework.AtguiguDemo");
            System.out.println("类加载器对象："+c.getClassLoader());
            System.out.println("包名："+c.getPackage().getName());
            System.out.println("父类："+c.getSuperclass().getName());
            Class[] interfaces = c.getInterfaces();
            for (Class anInterface : interfaces) {
                System.out.println("父接口："+anInterface);
            }
            System.out.println("===================================");

            Field[] Fields = c.getDeclaredFields();
            for (Field field : Fields) {
                System.out.println("属性："+field);
            }

            Method[] methods = c.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("方法"+method);
            }

            Constructor[] constructors = c.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                System.out.println("构造器"+constructor);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
