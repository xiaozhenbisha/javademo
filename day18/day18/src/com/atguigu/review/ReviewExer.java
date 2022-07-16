package com.atguigu.review;

import java.util.Iterator;
import java.util.List;

/*
3、有一个DAO接口，运用ArrayList用于实现数据的操作管理
（1）有一个添加数据的方法
（2）有一个修改的方法，根据ID，修改数据
（3）有一个根据ID返回具体对象的方法
（4）有一个删除的方法，根据ID，删除数据
（5）有一个返回所有数据对象的方法
（6）有一个返回数据总数量的方法

现在有一个商品类，该类有id,name,price,description等属性，
编写商品管理类实现DAO接口。并测试
 */
public class ReviewExer {

    public static void main(String[] args) {
        BaseDAO bd = new BaseDAO();
        Goods g1 = new Goods(101, "电脑", 9999.99, "高配电脑");
        Goods g2 = new Goods(102, "手机", 5555.55, "高配手机");
        bd.add(g1);
        bd.add(g2);

        bd.add("AA");

        List list = bd.getList();

        Goods g3 = new Goods(103, "键盘", 2222.22, "机械键盘");
        bd.update(0, g3);

        Iterator it = list.iterator();

        while(it.hasNext()){
            Object obj = it.next();
            Goods g = (Goods) obj;
            System.out.println(g.getId() + "," + g.getName());
        }
    }

}
