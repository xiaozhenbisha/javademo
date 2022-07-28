package com.java.settest.exer;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExer {
    public static void main(String[] args) {
        Employee emp1 = new Employee("张三", 18, new MyDate(1999, 9, 9));
        Employee emp2 = new Employee("李四", 22, new MyDate(1988, 8, 8));
        Employee emp3 = new Employee("王五", 35, new MyDate(2000, 10, 10));
        Employee emp4 = new Employee("赵六", 8, new MyDate(1998, 5, 8));
        Employee emp5 = new Employee("田七", 20, new MyDate(1997, 9, 9));
        Employee emp6 = new Employee("田七222", 20, new MyDate(1997, 10, 19));

        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {

                if(o1 instanceof Employee && o2 instanceof Employee){
                    Employee e1 = (Employee) o1;
                    Employee e2 = (Employee) o2;

                    if(e1.getBirthday().getYear().equals(e2.getBirthday().getYear())){
                        if(e1.getBirthday().getMonth().equals(e2.getBirthday().getMonth())){
                            return e1.getBirthday().getDay().compareTo(e2.getBirthday().getDay());
                        }else{
                            return e1.getBirthday().getMonth().compareTo(e2.getBirthday().getMonth());
                        }
                    }else{
                        return e1.getBirthday().getYear().compareTo(e2.getBirthday().getYear());
                    }
                }
                return 0;
            }
        };

        TreeSet ts = new TreeSet(com);
        ts.add(emp1);
        ts.add(emp2);
        ts.add(emp3);
        ts.add(emp4);
        ts.add(emp5);
        ts.add(emp6);

        //集合的遍历
        Iterator it = ts.iterator();

        while(it.hasNext()){
            Object obj = it.next();

            System.out.println(obj);
        }
    }
}
