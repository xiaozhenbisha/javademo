package com.java.demo;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
    通过Class类的对象(普通类),获得类的结构信息   反射机制的功能(非常强大)
        1. 属性
            java.lang.Class
                getField(String name) 根据属性名去获得公有的一个属性对象(java.lang.reflect.Field) 包括继承下来的
                getDeclaredField(String name)  据属性名去获得一个任意访问修饰符的属性 不包括父类继承下来的
                getFields()   获得所有的公有的属性  包括父类继承下来的
                getDeclaredFields()   获得本类中所有的属性   不包括父类继承下来的
            java.lang.reflect.Field  (属性对象的类)    这个属性的修饰符？这个属性的类型又是什么？属性名称？属性的值？
                修饰符 类型 名称[=值]
                getModifiers();//获得修饰符  但是返回的是int值，需要通过 Modifier.toString(modifiers);处理
                getType();//属性的类型  通过Class对象去表示！
                field.getName();

                值后面讲  ★
        2. 方法
        3. 构造器
        4. 包、父类、父接口
            getSuperclass(); 获得父类的Class类型

       练习：
            获得以下String类中的所有属性，所有的方法，所有的构造器，并列出其详细信息
 */
public class Demo3 {
    /*
    属性的具体信息获得
     */
    @Test
    public void test1(){
        try {
            Class c=Class.forName("com.atguigu.bean.Person");
            Field field = c.getField("name");//属性对象
            String name = field.getName();
            System.out.println("属性名:"+name);

            Class type = field.getType();//属性的类型  通过Class对象去表示！
            System.out.println("类型"+type);

            int modifiers = field.getModifiers();//获得修饰符
            String s = Modifier.toString(modifiers);
            System.out.println("修饰符："+s);//编号需要记忆吗？可以进行格式转化
            //八大基本数据类型和void都是本身



        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //需求1：获得Person类的属性信息
        try {
            //1. 获得Person类的Class对象
            Class c=Class.forName("com.atguigu.bean.Person");
            //2. 通过class类的对象去获得属性信息
            Field field = c.getField("name");
            System.out.println(field);

            Field name = c.getDeclaredField("name");//我想获得父类中的非公有属性，怎么办？
            System.out.println(name);

            Class superclass = c.getSuperclass();//获得父类的Class对象
            Field age = superclass.getDeclaredField("id1");
            System.out.println(age);

            System.out.println("----------所有公有--------------");
            Field[] fields = c.getFields();
            for (Field field1 : fields) {
                System.out.println(field1);
            }
            System.out.println("-------本类所有----------");
            Field[] declaredFields = c.getDeclaredFields();
            for (Field declaredField : declaredFields) {
                System.out.println(declaredField);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
