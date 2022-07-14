# day06_课后练习

## 第一题：概念辨析

1. 一个类与它的对象之间是什么关系？

   类（Class）是[面向对象](https://so.csdn.net/so/search?q=面向对象&spm=1001.2101.3001.7020)程序设计（OOP，Object-Oriented Programming）实现信息封装的基础。类是一种用户定义的引用数据类型，也称类类型。每个类包含数据说明和一组操作数据或传递消息的函数。类的实例称为对象。

   对象是人们要进行研究的任何事物，它不仅能表示具体的事物，还能表示抽象的规则、计划或事件。对象具有状态，一个对象用数据值来描述它的状态。对象还有操作，用于改变对象的状态，对象及其操作就是对象的行为。对象实现了数据和操作的结合，使数据和操作封装于对象的统一体中。

   类（class）和对象 (object)是两种以计算机为载体的计算机语言的合称。

   . 对象是对客观事物的抽象，

   类是对对象的抽象。

   . 类是一种抽象的数据类型。

   . 它们的关系是，对象是类的实例，类是对象的模板。

2. 如何定义一个类，由哪些部分组成，各个部分的作用是什么？

   ### 类

   什么是类：具有共同属性与方法的对象的[集合](https://so.csdn.net/so/search?q=集合&spm=1001.2101.3001.7020)

   类和关键字在词法上区别：类是大开头写，关键字小写开头

   ### 成员变量

   ```css
   [修饰符列表] 数据类型 属性名；
   ```

   1.当变量写在类中，就变成了成员变量

   2.成员变量是定义在类中、方法外的

   3.成员变量即为类的属性

   4.如果成员变量只声明而未赋值，那么将会获得默认值

   ### 成员方法

   ```css
   [修饰符列表] 返回类型 方法名（形参）{}；
   ```

   1.当方法写在类中，就变成了成员方法

   2.普通方法需要在修饰符加static，而成员方法不加static

   3.成员方法即为类的方法

   ### 一个标准的类需要有四个组成部分

   1.所有的成员变量都要使用private关键字修饰

   2.每一个成员变量都需要编写Get、Set方法

   3.编写一个无参数的构造方法

   4.编写一个有参数的构造方法

3. 如何创建一个对象，如何使用该对象？

   /*
   通常情况下，一个类不能直接使用，需要根据类创建一个对象，才能使用。

   1.导包：也就是指出需要使用的类，在什么位置。
   import 包名称.类名称;
   import 传智.object.Student;
   对于和当前类属于同一个包的情况，可以省略导包语句不写。(object内)

   2.创建,格式：
   类名称 对象名 = new 类名称();
   Student stu = new Student();

   3.使用,分为两种情况：
   使用成员变量：对象名.成员变量名
   使用成员方法：对象名.成员方法名(参数)
   (也就是，想用谁，就用对象名点儿谁。)

   注意事项：
   如果成员变量没有进行赋值，那么将会有一个默认值，规则和数组一样。
    */

4. 局部变量和成员变量的区别？

   局部变量与成员变量的不同

   1，定义的位置不同（重要）
   局部变量：在方法的内部
   成员变量：在方法外部，直接写在类当中

   2，作用范围不一样
   局部变量：只有在方法体内才有效，出了方法就不能在用了
   成员变量：整个类都可以用。

   3，默认还是不一样的
   局部变量：没有默认值，使用时需手动赋值。
   成员变量：如果没有赋值，会使用默认值，规则和各种类型数据一样

   4，内存位置不一样（了解）
   局部变量，位于栈内存当中。
   成员变量：位于堆内存当中。

   5，生命周期不一样
   局部变量：随方法进栈而诞生，随方法出栈而消失。
   成员变量：随方法创建而诞生，随之对象垃圾回收（java的垃圾回收机制）
   而消失。

5. 构造方法和成员方法的区别？

   A:格式区别 
   构造方法和类名相同，并且没有返回类型，也没有返回值。 
   普通成员方法可以任意起名，必须有返回类型，可以没有返回值。 
   B:作用区别 
   构造方法用于创建对象，并进行初始化值。 
   普通成员方法是用于完成特定功能的。 
   C:调用区别 
    构造方法是在创建对象时被调用的，一个对象建立，只调用一次相应构造函数 
    普通成员方法是由创建好的对象调用，可以调用多次

## 第二题：语法练习

* 语法与技能：
  * 类（属性、构造器、方法）、对象、this
  * eclipse使用
* 定义一个圆形Circle类。
  * 属性：私有化
    * r：半径
  * 构造方法：
    * 无参构造方法
    * 满参构造方法
  * 成员方法：
    * get/set方法
    * showArea方法：打印圆形面积
    * showPerimeter方法：打印圆形周长
* 定义测试类TestCircle：创建Circle对象，并测试。

* 开发提示： 

  > 面向周长公式：2 * 3.14*  半径
  >
  > 圆形面积公式：3.14* 半径^2

```java
public class Circle {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle() {
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void showArea(){
		System.out.println("半径为：" + radius + "，面积：" + 3.14 * radius * radius);
	}
	
	public void showPerimeter(){
		System.out.println("半径为：" + radius + "，周长：" + 2 * 3.14 * radius);
	}
}

```

```java
public class Test02 {
	public static void main(String[] args) {
		Circle c1 = new Circle(1.2);
		c1.showArea();
		c1.showPerimeter();
	}
}

```



## 第三题：语法练习

* 语法与技能：
  * 类（属性、构造器、方法）、对象、this
  * eclipse使用
* 定义一个日期MyDate类。
  * 属性：
    * year：年
    * month：月
    * day：日
  * 构造方法：
    * 满参构造方法
  * 成员方法：
    * get/set方法
    * void showDate方法：打印日期。
    * boolean isLeapYear()方法：判断当前日期是否是闰年
* 定义测试类：创建MyDate对象，并测试。

* 代码实现，效果如图所示：

  ![1558694854071](imgs/1558694854071.png)

* 开发提示： 

  * 闰年：
    * 普通年（不能被100整除的年份）能被4整除的为闰年。（如2004年就是闰年,1999年不是闰年）；
    * 世纪年（能被100整除的年份）能被400整除的是闰年。(如2000年是闰年，1900年不是闰年)；

```java
public class MyDate {
	private int year;
	private int month;
	private int day;

	public MyDate() {
	}

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void showDate() {
		System.out.println("日期" + year + "年" + month + "月" + day + "日");
	}

	public boolean isLeapYear() {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}

```

```java
public class Test03 {
	public static void main(String[] args) {
		MyDate my = new MyDate(2019,5,13);
		my.showDate();
		boolean flag = my.isLeapYear();
		System.out.println(my.getYear()+ (flag?"是闰年":"不是闰年"));
	}
}

```



## 第四题：语法练习

* 语法与技能：
  
  * 类（属性、构造器、方法）、对象、this
* 定义一个扑克Card类。
  * 属性：
    * 花色
    * 点数
  * 构造方法：
    * 满参构造方法
  * 成员方法：
    * showCard方法：打印牌面信息
* 定义测试类，创建Card对象，调用showCard方法。

* 代码实现，效果如图所示：

  ![1558694880093](imgs/1558694880093.png)

```java
public class Card {
	private String hua;
	private String dian;

	public Card(String hua, String dian) {
		this.hua = hua;
		this.dian = dian;
	}

	public Card() {
	}

	public String getHua() {
		return hua;
	}

	public void setHua(String hua) {
		this.hua = hua;
	}

	public String getDian() {
		return dian;
	}

	public void setDian(String dian) {
		this.dian = dian;
	}

	public void showCard() {
		System.out.println(hua + dian);
	}
}

```

```java
public class Test03 {
	public static void main(String[] args) {
		Card c = new Card("黑桃", "A");
		c.showCard();
	}
}

```

## 第五题：语法练习

案例：

​	1、声明矩形类com.atguigu.bean.Rectangle

​	（1）包含属性：长和宽，要求属性私有化

​	（2）给每一个属性提供get/set方法

​	（3）public double getArea()

​	（4）public double getPerimeter()

​	（5）提供getInfo()返回矩形对象的信息

​			例如：长：4，宽：2，面积：8，周长：12

​	2、测试类Test06，

​	（1）在main()方法中创建Rectangle对象，并用set方法为属性赋值

​	（2）调用get方法打印属性的值，调用getArea打印面积，调用getPerimeter打印周长

​	（3）再次调用set方法修改属性的值为原来属性值的两倍

​	（4）调用getInfo方法打印矩形信息

```java
public class Rectangle {
	private double length;
	private double width;
	
	public void setLength(double chang){
		length = chang;
	}
	public double getLength(){
		return length;
	}
	public void setWidth(double kuan){
		width = kuan;
	}
	public double getWidth(){
		return width;
	}
	
	public double getArea(){
		return length * width;
	}
	public double getPerimeter(){
		return 2 * (length + width);
	}
	public String getInfo(){
		return "长：" + length + "，宽：" + width + "，面积：" + getArea() + "，周长：" + getPerimeter(); 
	}
}

```

```java
public class Test06 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.setLength(2);
		r.setWidth(1);
		System.out.println("长：" + r.getLength());
		System.out.println("宽：" + r.getWidth());
		System.out.println("面积：" + r.getArea());
		System.out.println("周长：" + r.getPerimeter());
		
		r.setLength(r.getLength()*2);
		r.setWidth(r.getWidth()*2);
		System.out.println(r.getInfo());
	}

}
```
