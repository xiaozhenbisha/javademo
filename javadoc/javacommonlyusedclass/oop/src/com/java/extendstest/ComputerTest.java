package com.java.extendstest;

/**
 * 编写Computer类，包含CPU、内存、硬盘等属性，getDetails方法用于返回Computer的详细信息
 * 编写PC子类，继承Computer类，添加特有属性和方法
 * 编写NotePad子类，继承Computer类，添加特有属性和方法
 * 编写Test类，在main方法中创建PC和NotePad对象，分别访问对象中特有的属性、方法，
 * 以及从Computer类继承的属性和方法并打印输出。
 *
 * 改写Computer类，将所有属性声明为private，getDetails方法用于返回Computer的详细信息
 * 在PC子类中直接访问继承的私有属性，结果如何？
 * 在Computer类中对私有属性添加公有的get/set方法，在PC子类中通过这些公有的get/set方法访问私有属性，结果如何？
 */
public class ComputerTest {
    public static void main(String[] args) {
        PC pc = new PC();
        /*pc.cpu = "2.8GHz";
        pc.ram = "16G";
        pc.hdd = "500G";*/

        pc.setCpu("2.8GHz");
        pc.setRam("16G");
        pc.setHdd("1T");

        pc.box = true;

        System.out.println(pc.getDetails());
        pc.hasBox();
    }
}


class Computer{

    private String cpu;
    private String ram;
    private String hdd;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getDetails(){
        return "CPU:" + cpu + " RAM:" + ram + " HDD:" + hdd;
    }

}

class PC extends Computer{

    boolean box;

    public void hasBox(){
        System.out.println("是否有主机箱：" + box);
    }

}

class NotePad extends Computer{

    boolean fold;

    public void isFold(){
        System.out.println("是否可以折叠" + fold);
    }

}
