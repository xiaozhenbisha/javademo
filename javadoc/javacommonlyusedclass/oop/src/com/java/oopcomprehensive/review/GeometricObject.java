package com.java.oopcomprehensive.review;

/**
 * 代表几何图形
 */
public class GeometricObject {
    private String color;
    private double weight;

    public GeometricObject() {
    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //计算几何图形的面积
    public double findArea(){
        return 666;//搞点注释
    }
}
