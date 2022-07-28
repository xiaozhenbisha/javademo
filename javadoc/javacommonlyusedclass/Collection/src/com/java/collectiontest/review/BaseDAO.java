package com.java.collectiontest.review;


import java.util.ArrayList;
import java.util.List;

public class BaseDAO implements DAO {
    private List list = new ArrayList();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void update(int index, Object obj) {
        list.set(index, obj);
    }

    @Override
    public void delete(int index) {
        list.remove(index);
    }

    @Override
    public Object get(int index) {
        return list.get(index);
    }

    @Override
    public List getList() {
        return list;
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
