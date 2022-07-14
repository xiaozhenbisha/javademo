package com.atguigu.review;

public class InnerClassTest {

    public void show(){

        int num = 10;
        int a = 20;

        class Inner{

            public void test(){
                System.out.println(num);//若局部内部类中使用了同级别的局部变量，该局部变量必须使用 final 修饰
            }

        }

        Inner in = new Inner();

        System.out.println(a++);

    }

    //原来的用法
    public Flyer getFlyer1(){
        return new Bird();//若 Bird 类仅对于当前方法有用时，可以选择声明为局部内部类
    }

    //局部内部类
    public Flyer getFlyer2(){
        class Bird implements Flyer{
            @Override
            public void fly() {
                System.out.println("鸟儿煽动翅膀飞翔");
            }
        }

        //return new Bird();
        Flyer f = new Bird();
        return f;
    }

    //匿名内部类
    public Flyer getFlyer3(){
        Flyer f = new Flyer(){
            @Override
            public void fly() {

            }
        };

        return f;
    }

    //匿名内部类的匿名对象
    public Flyer getFlyer4(){
        return new Flyer(){
            @Override
            public void fly() {

            }
        };
    }

}

interface Flyer{

    void fly();

}

class Bird implements Flyer{
    @Override
    public void fly() {
        System.out.println("鸟儿煽动翅膀飞翔");
    }
}