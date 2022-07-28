package com.java.collectiontest.java;

import com.java.collectiontest.exer.Student;
import org.junit.Test;

import java.util.*;

/**
 * 一、泛型：在 Java 中以 "<>" 的形式呈现，“<>”写引用数据类型，用于限制数据类型
 *
 * 1、集合中使用泛型:
 * (若集合中不使用泛型，意味着集合中可以存储任意类型的对象，
 * 若要具体到某一个数据类型时，需要强制类型转换，
 * 可能引发 ClassCastException)
 *
 * 2、自定义泛型类、接口、方法
 * (在编译时不确定的数据类型可以使用泛型)
 *
 * 3、通配符: ?
 * 虽然 Man 是 Person 的子类，但是 List<Man> 就不是 List<Person> 的子类，就意味着不能使用多态，会大大降低程序的灵活性
 *
 *  List<?> : 可以接收任意类型泛型的集合
 *  List<? extends Person> : 可以接收 Person 本类类型泛型集合及Person子类类型泛型的集合
 *  List<? super Person>: 可以接收 Person 本类类型泛型集合及Person 父类类型泛型的集合
 */
public class GenericTest {
    @Test
    public void test6(){

        /*Woman woman = new Woman();
        Person p = woman;

        Man[] mans = new Man[5];
        Person[] persons = mans;

        List<Man> manList = new ArrayList<>();
        List<Person> perList = manList;*/

        List<Man> manList = new ArrayList<>();
//        List<?> list = manList;
        manList.add(new Man());

        show(manList);
    }

    public void show(List<? extends Person> list){
        for (Person person : list) { //多态
            person.eat();//虚拟方法调用
        }
    }

    //需求：展示一堆男人吃饭的功能
    /*public void show(List<Man> list){
        for (Man man : list) {
            man.eat();
        }
    }

    //需求：展示一堆女人吃饭的功能
    public void show(List<Woman> list){
        for (Woman woman : list) {
            woman.eat();
        }
    }*/

    //自定义泛型方法
    public <E> E sort(E e){
        return e;
    }

    public <T> T get(List<T> list, int num, String str){
        return list.get(0);
    }

    @Test
    public void test5(){
        /*MyGeneric<String> mg = new MyGeneric<>();
        mg.add("AA");

        String str = mg.get(0);

        MyGeneric<Person> mg2 = new MyGeneric<>();
        mg2.add(new Person());

        Person p = mg2.get(0);*/

        MyGeneric<Person> mg = new MyGeneric<>();
        mg.add(new Person("张三", 18));

        Person p = mg.get(0);
        System.out.println(p);

        MyGeneric<Student> mg2 = new MyGeneric<>();
        mg2.add(new Student("李四", 8));

        Student stu = mg2.get(0);
        System.out.println(stu);

        String str = sort("AA");
        Integer num = sort(11);
    }


    @Test
    public void test4(){
        Map<String, Integer> map = new HashMap<>();
        map.put("AA", 99);
        map.put("BB", 55);
        map.put("CC", 66);
        map.put("DD", 88);
        map.put("EE", 99);

        //遍历 Map 的方式一：
        Set<String> keySet = map.keySet();

        for(String str : keySet){
            System.out.println(str);

            Integer num = map.get(str);
            System.out.println(num);
        }

        System.out.println("------------------------------------");

        //遍历 Map 的方式二：
        Collection<Integer> coll = map.values();

        Iterator<Integer> it = coll.iterator();

        while(it.hasNext()){
            Integer num = it.next();
            System.out.println(num);
        }

        System.out.println("------------------------------------");

        //遍历 Map 的方式三：
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        for(Map.Entry<String, Integer> entry : entrySet){
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key.toLowerCase());
            System.out.println(value);
        }

        System.out.println("------------------------------------");

        Iterator<Map.Entry<String, Integer>> it2 = entrySet.iterator();

        while(it2.hasNext()){
            Map.Entry<String, Integer> entry = it2.next();
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + "=" + value);
        }
    }

    @Test
    public void test3(){
        Set<Person> set = new HashSet<>();
        set.add(new Person("张三", 18));
        set.add(new Person("李四", 20));
        set.add(new Person("王五", 35));

        for(Person p : set){
            System.out.println(p.getName());
            System.out.println(p.getAge());
        }
    }

    //集合中使用泛型,可以限制集合中存放元素的类型
    @Test
    public void test2(){
        List<String> list = new ArrayList<String>();
        list.add("AA");
        list.add("BB");

        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            String str = it.next();
            System.out.println(str.toLowerCase());
        }
    }

    //若集合中不使用泛型的弊端
    @Test
    public void test1(){
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("DD");
        list.add(11);

        Iterator it = list.iterator();

        while(it.hasNext()){
            Object obj = it.next();
            String str = (String) obj;
            System.out.println(str.toLowerCase());
        }
    }
}
