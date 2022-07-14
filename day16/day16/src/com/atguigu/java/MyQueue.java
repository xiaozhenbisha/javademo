package com.atguigu.java;

import java.util.LinkedList;

/*
堆栈：先进后出
队列：先进先出
 */
public class MyQueue {

    private LinkedList ll = new LinkedList();

    //添加
    public void add(Object obj){
        ll.addFirst(obj);
    }

    //获取
    public Object get(){
        return ll.removeLast();
    }

    //判断
    public boolean isNull(){
        return ll.isEmpty();
    }
}
