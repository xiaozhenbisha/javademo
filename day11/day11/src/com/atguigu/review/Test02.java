package com.atguigu.review;

public class Test02 {
	public static void main(String[] args) {
		Father f = new Son();
		System.out.println(f.x);
		//System.out.println("Hello");
	}
}
class Father{
	int x = 10;
	public Father(){
		this.print();
		x = 20;
	}
	public void print(){
		System.out.println("Father.x = " + x);
	}
}
class Son extends Father{
	int x = 30;
	public Son(){
		//super();
		this.print();
		x = 40;
	}
	public void print(){
		System.out.println("Son.x = " + x);
	}
}