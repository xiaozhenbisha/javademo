package com.atguigu.exer;

public class TestCylinder {

    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.setRadius(2.2);
        c.setLength(3.3);

        System.out.println("圆柱体积为：" + c.findVolumn());
    }

}

class Circle{

    private double radius;

    public Circle() {
        this.radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //计算圆面积的方法
    public double findArea(){
        return 3.14 * radius * radius;
    }
}

class Cylinder extends Circle{

    private double length;

    public Cylinder() {
        this.length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //计算圆柱体积的方法
    public double findVolumn(){
        return findArea() * length;
    }
}