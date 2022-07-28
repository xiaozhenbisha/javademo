package com.java.collectiontest.exer;

import java.util.*;

public class DAO<T> {

    private Map<String, T> map = new HashMap<>();

    public void save(String id, T entity){
        map.put(id, entity);
    }

    public T get(String id){
        return map.get(id);
    }

    public void update(String id, T entity){
        map.put(id, entity);
    }

    public List<T> list(){
        Collection<T> coll = map.values();

        List<T> list = new ArrayList<>();

        list.addAll(coll);

        return list;
    }

    public void delete(String id){
        map.remove(id);
    }
}
