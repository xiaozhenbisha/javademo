package com.java.PolymorphismTest.exer;

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