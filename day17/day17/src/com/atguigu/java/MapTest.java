package com.atguigu.java;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

/*
一、Map 系列映射集合：用于操作成对对象的集合。具有 key(键)-value(值)对映射关系的集合。一个 key 对应着一个 value，key 不允许重复。
        |--HashMap:是 Map 接口的典型实现类。是线程不安全的，因此效率高。
            |--LinkedHashMap:
        |--Hashtable : 是一个古老的实现。是线程安全的，因此效率低
            |--Properties ：用于操作属性文件。（key 和 value 都是 String 类型）
        |--TreeMap :根据 key 拥有指定的排序方式
            自然排序 ：Comparable
            定制排序 ：Comparator
 */
public class MapTest {


    //【重要】
    @Test
    public void test9() throws IOException {
        //1. 创建 Properties 的实例
        Properties props = new Properties();

        //2. 通过 load() 方法加载属性文件
        props.load(new FileInputStream("./hello.properties"));

        //3. 通过 getProperty() 方法根据String类型的 key 获取 String 类型的 value
        String username = props.getProperty("username");
        String password = props.getProperty("password");

        System.out.println(username);
        System.out.println(password);

    }

    @Test
    public void test8(){
        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Customer && o2 instanceof Customer){
                    Customer c1 = (Customer) o1;
                    Customer c2 = (Customer) o2;

                    if(c1.getAge().equals(c2.getAge())){
                        return c1.getName().compareTo(c2.getName());
                    }else{
                        return -c1.getAge().compareTo(c2.getAge());
                    }
                }

                return 0;
            }
        };

        TreeMap tm = new TreeMap(com);
        tm.put(new Customer("张三", 18), 99);
        tm.put(new Customer("王五", 38), 19);
        tm.put(new Customer("赵六", 8), 59);
        tm.put(new Customer("田七", 28), 77);
        tm.put(new Customer("李四", 20), 99);

        System.out.println(tm);
    }

    /*
    Map 的遍历方式三：获取 Map 中所有的 Entry（Entry 是 Map 的内部类，一个 Entry 对应着一个 key 和一个 value）组成的 Set
    entrySet()
     */
    @Test
    public void test7(){
        Map map = new HashMap();
        map.put("AA", 55);
        map.put("CC", 66);
        map.put("EE", 99);
        map.put("DD", 88);
        map.put("BB", 99);

        Set entrySet = map.entrySet();

        for(Object obj : entrySet){
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        System.out.println("---------------------------------------");

        Iterator it = entrySet.iterator();

        while(it.hasNext()){
            Entry entry = (Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }



    /*
    Map 的遍历方式二：获取 Map 中所有的 value 组成的 Collection
    values()
     */
    @Test
    public void test6(){
        Map map = new HashMap();
        map.put("AA", 55);
        map.put("CC", 66);
        map.put("EE", 99);
        map.put("DD", 88);
        map.put("BB", 99);

        Collection coll = map.values();

        Iterator it = coll.iterator();

        while(it.hasNext()){
            Object value = it.next();
            System.out.println(value);
        }
    }


    /*
    Map 的遍历方式一：获取 Map 中所有的 key 组成的 Set
    keySet()
     */
    @Test
    public void test5(){
        Map map = new HashMap();
        map.put("AA", 55);
        map.put("CC", 66);
        map.put("EE", 99);
        map.put("DD", 88);
        map.put("BB", 77);

        Set keySet = map.keySet();

        for(Object obj : keySet){
            //根据 key 获取对应的 value
            Object value = map.get(obj);
            System.out.println(obj);
            System.out.println(value);
        }
    }

    /*
    元素查询的操作：
    Object get(Object key) : 根据 key 获取对应的 value
    boolean containsKey(Object key)
    boolean containsValue(Object value)
    int size()
    boolean isEmpty()
    boolean equals(Object obj)
     */
    @Test
    public void test4(){
        Map map = new HashMap();
        map.put("AA", 55);
        map.put("CC", 66);
        map.put("EE", 99);
        map.put("DD", 88);
        map.put("BB", 77);

        Object obj = map.get("BB");
        System.out.println(obj);

        System.out.println(map.containsKey("BB"));
        System.out.println(map.containsValue(88));

        int size = map.size();
        System.out.println(size);

//        map.clear();

        boolean b = map.isEmpty();
        System.out.println(b);

        Map map2 = new HashMap();
        map2.put("AA", 55);
        map2.put("CC", 66);
        map2.put("EE", 99);
        map2.put("DD", 888);
        map2.put("BB", 77);

        System.out.println(map.equals(map2));
    }

    /*
    添加、删除操作：
    Object put(Object key,Object value)
    Object remove(Object key)
    void putAll(Map t)
    void clear()
     */
    @Test
    public void test3(){
        Map map = new HashMap();
        map.put("AA", 55);
        map.put("CC", 66);
        map.put("EE", 99);
        map.put("DD", 88);
        map.put("BB", 77);

        map.remove("BB");

        Map map2 = new HashMap();
        map2.put("GG", 200);
        map2.put("JJ", 300);

        map.putAll(map2);

        System.out.println(map);

        map.clear();

        System.out.println(map);
    }

    @Test
    public void test2(){
        Map map = new HashMap();
        map.put(new Customer("张三", 18), 99);
        map.put(new Customer("李四", 33), 19);
        map.put(new Customer("王五", 35), 69);
        map.put(new Customer("赵六", 8), 29);
        map.put(new Customer("田七", 29), 99);
        map.put(new Customer("田七", 29), 100);

        System.out.println(map);
    }

    
    @Test
    public void test1(){
        Map map = new HashMap();
        map.put("AA", 55);
        map.put("CC", 66);
        map.put("EE", 99);
        map.put("DD", 88);
        map.put("BB", 77);

        //若出现重复的 key，则后加入的 value 覆盖先加入的 value
        map.put("BB", 200);

        System.out.println(map);
    }
    
    
}
