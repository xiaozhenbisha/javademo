package com.java.interfaceandinnerclass.exer;

/**
 * 将Frock类声明为抽象类，在类中声明抽象方法calcArea方法，用来计算衣服的布料面积。
 * 通过编写代码来验证抽象类中是否可包含属性、具体方法和构造器。
 * 编写Shirt类继承Frock类，实现 calcArea方法，用来计算衬衣所需的布料面积（尺寸*1.3）。
 * 在TestShirt类的main方法中：
 * 试着创建Frock对象，确认是否允许？
 * 使用本态引用创建Shirt对象，并调用calcArea方法，打印计算结果。
 * 使用Frock 多态引用创建Shirt对象，并调用calcArea方法，打印计算结果。
 *
 * 声明Clothing接口 ，在接口中声明 calcArea方法、getColor方法和getDetails方法。
 * 改写Shirt类实现Clothing接口，然后实现接口中的所有方法。
 * 在TestShirt类的main方法中：
 * 试着创建 Clothing对象，确认是否允许？
 * 使用本态引用创建Shirt对象，并调用calcArea方法，打印计算结果。
 * 使用Clothing多态引用创建Shirt对象，并调用calcArea方法，打印计算结果。
 */
public class ForckTest {
    public static void main(String[] args) {
        //        Frock f = new Frock();

        Shirt s = new Shirt(1.5);//本态
        System.out.println(s.calcArea());

        Frock f = new Shirt(1.6);//多态
        System.out.println(f.calcArea());//虚拟方法调用

//        Colthing c = new Colthing();

        Colthing c = new Shirt(1.2, "红色");//多态
        System.out.println(c.calcArea());//虚拟方法调用
        System.out.println(c.getDetails());
    }
}
abstract class Frock{
    private double size;

    public Frock() {
    }

    public Frock(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Frock{" +
                "size=" + size +
                '}';
    }

    public abstract double calcArea();
}

interface Colthing{

    public double calcArea();

    public String getColor();

    public String getDetails();

}

class Shirt extends Frock implements Colthing{

    private String color;

    public Shirt() {
    }

    public Shirt(double size) {
        super(size);
    }

    public Shirt(double size, String color) {
        super(size);
        this.color = color;
    }

    public double calcArea(){
        return getSize() * 1.3;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getDetails() {
        return getColor() + "," + calcArea();
    }

}