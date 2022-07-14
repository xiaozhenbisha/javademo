package com.atguigu.exer;

public class Rectangle implements Sortable{

    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    //计算矩形面积
    public double area(){
        return length * width;
    }

    @Override
    public int compare(Sortable s) {
        if(s instanceof Rectangle){
            Rectangle r = (Rectangle) s;

            if(this.area() > r.area()){
                return 1;
            }else if(this.area() < r.area()){
                return -1;
            }else{
                return 0;
            }
        }

        return 666;
    }
}
