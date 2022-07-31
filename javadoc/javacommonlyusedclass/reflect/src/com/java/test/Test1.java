package com.java.test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
     获得以下String类中的所有属性，并列出其详细信息
 */
public class Test1 {
    public static void main(String[] args) {
        Class c=String.class;
        Field[] Fields = c.getDeclaredFields();
        for (Field field : Fields) {
            System.out.println("属性的修饰符："+ Modifier.toString(field.getModifiers()));
            System.out.println("属性的类型："+field.getType());
            System.out.println("属性的名称："+field.getName());
        }
    }
}
