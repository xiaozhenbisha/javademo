package com.java.oopcomprehensive.exer;

/**
 * 编写MyDate类表示日期，类中包含属性day、month和year，提供必要的方法，并覆盖equals
 * 方法以比较年、月、日是否相同。
 * 在TestDate类的main方法中，创建两个日期均为2014年10月1日的MyDate对象，比较它们是否相同。
 * 通过toString方法打印两个对象日期
 */
public class MyDateExer {
    public static void main(String[] args) {
        MyDate md1 = new MyDate(2014, 10, 1);
        MyDate md2 = new MyDate(2014, 10, 1);

        System.out.println(md1);
        System.out.println(md2);

        System.out.println(md1.equals(md2));
    }
}
class MyDate{

    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String toString(){
        return year + "年" + month + "月" + day + "日";
    }

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(obj instanceof MyDate){
            MyDate md = (MyDate) obj;

            if(this.year == md.year && this.month == md.month && this.day == md.day){
                return true;
            }
        }

        return false;
    }
}