# day13_课后练习

# 包装类代码题

## 第1题

```java
	public static void main(String[] args) {
		Integer i1 = 128;
		Integer i2 = 128;
		int i3 = 128;
		int i4 = 128;
		System.out.println(i1 == i2);
		System.out.println(i3 == i4);
		System.out.println(i1 == i3);
	}
```

## 第2题

```java
	public static void main(String[] args) {
		double a = 2.0;
		double b = 2.0;
		Double c = 2.0;
		Double d = 2.0;
		System.out.println(a == b);
		System.out.println(c == d);
		System.out.println(a == d);
	}
```

# 枚举编程题

## 第1题

案例：

​	1、声明颜色枚举类：

​		7个常量对象：赤、橙、黄、绿、青、蓝、紫。

​	2、在测试类中，使用枚举类，获取绿色对象，并打印对象。

## 第2题

案例：

​	1、声明月份枚举类Month：

​	（1）创建：1-12月常量对象

​	（2）声明两个属性：value（月份值，例如：JANUARY的value为1），

​						description（描述，例如：JANUARY的description为1月份是一年的开始）。

​	（3）声明一个有参构造，创建12个对象

​	（4） 声明一个方法：public static Month getByValue(int value)

​	（5）手动重写toString()：返回对象信息，例如：1->JANUARY->1月份是一年的开始。

​	2、在测试类中，从键盘输入1个1-12的月份值，获取对应的月份对象，并打印对象

## 第3题

案例：

​	1、声明可支付接口Payable：

​		包含抽象方法：void pay();

​	2、声明支付枚举类Payment：

​	（1）创建常量对象：支付宝（ALIPAY），微信（WECHAT），信用卡（CREDIT_CARD），储蓄卡（DEPOSIT_CARD）

​	（2）枚举类Payment实现接口Payable

​	①支付宝/微信：对接口的实现是打印“扫码支付”

​	②信用卡/储蓄卡：对接口的实现是打印“输入卡号支付”

​	3、在测试类中，获取所有支付对象，并调用它们的pay()

# 注解编程题

## 第1题

案例：

​	1、声明自定义注解@Table

​	（1）加上String类型的配置参数value

​	（2）并限定@Table的使用位置为类上

​	（3）并指定生命周期为“运行时”

​	2、声明自定义注解@Column

​	（1）加上String类型的配置参数name，表示表格的列名

​	（2）加上String类型的配置参数type，表示表格的列数据类型

​	（3）并限定@Column的使用位置在属性上

​	（4）并指定生命周期为“运行时”

​	3、声明User类，

​	（1）属性：id, username, password, email

​	（2）在User类上，标记@Table注解，并为value赋值为"t_user"

​	（3）在User类的每一个属性上标记@Column，并为name和type赋值，例如：

​		id：name赋值为no，type赋值为int

​		username：name赋值为username，type赋值为varchar(20)

​		password：name赋值为pwd，type赋值为char(6)

​		email：name赋值为email，type赋值为varchar(50)