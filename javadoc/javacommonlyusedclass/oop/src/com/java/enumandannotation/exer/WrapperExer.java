package com.java.enumandannotation.exer;

/**
 * 编写程序，main方法中接收两个数字字符串参数；
 * 将第一个字符串直接转为Integer对象；
 * 将第二个字符串解析int整数，然后用此整数构建Integer对象；
 * 使用人工拆箱，获得上述两个对象int整数值，求和打印出来；
 * 使用自动拆箱，计算两数之积并打印出来。
 */
public class WrapperExer {
    public static void main(String[] args) {
        Integer num1 = new Integer(args[0]);
        int n = Integer.parseInt(args[1]);
        Integer num2 = new Integer(n);

        int n1 = num1.intValue();
        int n2 = num2.intValue();

        System.out.println("和为：" + (n1 + n2));

        int n3 = num1;
        int n4 = num2;
        System.out.println("乘积为：" + n3 * n4);
    }
}
