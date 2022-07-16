package com.atguigu.exer;

import java.util.TreeSet;

/*
编写程序，在main方法中接收5个参数整数字符串；
创建TreeSet类型的集合（使用泛型），将5个字符串以整数形式添加到集合中；
增强型for循环遍历该集合，打印所有元素，并将所有元素之和打印出来。
 */
public class GenericExer {

    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        for (int i = 0; i < args.length; i++) {
            ts.add(new Integer(args[i]));
        }

        for(Integer num : ts){
            System.out.println(num);
        }

    }

}
