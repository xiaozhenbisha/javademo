package com.atguigu.java;

import java.util.ArrayList;
import java.util.List;

public class MyGeneric<T> {//T : Type  E:Element K:Key  V:Value  R:Return

    private List<T> list = new ArrayList<>();

    public void add(T t){
        list.add(t);
    }

    public T get(int index){
        return list.get(index);
    }
}
