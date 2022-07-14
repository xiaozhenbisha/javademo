package com.atguigu.java;

/*
一、枚举：JDK 1.5后的特性，可以定义有限数量的可穷举数据集
         简而言之，当确定一个类有几个对象时，使用枚举

1、自定义枚举
①私有化构造器
②类的内部创建对象

2、使用 enum 关键字
    > valueOf(String name) : 根据枚举类对象的名称，获取对应的枚举类对象
    > values() : 获取当前枚举类中所有的枚举类对象，组成的数组

3、枚举类可以实现接口
 */
public class EnumTest {

    public static void main(String[] args) {
        /*Season spring = Season.SPRING;
        System.out.println(spring);*/

         /*Season winter = Season.WINTER;
        System.out.println(winter);*/

        /*switch(spring){
            case SPRING:
                System.out.println("春天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
        }*/

        /*Season spring = Season.valueOf("SPRING");
        System.out.println(spring);*/

        Season[] seasons = Season.values();

        for(Season s : seasons){
            s.show();
        }
    }

}
