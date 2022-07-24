package theme9objectdeep;

/**
 * @author wzn
 * @create 2022-07-24 14:31
 */

abstract class Shape2 {
    //定义抽象类Shape
    double radius,length,width,height;
    abstract double vol(); // 抽象方法 vol
    Shape2(double r,double h){ // 定义构造方法
        radius = r;
        height = h;
    }
    Shape2(double l,double w,double h){
        length = l;
        width = w;
        height = h;
    }
}

class Circle extends Shape2{
    Circle(double r,double h){
        super(r,h);
    }
    double vol() { //在抽象类的子类中实现抽象方法
        return(3.1416 * radius * radius * height);
    }
}
class Rectangle2 extends Shape2 {
    Rectangle2(double l, double w, double h) {
        super(l, w, h);
    }
    double vol() {
        return (length * width * height);
    }

}

class AbstractClassDemo {
    public static void main(String args[]) {
        Circle c = new Circle(2, 3);
        Rectangle2 r = new Rectangle2(3, 2, 4);
        System.out.println("圆柱体体积 = " + c.vol());
        System.out.println("长方体体积 = " + r.vol());
    }
}