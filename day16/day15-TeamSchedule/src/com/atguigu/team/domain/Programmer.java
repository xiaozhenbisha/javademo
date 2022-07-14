package com.atguigu.team.domain;

/**
* 程序员类
* @author Hefei Li
* 2020/6/12 15:22
*/
public class Programmer extends Employee{

    private int memberId; //成员 ID
    private Status status = Status.FREE; //默认状态为:空闲
    private Equipment equipment;

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public String getMemberForTeam(){
        return getMemberId() + "/" + getDetails();
    }

    public String getDetailsForTeam(){
        return getMemberForTeam() + "\t程序员\t";
    }

    @Override
    public String toString(){
        return super.toString() + "\t程序员\t" + getStatus() + "\t\t\t\t\t" + getEquipment();
    }
}
