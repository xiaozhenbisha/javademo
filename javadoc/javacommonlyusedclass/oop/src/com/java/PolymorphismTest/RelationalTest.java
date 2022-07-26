package com.java.PolymorphismTest;

public class RelationalTest {
    public static void main(String[] args) {
        Teacher t = new Teacher("张三", 18, new Computer("2.8GHz", "8G", "1T", 9999));
        System.out.println(t.say());
    }
}

class Teacher{

    private String name;
    private int age;

    private Computer computer;

    public Teacher() {
    }

    public Teacher(String name, int age, Computer computer) {
        this.name = name;
        this.age = age;
        this.computer = computer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public String say(){
        return "姓名：" + name + " 年龄：" + age + " 我有一台电脑：" + computer.getDetails();
    }
}

class Computer{

    private String cpu;
    private String ram;
    private String hdd;
    private double price;

    public Computer(){}

    public Computer(String cpu, String ram, String hdd){
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    public Computer(String cpu, String ram, String hdd, double price) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.price = price;
    }

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDetails(){
        return "CPU:" + cpu + " RAM:" + ram + " HDD:" + hdd + " PRICE:" + price;
    }

}

