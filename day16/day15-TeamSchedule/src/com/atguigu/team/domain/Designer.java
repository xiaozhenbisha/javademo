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

    @Override
    public String getDetailsForTeam(){
        return super.getMemberForTeam() + "\t设计师\t" + getBonus();
    }

    @Override
    public String toString(){
        return super.getDetails() + "\t设计师\t" + getStatus() + "\t" + bonus + "\t\t\t" + getEquipment();
    }
}
