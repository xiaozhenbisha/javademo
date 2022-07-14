package com.atguigu.team.domain;

/**
* 设计师类
* @author Hefei Li
* 2020/6/12 15:08
*/
public class Designer extends Programmer{

    private double bonus;

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
