package com.atguigu.team.domain;

/**
* 架构师类
* @author Hefei Li
* 2020/6/12 15:09
*/
public class Architect extends Designer{

    private int stock;

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
