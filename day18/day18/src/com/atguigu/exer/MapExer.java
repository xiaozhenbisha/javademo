package com.atguigu.exer;

import org.junit.Test;

import java.util.*;

/*
1.请从键盘随机输入10个整数保存到List中，并按倒序、从大到小的顺序显示出来

2.请把学生名与考试分数录入到Map中，并按分数显示前三名成绩学员的名字。
 */
public class MapExer {
    private static final Object PRESENT = new Object();

    @Test
    public void test2(){
        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Student && o2 instanceof Student){
                    Student s1 = (Student) o1;
                    Student s2 = (Student) o2;

                    if(s1.getScore().equals(s2.getScore())){
                        return s1.getName().compareTo(s2.getName());
                    }else{
                        return -s1.getScore().compareTo(s2.getScore());
                    }
                }

                return 0;
            }
        };

        TreeMap tm = new TreeMap(com);

        tm.put(new Student("张三", 99), PRESENT);
        tm.put(new Student("李四", 88), PRESENT);
        tm.put(new Student("王五", 66), PRESENT);
        tm.put(new Student("赵六", 77), PRESENT);
        tm.put(new Student("田七", 55), PRESENT);

        Set keySet = tm.keySet();

        Object[] objs = keySet.toArray();

        for(int i = 0; i < 3; i++){
            System.out.println(objs[i]);
        }
    }
    
    @Test
    public void test1(){
        List list = new ArrayList();

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            int num = scan.nextInt();

            list.add(num);
        }

        Collections.sort(list);
        Collections.reverse(list);

        Iterator it = list.iterator();

        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }


    
}
