package com.atguigu.exer;

/*
1.编写一个Person类，使用Override注解它的toString方法

2.自定义一个名为“MyTiger”的注解类型，它只可以使用在方法上，带一个String类型的value属性，
然后在第1题中的Person类上正确使用。
 */
public class AnnotationTest {
}

@MyTiger("hello")
class Person{

    @MyTiger("abc")
    public void sleep(){

    }

    @Override
    public String toString(){
        return "";
    }

}