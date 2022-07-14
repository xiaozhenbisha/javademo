package com.atguigu.exer;

/*
编写Computer类，包含CPU、内存、硬盘等属性，getDetails方法用于返回Computer的详细信息
编写PC子类，继承Computer类，添加特有属性和方法
编写NotePad子类，继承Computer类，添加特有属性和方法
编写Test类，在main方法中创建PC和NotePad对象，分别访问对象中特有的属性、方法，
以及从Computer类继承的属性和方法并打印输出。

改写Computer类，将所有属性声明为private，getDetails方法用于返回Computer的详细信息
在PC子类中直接访问继承的私有属性，结果如何？
在Computer类中对私有属性添加公有的get/set方法，在PC子类中通过这些公有的get/set方法访问私有属性，结果如何？

在PC类中，覆盖getDetails方法，方法返回PC机的详细信息。
在Test类中调用getDetails方法，确认输出结果。

在PC类中，改写的覆盖getDetails方法，使用super调用。
在Test类中调用getDetails方法，确认输出结果。

在Computer类中添加新的重载构造器，并调用原构造器
在PC类中添加新的重载构造器，并调用原构造器
使用PC类中新的重载构造器创建PC实例，调用getDetails方法获取输出结果，确认属性值

使用多态引用分别创建Computer、PC和NotePad实例，并将实例放在一个Computer类型的数组中。
遍历数组元素，分别调用getDetails方法获取输出结果。
在Computer类中增加price属性表示价格。
将数组元素按价格进行排序，并遍历打印输出。

在Test类中提供一个静态方法listPrice,以Computer引用变量为参数，打印输出电脑价格。
在main方法中，分别以Computer、PC、NotePad对象为参数，调用listPrice方法。

在方法listPrice中，判断Computer参数的真实对象，并调用不同对象上的特有方法
 */
public class ComputerTest {

    public static void main(String[] args) {
        //PC pc = new PC("3.0GHz", "16G", "500G", true);
        /*pc.cpu = "2.8GHz";
        pc.ram = "16G";
        pc.hdd = "500G";*/

        /*pc.setCpu("2.8GHz");
        pc.setRam("16G");
        pc.setHdd("1T");

        pc.box = true;*/

       // System.out.println(pc.getDetails());
        //pc.hasBox();

        //创建多态数组
        Computer com1 = new Computer("2.8GHz", "8G", "500G", 8888);//本态
        Computer com2 = new PC("3.0GHz", "16G", "1T", 9999, true);//多态
        Computer com3 = new NotePad("3.8GHz", "8G", "2T", 6666, true);//多态
        PC pc = new PC("5.0GHz", "4G", "1T", 5555, true);//本态

        Computer[] coms = new Computer[5];
        coms[0] = com1;
        coms[1] = com2;
        coms[2] = com3;
        coms[3] = pc;
        coms[4] = new NotePad("3.8GHz", "4G", "2T", 7777, true);

        //对数组中的元素按价格进行排序
        for (int i = 0; i < coms.length - 1; i++) {
            for(int j = 0; j < coms.length - 1 - i; j++){
                //比较价格
                if(coms[j].getPrice() < coms[j+1].getPrice()){
                    Computer c = coms[j];
                    coms[j] = coms[j+1];
                    coms[j+1] = c;
                }
            }
        }

        for (Computer com : coms) {
            //System.out.println(com.getPrice()); //调用继承的方法
            //System.out.println(com.getDetails()); //虚拟方法调用
            listPrice(com);
        }
    }

    public static void listPrice(Computer computer){
        System.out.println(computer.getDetails());

        //若是 PC 则打印 PC 的特有方法
        if(computer instanceof PC){
            PC pc = (PC)computer;
            pc.hasBox();
        }

        //若是 Notepad 则打印 Notepad 的特有方法
        if(computer instanceof NotePad){
            NotePad np = (NotePad) computer;
            np.isFold();
        }
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

class PC extends Computer{

    boolean box;

    public PC(){}

    public PC(String cpu, String ram, String hdd){
        super(cpu, ram, hdd);
    }

    public PC(String cpu, String ram, String hdd, boolean box){
        //super(cpu, ram, hdd);
        this(cpu, ram, hdd);
        this.box = box;
    }

    public PC(String cpu, String ram, String hdd, double price, boolean box) {
        super(cpu, ram, hdd, price);
        this.box = box;
    }

    public void hasBox(){
        System.out.println("是否有主机箱：" + box);
    }

    public String getDetails(){
        return super.getDetails() + " 是否有主机箱：" + box;
    }
}

class NotePad extends Computer{

    boolean fold;

    public NotePad() {
    }

    public NotePad(String cpu, String ram, String hdd, double price, boolean fold) {
        super(cpu, ram, hdd, price);
        this.fold = fold;
    }

    public void isFold(){
        System.out.println("是否可以折叠" + fold);
    }

    public String getDetails(){
        return super.getDetails() + " 是否可以折叠：" + fold;
    }

}