/*
一、包的作用
①可用于区分重命名
②可用于控制访问权限
③可用于划分项目的结构层次，通常将功能相近的类划分到同一个包中

package : 用于确定当前类的位置
	①写在当前 .java 源文件中可执行代码的首行
	②包的命名规范：所有字母都小写。通常使用所在公司域名的倒置
		www.atguigu.com  --->  com.atguigu.项目名.模块名
	③每个 “.” 代表一层目录


import : 用于确定需要引入类的位置
	①写在 package 和 class 之间
	② import 语句可以有多条，并排列出
	③ import com.atguigu.aaa.*;  * 代表导入 aaa 包中所有的类或接口。(不包括包)
	④若在一个类中需要使用两个相同类名不同包名的两个类时
		如：java.sql.Date;   java.util.Date;
	    选择一个使用 import java.sql.Date; 导包的方式
		选择另外一个使用全限定类名(简称全类名)的方式 java.util.Date d2 = new java.util.Date();
	⑤import static 静态导包，导入一个类中所有的静态成员，可以省略类名.
*/
package com.atguigu.java;

//import com.atguigu.aaa.Person;
//import com.atguigu.aaa.Student;

import com.atguigu.aaa.*;
import com.atguigu.aaa.bbb.Employee;
import java.sql.Date;
//import static com.atguigu.ccc.StaticClass.show;
//import static com.atguigu.ccc.StaticClass.num;

import static com.atguigu.ccc.StaticClass.*;

class PackageTest {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Person p = new Person();

		Student stu = new Student();

		Employee emp = new Employee();

		//java.sql.Date;   java.util.Date;
		Date d1 = new Date(1234);
		java.util.Date d2 = new java.util.Date(1234);

		show();

		System.out.println(num);
	}
}
