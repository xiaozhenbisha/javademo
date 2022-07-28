package com.java.settest;

import org.junit.Test;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

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
 *                 |--LinkedHashSet: 相较于 HashSet 多了链表维护元素的顺序。增删效率低于 HashSet。 遍历操作的效率高于 HashSet
 *             |--TreeSet:拥有指定的排序方式
 *                  自然排序：Comparable
 *                     ①需要添加到 TreeSet 结合中对象的类实现 Comparable 接口
 *                     ②实现接口中的 compareTo(Object o) 方法
 *                  定制排序：Comparator
 *                     ①声明一个类实现 Comparator 接口
 *                     ②实现接口中的 compare(Object o1, Object o2)
 *                     ③将该实现类的实例作为参数，传递给 TreeSet 的构造器
 */
public class SetTest {
    @Test
    public void test5(){
        TreeSet ts = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Person && o2 instanceof Person){
                    Person p1 = (Person) o1;
                    Person p2 = (Person) o2;

                    if(p1.getAge() == p2.getAge()){
                        return p1.getName().compareTo(p2.getName());
                    }else{
                        return p1.getAge() - p2.getAge();
                    }
                }

                return 0;
            }
        });

        ts.add(new Person("张三", 18));
        ts.add(new Person("李四", 20));
        ts.add(new Person("王五", 35));
        ts.add(new Person("赵六", 8));
        ts.add(new Person("田七", 22));

        System.out.println(ts);
    }


    @Test
    public void test4(){
        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Person && o2 instanceof Person){
                    Person p1 = (Person) o1;
                    Person p2 = (Person) o2;

                    if(p1.getAge() == p2.getAge()){
                        return p1.getName().compareTo(p2.getName());
                    }else{
                        return p1.getAge() - p2.getAge();
                    }
                }

                return 0;
            }
        };

        TreeSet ts = new TreeSet(com);
        ts.add(new Person("张三", 18));
        ts.add(new Person("李四", 20));
        ts.add(new Person("王五", 35));
        ts.add(new Person("赵六", 8));
        ts.add(new Person("田七", 22));

        System.out.println(ts);
    }


    @Test
    public void test3(){
        class MyComparator implements Comparator {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Person && o2 instanceof Person){
                    Person p1 = (Person) o1;
                    Person p2 = (Person) o2;

                    if(p1.getAge() == p2.getAge()){
                        return p1.getName().compareTo(p2.getName());
                    }else{
                        return -(p1.getAge() - p2.getAge());
                    }
                }

                return 0;
            }
        }

        Comparator com = new MyComparator();

        TreeSet ts = new TreeSet(com);
        ts.add(new Person("张三", 18));
        ts.add(new Person("李四", 20));
        ts.add(new Person("王五", 35));
        ts.add(new Person("赵六", 8));
        ts.add(new Person("田七", 22));

        System.out.println(ts);
    }

    @Test
    public void test2(){
        Comparator com = new MyComparator();

        TreeSet ts = new TreeSet(com);
        ts.add(new Person("张三", 18));
        ts.add(new Person("李四", 20));
        ts.add(new Person("王五", 35));
        ts.add(new Person("赵六", 8));
        ts.add(new Person("田七", 22));

        System.out.println(ts);
    }


    @Test
    public void test1(){
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("AA");
        lhs.add("BB");
        lhs.add("CC");
        lhs.add(11);
        lhs.add(22);
        lhs.add(33);

        System.out.println(lhs);

    }
}
