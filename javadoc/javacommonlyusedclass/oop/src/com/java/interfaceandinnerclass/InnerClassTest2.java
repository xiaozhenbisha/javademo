package com.java.interfaceandinnerclass;

import java.util.Comparator;

public class InnerClassTest2 {
    //方法中声明另一个类，局部内部类
    //如下方式使用较少
    public void show(){

        class Inner{

        }

    }

    public void say(){
        class Inner{

        }
    }

    //
    public Comparator getComparator(){
        //
        return new MyComparator();
    }

    public Comparator getComparator1(){

        //若该类仅对于当前方法有用，可以声明为局部内部类
        class MyComparator implements Comparator{

            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        }

        return new MyComparator();
    }

    public Comparator getComparator2(){
        //匿名内部类
        Comparator com = new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };

        return com;
    }

    public Comparator getComparator3(){
        //
        return new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
    }
}
