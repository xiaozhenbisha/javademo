package com.java.oopcomprehensive.exer;

public class FrockExer {
    public static void main(String[] args) {
         /*System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());*/

        Frock f1 = new Frock();
        Frock f2 = new Frock();
        Frock f3 = new Frock();

        System.out.println(f1.getSerialNumber());
        System.out.println(f2.getSerialNumber());
        System.out.println(f3.getSerialNumber());
    }
}
class Frock{

    static{
        currentNum = 15000;
    }

    private static int currentNum = 10000;

    private int serialNumber;


    public Frock(){
        this.serialNumber = getNextNum();
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public static int getNextNum(){
        return currentNum += 100;
    }



}