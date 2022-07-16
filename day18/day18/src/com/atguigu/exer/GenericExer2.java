package com.atguigu.exer;

import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class GenericExer2 {

    @Test
    public void test1(){
        DAO<Student> dao = new DAO<>();

        dao.save("AA", new Student("张三", 99));

        Student stu = dao.get("AA");
        System.out.println(stu);

        List<Student> stus = dao.list();

        Iterator<Student> it = stus.iterator();

        while(it.hasNext()){
            Student stu2 = it.next();
            System.out.println(stu2);
        }
    }

    public static void main(String[] args) {

        TreeSet<Student> ts = new TreeSet<>();
        ts.add(new Student("张三", 99));
        ts.add(new Student("李四", 77));
        ts.add(new Student("王五", 88));
        ts.add(new Student("赵六", 55));
        ts.add(new Student("田七", 66));

        for(Student stu : ts){
            System.out.println(stu);
        }
    }

}
