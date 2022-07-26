package com.java.oopcomprehensive.review;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle("黑色", 5.5, 2.2);
        Circle c2 = new Circle("绿色色", 5.5, 3.2);

        MyRectangle mr1 = new MyRectangle("白色", 6.6, 2.2, 3.3);
        MyRectangle mr2 = new MyRectangle("白色", 6.6, 2.2, 3.3);

        boolean b = equalsArea(mr1, c2);
        System.out.println(b);

        displayGeometricObject(mr1);
    }

    //判断两个几何图形是否相等
    public static boolean equalsArea(GeometricObject o1, GeometricObject o2){//多态参数
        return o1.findArea() == o2.findArea();//虚拟方法调用（动态绑定）
    }

    //显示几何图形的面积
    public static void displayGeometricObject(GeometricObject o1){//多态参数
        if(o1 instanceof Circle){
            Circle c = (Circle) o1;
            System.out.println("圆的半径为：" + c.getRadius());
            System.out.println("圆的面积为：" + o1.findArea());//虚拟方法调用
        }

        if(o1 instanceof MyRectangle){
            MyRectangle mr = (MyRectangle) o1;
            System.out.println("矩形的宽为：" + mr.getWidth() + " 高为：" + mr.getHeight());
            System.out.println("矩形的面积为：" + o1.findArea());
        }
    }

}
