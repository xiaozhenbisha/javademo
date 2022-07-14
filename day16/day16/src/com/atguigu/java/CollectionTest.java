package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*
一、集合：集合就像是一种容器，用于存储、获取和操作对象的容器

1、数组的弊端
①数组的长度不可变  ②数组中没有提供可以查看有效元素个数的方法

2、集合的特点
①集合的长度是可变的
②集合中可以存储任意类型的对象
③集合中只能存储对象

3、集合框架
java.util.Collection : 是集合层次的根接口
    |--java.util.List :
    |--java.util.Set :
 */
public class CollectionTest {
    
    @Test
    public void test3(){
        //通过 Collection 接口的实现类 ArrayList ，创建实例
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add(new String("BB"));
        coll.add(new Person("张思瑞", 18));
        coll.add(123); //自动装箱

        //8. remove(Object obj) : 删除集合中指定元素
        //coll.remove(new Person("张思瑞", 18));

        //System.out.println(coll);

        //9. removeAll(Collection coll) : 删除 coll 中所有的元素
        Collection coll2 = new ArrayList();
        coll2.add("AAAAAA");
        coll2.add(new Person("张思瑞", 18));

        /*coll.removeAll(coll2);*/

        //10. retainAll(Collection coll):取交集
        coll.retainAll(coll2);

        System.out.println(coll);

        //11.toArray() : 将集合转换成数组
        Object[] objs = coll.toArray();

        for (Object obj : objs) {
            System.out.println(obj);
        }
    }
    
    
    @Test
    public void test2(){
        //通过 Collection 接口的实现类 ArrayList ，创建实例
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add(new String("BB"));
        coll.add(new Person("张思瑞", 18));
        coll.add(123); //自动装箱

        //5. addAll(Collection coll) : 将 coll 集合中所有的元素添加到当前集合中
        Collection coll2 = Arrays.asList(1,2,3,4,5); //将数组转换成集合

//        coll.addAll(coll2);
//        coll.add(coll2);
        System.out.println(coll);

        //6. contains(Object obj) : 判断集合中是否包含指定元素, 判断元素是否存在的依据是使用 equals() 方法
        boolean b = coll.contains(new String("BB"));
        System.out.println(b);

        boolean b2 = coll.contains(new Person("张思瑞", 18));
        System.out.println(b2);

        //7. containsAll(Collection coll) : 判断 coll 中所有元素是否包含在当前集合中
        Collection coll3 = new ArrayList();
        coll3.add("AAAAA");
        coll3.add(new Person("张思瑞", 18));

        System.out.println(coll.containsAll(coll3));
    }
    

    @Test
    public void test1(){
        //通过 Collection 接口的实现类 ArrayList ，创建实例
        Collection coll = new ArrayList();

        //1. add(Object o) : 添加元素到集合中
        coll.add("AA");
        coll.add(new String("BB"));
        coll.add(new Person("张思瑞", 18));
        coll.add(123); //自动装箱

        //2. size() : 查看集合中有效元素个数
        int size = coll.size();
        System.out.println(size);

        //3. clear() : 清空集合中所有的元素
        //coll.clear();

        //4. isEmpty() : 判断集合是否为空
        boolean b = coll.isEmpty();
        System.out.println(b);

        System.out.println(coll);

    }

}
