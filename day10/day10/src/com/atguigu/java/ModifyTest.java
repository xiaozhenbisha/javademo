package com.atguigu.java;

import com.atguigu.aaa.Employee;

/*
访问控制修饰符：

private : 私有的，可用于修饰属性、方法。 只能在本类中访问

default : 默认的(缺省的) ，可用于修饰属性、方法、类。 只能在本类中、本包中
          （注意: default 并不是访问控制修饰符的关键字，在什么都不加的情况下，就是 default）

protected : 受保护的，可用于修饰属性、方法。 可以在本类中、本包中、子类中

public : 公共的，可用于修饰属性、方法、类。 任何地方都可以访问

 */
public class ModifyTest {

    public static void main(String[] args) {
        Customer cust = new Customer();
        cust.name = "张三";

        Employee emp = new Employee();
        //emp.name = "";
    }

}
