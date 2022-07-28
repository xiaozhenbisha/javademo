package com.java.listtest;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * 一、集合框架
 * java.util.Collection : 是集合层次的根接口
 *     |--java.util.List : 有序的，允许重复的。（List 系列集合都具有索引值）
 *            |--ArrayList：采用的数组结构。查询操作多时选择。
 *            |--LinkedList：采用的链表结构。增删操作多时选择。
 *            |--Vector ：
 *     |--java.util.Set : 无序的，不允许重复的。
 *             |--HashSet:是 Set 接口的典型实现类。
 *                  采用哈希算法。判断元素是否存在的依据是先比较两个对象的 hashCode 值是否存在，若不存在，则直接存储。
 *                  若 hashCode 值存在，则再通过 equals() 比较两个对象的内容。
 *
 *                  注意：重写 hashCode() 和 equals() 方法必须保持一致！
 *                  （若两个对象的内容相同生成的 hashCode 值要相同，同时 equals 方法必须返回true）
 *                 |--LinkedHashSet:
 *             |--TreeSet:
 */
public class SetTest {

    @Test
    public void test1(){
        Set set = new HashSet();
        set.add("AA");
        set.add("FF");
        set.add("CC");
        set.add("DD");

        String str1 = new String("BB");
        String str2 = new String("BB");
        set.add(str1);
        set.add(str2);

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        //若两个人的姓名年龄一样，视为同一个对象
        Person p1 = new Person("张思瑞", 18);
        Person p2 = new Person("张思瑞", 18);
        set.add(p1);
        set.add(p2);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println(set);
    }

}
