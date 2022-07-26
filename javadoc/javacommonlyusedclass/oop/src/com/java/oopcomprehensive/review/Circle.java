package com.java.oopcomprehensive.review;

public class Circle extends GeometricObject{
    private double radius;

    public Circle() {
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //重写父类的 findArea 方法
    public double findArea(){
        return 3.14 * radius * radius;
    }
}
