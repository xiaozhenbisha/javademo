package com.atguigu.java;

import org.junit.Test;

import java.util.*;

public class CollectionsTest {

    /*
    查找、替换
    Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
    Object max(Collection，Comparator)：根据 Comparator 指定的顺序，返回给定集合中的最大元素
    Object min(Collection)
    Object min(Collection，Comparator)
    int frequency(Collection，Object)：返回指定集合中指定元素的出现次数
    void copy(List dest,List src)：将src中的内容复制到dest中
    boolean replaceAll(List list，Object oldVal，Object newVal)：使用新值替换 List 对象的所有旧值
     */
    @Test
    public void test5(){
        List list = new ArrayList();
        list.add("AA");
        list.add("AA");
        list.add("AA");
        list.add("BB");
        list.add("CC");

        Collections.replaceAll(list, "AA", "adsfadf");

        System.out.println(list);
    }


    @Test
    public void test4(){
        List src = new ArrayList();
        src.add("AA");
        src.add("BB");
        src.add("CC");

//        List dest = new ArrayList();

        Object[] objs = new Object[3]; //{null, null, null}
        List dest = Arrays.asList(objs);

        System.out.println(dest.size());

        Collections.copy(dest, src);

        System.out.println(dest);
    }

    @Test
    public void test3(){
        Collection coll = new HashSet();
        coll.add(11);
        coll.add(22);
        coll.add(33);
        coll.add(44);
        coll.add(55);
        coll.add(11);

        Object obj = Collections.max(coll);
        System.out.println(obj);

        System.out.println(Collections.min(coll));

        System.out.println(Collections.frequency(coll, 11));
    }


    /*
    排序操作：（均为static方法）
    reverse(List)：反转 List 中元素的顺序
    shuffle(List)：对 List 集合元素进行随机排序
    sort(List)：根据元素的自然顺序对指定 List 集合元素按升序排序
    sort(List，Comparator)：根据指定的 Comparator 产生的顺序对 List 集合元素进行排序
    swap(List，int， int)：将指定 list 集合中的 i 处元素和 j 处元素进行交换
     */
    @Test
    public void test2(){
        List list = new ArrayList();
        list.add(new Person("张三", 18));
        list.add(new Person("李四", 20));
        list.add(new Person("王五", 35));
        list.add(new Person("赵六", 8));
        list.add(new Person("田七", 22));

        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Person && o2 instanceof Person){
                    Person p1 = (Person) o1;
                    Person p2 = (Person) o2;

                    if(p1.getAge().equals(p2.getAge())){
                        return p1.getName().compareTo(p2.getName());
                    }else{
                        return p1.getAge().compareTo(p2.getAge());
                    }
                }

                return 0;
            }
        });

        for (Object o : list) {
            System.out.println(o);
        }
    }


    @Test
    public void test1(){
        List list = new ArrayList();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);

        Collections.reverse(list);
        Collections.shuffle(list);
        Collections.sort(list);

        Collections.swap(list, 1, 3);

        System.out.println(list);
    }
}
