package com.java.extendstest2;

public class ExtendsTest2 {
    public static void main(String[] args) {
        Son son = new Son();

        son.getNum();
    }
}
class Father{

    int num = 10;

    public void getNum(){
        System.out.println(num);
    }
}

class Son extends Father{

    int num = 20;

    public void getNum(){
        super.getNum();
        System.out.println(num);
    }

}