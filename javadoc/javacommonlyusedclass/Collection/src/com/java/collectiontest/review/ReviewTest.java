package com.java.collectiontest.review;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ReviewTest {
    /*
  遍历 Map 的方式三：获取 Map 中所有的 Entry（Entry 是 Map 的内部类，一个 Entry 对应着一个 key 和一个value） 组成 Set
  方法：entrySet()
   */
    @Test
    public void test4(){
        Map map = new HashMap();
        map.put("AA", 99);
        map.put("BB", 19);
        map.put("CC", 88);
        map.put("DD", 66);
        map.put("EE", 99);

        Set entrySet = map.entrySet();

        for(Object obj : entrySet){
            Map.Entry entry = (Map.Entry) obj;

            Object key = entry.getKey();
            Object value = entry.getValue();

            System.out.println(key + "=" + value);
        }

        System.out.println("---------------------------------------------------");

        Iterator it = entrySet.iterator();

        while(it.hasNext()){
            Object obj = it.next();
            Map.Entry entry = (Map.Entry) obj;

            Object key = entry.getKey();
            Object value = entry.getValue();

            String str = (String) key;
            System.out.println(str.toLowerCase());

            Integer num = (Integer) value;
            System.out.println(num);
        }
    }


    /*
    遍历 Map 的方式二：获取 Map 中所有的 value 组成 Collection
    方法： values()
     */
    @Test
    public void test3(){
        Map map = new HashMap();
        map.put("AA", 99);
        map.put("BB", 19);
        map.put("CC", 88);
        map.put("DD", 66);
        map.put("EE", 99);

        Collection coll = map.values();

        Iterator it = coll.iterator();

        while(it.hasNext()){
            Object value = it.next();
            System.out.println(value);
        }
    }

    /*
    遍历 Map 的方式一：获取 Map 中所有的 key 组成的 Set
    方法：keySet()
     */
    @Test
    public void test2(){
        Map map = new HashMap();
        map.put("AA", 99);
        map.put("BB", 19);
        map.put("CC", 88);
        map.put("DD", 66);
        map.put("EE", 99);

        Set set = map.keySet();

        for(Object key : set){
            System.out.println(key);
            //根据 key 获取对应的 value
            Object value = map.get(key);
            System.out.println(value);
        }
    }

    @Test
    public void test1() throws IOException {
        //1. 创建 Properties 的对象
        Properties props = new Properties();

        //2. 通过 load() 方法加载属性文件
        props.load(new FileInputStream("jdbc.properties"));

        //3. 通过 getProperty() 方法根据 String类型key 获取 String类型的 value
        String username = props.getProperty("username");
        String password = props.getProperty("password");

        System.out.println(username);
        System.out.println(password);
    }
}
