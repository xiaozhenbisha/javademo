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

```java
	public static void main(String[] args) {
		Integer i1 = 128;
		Integer i2 = 128;
		int i3 = 128;
		int i4 = 128;
		System.out.println(i1 == i2);//false，比较地址，128超过Integer缓存对象
		System.out.println(i3 == i4);//true，比较数据值
		System.out.println(i1 == i3);//true，i1自动拆箱按照基本数据类型比较
        //包装类对象与基本数据类型进行比较时，就会把包装类对象自动拆箱，按照基本数据类型的规则进行比较
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

```java
	public static void main(String[] args) {
		double a = 2.0;
		double b = 2.0;
		Double c = 2.0;
		Double d = 2.0;
		System.out.println(a == b);//true，基本数据类型比较数据值
		System.out.println(c == d);//false，对象比较地址值，Double没有缓存对象
		System.out.println(a == d);//true,d自动拆箱，按照基本数据类型比较
	}
```



# 枚举编程题

## 第1题

案例：

​	1、声明颜色枚举类：

​		7个常量对象：赤、橙、黄、绿、青、蓝、紫。

​	2、在测试类中，使用枚举类，获取绿色对象，并打印对象。

```java
package com.atguigu.test01;

public class Test01 {
	public static void main(String[] args) {
		Color c = Color.GREEN;
		System.out.println(c);
	}
}
enum Color{
	RED,ORANGE,YELLOW,GREEN,CYAN,BLUE,PURPLE
}
```



## 第2题

案例：

​	1、声明月份枚举类Month：

​	（1）创建：1-12月常量对象

​	（2）声明两个属性：value（月份值，例如：JANUARY的value为1），

​						description（描述，例如：JANUARY的description为1月份是一年的开始）。

​	（3）声明一个有参构造，创建12个对象

​	（4） 声明一个方法：public static Month getByValue(int value)

​	（5）重写toString()：返回对象信息，例如：1->JANUARY->1月份是一年的开始。

​	2、在测试类中，从键盘输入1个1-12的月份值，获取对应的月份对象，并打印对象

```java
package com.atguigu.test02;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入月份值（1-12）：");
		int m = input.nextInt();
		
		Month month = Month.getByValue(m);
		System.out.println(month);
		
		input.close();
	}
}
enum Month{
	JANUARY(1,"1月份是一年的开始"),
	FEBRUARY(2,"2月份是一年中最短的一个月"),
	MARCH(3,"3月春暖花开"),
	APRIL(4,"4月阳光明媚"),
	MAY(5,"5月清凉初夏"),
	JUNE(6,"6月骄阳似火"),
	JULY(7,"7月下半年的第一个月"),
	AUGUST(8,"8月人已晒干"),
	SEPTEMBER(9,"秋风送爽"),
	OCTOBER(10,"10月全国同欢"),
	NOVEMBER(11,"11月寻找秋裤"),
	DECMEBER(12,"12月冰天雪地");
	
	private int value;
	private String description;
	
	private Month(int value,String description){
		this.value = value;
		this.description = description;
	}
	
	public static Month getByValue(int value){
		return Month.values()[value-1];
	}
	
	public String toString(){
		return value + "->" + name() + "->" + description;
	}
}
```



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

```java
package com.atguigu.test03;

public class Test03 {
	public static void main(String[] args) {
		Payment[] values = Payment.values();
		for (int i = 0; i < values.length; i++) {
			values[i].pay();
		}
	}
}
interface Payable{
	void pay();
}
enum Payment implements Payable{
	ALIPAY{
		@Override
		public void pay() {
			System.out.println("扫码支付");
		}
	},WECHAT{
		@Override
		public void pay() {
			System.out.println("扫码支付");
		}
	},CREDIT_CARD,DEPOSIT_CARD;

	@Override
	public void pay() {
		System.out.println("输入卡号支付");
	}
}

```

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

```java
package com.atguigu.test05;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {
	String value();
}
```

```java
package com.atguigu.test05;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
	String name();
	String type();
}

```

```java
package com.atguigu.test05;

@Table("t_user")
public class User {
	@Column(name="no",type="int")
	private int id;
	
	@Column(name="username",type="varchar(20)")
	private String username;
	
	@Column(name="pwd",type="char(6)")
	private String password;
	
	@Column(name="email",type="varchar(50)")
	private String email;
	
	public User(int id, String username, String password, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	public User() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + "]";
	}
	
}
```



# 