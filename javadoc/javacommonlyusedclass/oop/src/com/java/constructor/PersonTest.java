package com.java.constructor;

public class PersonTest {
    public static void main(String[] args) {
        /*Person b = new Person();
		//b.age = -10;

		b.setAge(10);

		System.out.println(b.getAge());*/

		/*Person p = new Person();

		System.out.println(p.getAge());*/

        Person p = new Person("张三", 18);
        System.out.println(p.getName() + "," + p.getAge());
    }
}


