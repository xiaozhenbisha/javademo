package com.java.PolymorphismTest;

public class PolymorphismTest4 {
    public static void main(String[] args) {
        PolymorphismTest4 pt = new PolymorphismTest4();


        //pt.show(new Woman());

        /*Student1 stu = new Student1();
        pt.show(stu);*/

        Man man = new Man();
        pt.show(man);
    }

    //需求：展示一个男人吃饭和睡觉的功能
    /*public void show(Man man){
        man.eat();
        man.sleep();
    }

    //需求：展示一个女人吃饭和睡觉的功能
    public void show(Woman woman){
        woman.eat();
        woman.sleep();
    }*/

    public void show(Person1 p){//多态参数：当调用方法时，可以传递 Person 本类类型的对象及Person 子类类型对象
        p.eat();//虚拟方法调用（动态绑定）
        p.sleep();

        //若是男人，则调用男人特有的方法
        if(p instanceof Man){
            Man man = (Man)p;
            man.smoking();
        }
    }
}


class Student1 extends Person1{

    public void eat(){
        System.out.println("学生吃大餐");
    }

    public void sleep(){
        System.out.println("学生上课偷偷睡");
    }

}