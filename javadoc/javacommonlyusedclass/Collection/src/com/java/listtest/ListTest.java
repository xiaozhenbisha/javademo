package com.java.listtest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 一、集合框架
 * java.util.Collection : 是集合层次的根接口
 *     |--java.util.List : 有序的，允许重复的。（List 系列集合都具有索引值）
 *            |--ArrayList：采用的数组结构。查询操作多时选择。
 *            |--LinkedList：采用的链表结构。增删操作多时选择。
 *            |--Vector ：
 *     |--java.util.Set : 无序的，不允许重复的。
 *
 * 二、List与ArrayList 特有方法
 * void add(int index, Object ele) : 在指定索引位置添加元素
 * boolean addAll(int index, Collection eles)
 * Object get(int index) : 查询指定索引位置的元素
 * int indexOf(Object obj) : 查询某个元素所在的索引位置
 * int lastIndexOf(Object obj)
 * Object remove(int index)
 * Object set(int index, Object ele)
 * List subList(int fromIndex, int toIndex) : 获取子集合，包含头不包含尾
 *
 * 三、LinkedList 特有的方法
 * addFirst()
 * addLast()
 *
 * getFirst()
 * getLast()
 *
 * removeFirst()
 * removeLast()
 */
public class ListTest {
    @Test
    public void test4(){
        MyQueue mq = new MyQueue();
        mq.add("AA");
        mq.add("BB");
        mq.add("CC");
        mq.add("DD");
        mq.add("EE");

        while(!mq.isNull()){
            Object obj = mq.get();
            System.out.println(obj);
        }
    }

    @Test
    public void test3(){
        LinkedList ll = new LinkedList();
        ll.addFirst("AA");
        ll.addFirst("BB");
        ll.addFirst("CC");
        ll.addFirst("DD");
        ll.addFirst("EE");

        ll.addLast("FF");

        Object obj = ll.getFirst();
        System.out.println(obj);

        Object obj2 = ll.getLast();
        System.out.println(obj2);

        System.out.println(ll);

        Object obj3 = ll.removeFirst();
        System.out.println(obj3);

        Object obj4 = ll.removeLast();
        System.out.println(obj4);

        System.out.println(ll);
    }


    @Test
    public void test2(){
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("DD");
        list.add("BB");
        list.add("BB");
        list.add("BB");

        int index = list.indexOf("PP");
        System.out.println(index);

        index = list.lastIndexOf("BB");
        System.out.println(index);

        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.set(3, "EE");
        System.out.println(list);

        List list3 = list.subList(1, 3);
        System.out.println(list3);
    }


    @Test
    public void test1(){
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("DD");

        list.add(1, "ff");

        List list2 = new ArrayList();
        list2.add("GG");
        list2.add("JJ");

        list.addAll(1, list2);

        System.out.println(list);

        Object obj = list.get(1);
        System.out.println(obj);

    }
}
