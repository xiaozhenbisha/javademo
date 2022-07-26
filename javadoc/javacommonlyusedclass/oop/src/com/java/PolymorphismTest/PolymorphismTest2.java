package com.java.PolymorphismTest;

/**
 * 属性不具备多态性（没有虚拟属性这个说法）
 */
public class PolymorphismTest2 {
    public static void main(String[] args) {
        Father1 f = new Son1(); //多态
        f.show(); //虚拟方法调用（动态绑定）
        System.out.println(f.num);
    }
}

class Father1{

    int num = 10;

    public void show(){
        System.out.println("父类的 show 方法");
    }

}

class Son1 extends Father1{

    int num = 20;

    public void show(){
        System.out.println("子类的 show 方法");
    }

}