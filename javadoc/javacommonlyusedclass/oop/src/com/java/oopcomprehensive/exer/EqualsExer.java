package com.java.oopcomprehensive.exer;

public class EqualsExer {
    public static void main(String[] args) {
        GeometricObject c1 = new Circle("黑色", 5.5, 2.2);
        GeometricObject c2 = new Circle("白色", 6.6, 2.2);

        boolean b = c1.equals(c2);
        System.out.println(b);
    }
}
class GeometricObject{

    protected String color;
    protected double weight;

    public GeometricObject() {
        this.color = "white";
        this.weight = 1.0;
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

    /*public boolean equals(Object obj) {
        return (this == obj);
    }*/
}

class Circle extends GeometricObject{

    private double radius;

    public Circle() {
        this.color = "white";
        this.weight = 1.0;
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
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

    //计算圆面积的方法
    public double findArea(){
        return 3.14 * radius * radius;
    }

    public String toString(){
        return this.color + "," + this.weight + "," + this.radius;
    }

    public boolean equals(Circle c){
        return this.radius == c.radius;
    }

}