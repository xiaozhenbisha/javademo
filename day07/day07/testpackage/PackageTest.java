/*
һ����������
�ٿ���������������
�ڿ����ڿ��Ʒ���Ȩ��
�ۿ����ڻ�����Ŀ�Ľṹ��Σ�ͨ��������������໮�ֵ�ͬһ������

package : ����ȷ����ǰ���λ��
	��д�ڵ�ǰ .java Դ�ļ��п�ִ�д��������
	�ڰ��������淶��������ĸ��Сд��ͨ��ʹ�����ڹ�˾�����ĵ���
		www.atguigu.com  --->  com.atguigu.��Ŀ��.ģ����
	��ÿ�� ��.�� ����һ��Ŀ¼


import : ����ȷ����Ҫ�������λ��
	��д�� package �� class ֮��
	�� import �������ж����������г�
	�� import com.atguigu.aaa.*;  * ������ aaa �������е����ӿڡ�(��������)
	������һ��������Ҫʹ��������ͬ������ͬ������������ʱ
		�磺java.sql.Date;   java.util.Date;
	    ѡ��һ��ʹ�� import java.sql.Date; �����ķ�ʽ
		ѡ������һ��ʹ��ȫ�޶�����(���ȫ����)�ķ�ʽ java.util.Date d2 = new java.util.Date();
	��import static ��̬����������һ���������еľ�̬��Ա������ʡ������.
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
