package com.java.settest;

import org.junit.Test;

import java.util.*;

/**
 * 集合的遍历：
 *
 * 1. 增强 for 循环
 *
 *     for(被遍历集合中元素的数据类型 变量名 : 被遍历的集合){
 *
 *     }
 *
 * 2. Iterator 迭代器
 *
 * （了解）
 * 3、ListIterator ：是 List 系列集合特有的迭代器
 */
public class IteratorTest {
    @Test
    public void test6(){
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("DD");
        list.add("EE");

        //需求：判断若集合中元素的值为“BB”, 则在该位置添加一个 "bbbbb"
        /*Iterator it = list.iterator();

        while(it.hasNext()){
            Object obj = it.next();

            if(obj.equals("BB")){
                list.add("bbbbb");
            }
        }*/

        ListIterator li = list.listIterator();

        while(li.hasNext()){
            Object obj = li.next();

            if(obj.equals("BB")){
//                li.add("bbbbb");
                li.set("bbbbb");
            }
        }

        for (Object o : list) {
            System.out.println(o);
        }
    }

    @Test
    public void test5(){
        Set set = new HashSet();
        set.add("AA");
        set.add("BB");
        set.add("CC");
        set.add("DD");
        set.add("EE");

        //1. 获取当前集合的 Iterator 迭代器
        Iterator it = set.iterator();

        //2. 通过 hasNext 与 next 获取集合中的元素
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }


    @Test
    public void test4(){
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("DD");
        list.add("EE");

        Iterator it = list.iterator();

        //如下是错误的写法
        /*while(it.next() != null){
            Object obj = it.next();
            System.out.println(obj);
        }*/

        //通常一个 hasNext() 配合一个 next() 使用
        /*while(it.hasNext()){
            Object obj = it.next();
            System.out.println(it.next());
        }*/
    }

    @Test
    public void test3(){
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("DD");
        list.add("EE");

        //1. 获取当前集合的迭代器
        Iterator it = list.iterator();

        //2. 通过 hasNext() 与 next() 的配合使用，获取集合中的元素
        while(it.hasNext()){
            Object obj = it.next();
            String str = (String) obj;
            System.out.println(str.toLowerCase());
        }
    }

    @Test
    public void test2(){
        Set set = new HashSet();
        set.add("AA");
        set.add("BB");
        set.add("CC");
        set.add("DD");
        set.add("EE");

        for(Object obj : set){
            System.out.println(obj);
        }
    }


    @Test
    public void test1(){
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("DD");
        list.add("EE");

        System.out.println(list);

        for(Object obj : list){
            String str = (String) obj;
            System.out.println(str.toLowerCase());
        }
    }

}
