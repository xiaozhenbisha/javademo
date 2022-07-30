package com.java.homework;

import java.io.Serializable;

public class AtguiguDemo implements Serializable,Comparable<AtguiguDemo> {
    private static String school="尚硅谷";
    private String className;

    public AtguiguDemo() {
    }

    public AtguiguDemo(String className) {
        this.className = className;
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        AtguiguDemo.school = school;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public int compareTo(AtguiguDemo o) {
        //借助String类中的compareTo
        return this.getClassName().compareTo(o.getClassName());
    }
}
