package com.atguigu.review;

import java.util.List;

public interface DAO {

    public void add(Object obj);

    public void update(int index, Object obj);

    public void delete(int index);

    public Object get(int index);

    public List getList();

    public int getCount();

}
