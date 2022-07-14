# 第一章 Java 编程语言概述

## 一、走进 Java 语言

1、Java 由 SUN 公司研发，后来 SUN 被 Oracle 收购

2、Java 之父：James Gosling

3、Java 由 1995 年发布，正式版本由 1996年1月发布（jdk1.0）



## 二、Java 的特点

1、面向对象

2、分布式

3、简单化

4、多线程

5、安全

6、跨平台移植 ------ JVM Java Virtual Machine Java 虚拟机



## 三、Java 的三大平台体系

JavaSE Java Standard Edition Java 标准版：适用于开发 C/S （Client/Server）架构的应用程序

JavaEE Java Enterprise Edition Java 企业版：适用于开发 B/S （Browser/Server）架构的应用程序

JavaME Java Micro Edition Java 微型版：-------  Android



## 四、开发第一个应用程序

### 1、搭建开发环境

JVM Java Virtual Machine Java 虚拟机：用于与操作系统进行交互

![](img/JVM.PNG)

JRE Java Runtime Enviroment Java 运行环境：JVM + Java 提供的核心类库

JDK Java Development Kit Java 开发工具集：JRE + Java 提供的开发工具集（javac.exe java.exe javadoc.exe）



### 2、下载安装配置 JDK

①下载安装 JDK

②通过命令提示符到 JDK 安装路径的 bin 路径下，执行 javac

③配置 path 环境变量：JDK 安装路径的 bin

​		目的：在任意路径下执行 javac

​		执行流程：先在当前路径下找是否有 javac.exe ，若没有再到 path 环境变量中从前往后依次查找

④配置 JAVA_HOME : 配置到 JDK 的安装路径。 如： d:\Java\jdk1.8.0_141

⑤将path 环境变量修改为： %JAVA_HOME%\bin



### 3、开发第一个应用程序的步骤

①编写： .java 源文件 【HelloWorld.java】

```java
public class HelloWorld{
    public static void main(String[] args){
        System.out.println("HelloWorld");
    }
}
```

②编译：通过 javac 命令，生成一个或多个的 .class 字节码文件。【javac HelloWorld.java】

③运行：通过 java 命令，将一个或多个 .class 字节码文件加载到内存中。【java HelloWorld】



### 4、开发第一个应用程序的注意

①以 .java 结尾的文件称为 .java 源文件

②一个 .java 源文件中可以有多个类

③一个 .java 源文件中只能有一个 public 修饰的类

④public 修饰类的名称必须与源文件名称一致

⑤每条语句以 ";" 结尾

⑥Java 严格区分大小写

⑦若一个需要执行，该类中必须提供一个主方法，是程序的入口

```java
public static void main(String[] args){}
```



## 五、注释语句

不会被 JVM 解释执行的语句，用于解释说明一段代码

//单行注释



/*

​	多行注释：

​		注意：多行注释不能嵌套

*/



/**

​	Java 特有的注释：文档注释

​	可以通过 javadoc -d e:\mydoc -author -version HelloWorld.java

*/



# 第二章 Java 基础语法1

## 一、标识符

凡是自己明明的地方都叫标识符。例如：包名、类名、接口名、方法名、变量名、常量名



关键字：被 Java 赋予了特殊含义的单词



![](img/关键字和保留字.png)



### 1、命名的规则（必须遵守，若不遵守编译不能通过）

①只能有字母 a-z A-Z  数字 0-9  特殊字符 "_" 下划线 和  "$" 美元符

②数字不能开头

③名字之间不能有空格

④不能使用关键字和保留字，但是可以包含关键字和保留字

⑤Java 严格区分大小写，但是长度无限制



### 2、命名的规范（可以不遵守，但是会受到鄙视）

①包名：所有字母都小写。 如： xxxyyyzzz

②类名、接口名：若有多个单词组成，每个单词首字母都大写。 如：XxxYyyZzz

③方法名、变量名：若有多个单词组成，第一个单词首字母小写，其余单词首字母都大写。 如：xxxYyyZzz

④常量名：所有字母都大写，每个单词之间以 "_" 隔开。 如：XXX_YYY_ZZZ



## 二、变量

保存数据



变量：**局部变量** & 成员变量



### 1、变量的格式

数据类型 变量名 = 值;

如： int var = 10;

//声明一个变量

int var;

//为变量赋值

var = 10;



### 2、变量的概念

①在内存中开辟一块内存空间

②该空间有类型（数据类型）有名称（变量名）

③变量可以在指定的范围内不断的变化



### 3、变量的注意

①在同一个作用范围内变量名不能重复

②作用域：变量作用在所属的那对 {} 内

**③局部变量在使用前必须赋值**

④先声明，后使用



## 三、进制之间的转换（了解）

![](img/1587691629833.png)

![1590371161640](img/1590371161640.png)

## 四、变量的数据类型

### 1、基本数据类型

​		整型：byte(8位)  short(16位)  int(32位)-默认类型  long(64位)

​		浮点型：float(32位)   double(64位)-默认类型

​		字符型：char(16位-2个字节)

​		布尔型：boolean 



### 2、引用数据类型

​	|--类（class）   -------------------   String

​	|--接口（interface）

​	|--数组（[]）



### 3、声明变量的注意

①声明 long 型变量，值后必须加 L 或 l 。 如：long l1 = 1234345784L;

②声明 float 型变量，值后必须加 F 或 f 。 如：float f1 = 15.6F;

③声明 double 型变量，值后可以加 D 或 d 。如：double d1 = 15.6;   double d2 = 15.6D;

④声明 char 型变量，值必须使用单引号，char 型变量只能存储单个字符。

​	  char 型变量使用 Unicode 编码存储（ASCII、中文、日文、特殊字符）

​	如：

​		char c1 = 'A';   

​		char c2 = '中';

​		char c3 = '$';

​		char c4 = '\uC499';

⑤声明 String 型变量，值必须使用双引号。 如： String str = "我大尚硅谷威武！";



## 五、数据类型之间的转换

### 自动类型转换（自动升级）

小容量转大容量。系统自动完成

如：

​	byte b = 123;

​	int i = b; //自动类型转换

①byte  short  char ---->  int ---->  **long  ---->  float**  ----> double

②byte short char 三者之间不做运算，若运算都将提升成 int 再做运算

③boolean 不参与运算



④任何基本数据类型与 String 使用 连接符 + , 都将自动串接成 String



### 强制类型转换

大容量转小容量。需要使用强转符 "(需要转换的类型)"，可能损失精度。

如：

​	int a = 130;

​	byte b = (byte)a;

## 六、运算符

### 算数运算符

```java
+  -   +  -   *   /  %   (前)++   (后)++  (前)-- (后)--  +（连接符）
```

```java
//除法
System.out.println(1234 / 1000 * 1000); //1000

//取模(求余)
System.out.println(10 % 5);

//++运算符
int a = 10;
//前++
System.out.println(++a);//11

//后++
System.out.println(a++);//11
System.out.println(a);//12
```

【面试题】

int a = 10;

a = a++;

System.out.println(a);//10

![1590456855588](img/1590456855588.png)





### 赋值运算符

```java
=  +=  -=   *=  /=   %=
```

```java
int a = 10;
a += 10; //a = a + 10;
```

【面试题】

short s = 1;

s = s + 1; //编译?   NO

s += 1;  //s = (short)(s + 1)编译？  YES

### 比较运算符（关系运算符）

比较运算符运算结果都为 boolean

```java
==   !=  >  <   >=   <=
```

```java
int a = 10;
int b = 20;
boolean boo = a == b;
```



### 逻辑运算符

逻辑运算符结果都为 boolean

```java
&& （短路与） || （短路或）  !(逻辑非)   &(逻辑与)  |（逻辑或） ^(逻辑异或)
```

```java
//需求：判断一个数是不是大于10小于20
int a = 10;

//错误的做法
//boolean boo = 10 < a < 20;

//逻辑运算符
boolean boo = a > 10 && a++ < 20;

System.out.println(a);//10
```

【面试题】&& 和 & 的区别？

&& : 短路与，当 && 左边表达式结果为 false 时，右边表达式将不再计算

&：是位运算符，当用于逻辑运算时，无论左边表达式结果为 true 还是 false ，右边都计算



|| 和  |  的区别？



### 位运算符

```java
~  &  |  ^   <<  >>  >>>  注意：没有 <<<
```



### 三元运算符（三目运算符）

格式：
	条件表达式 ? 表达式1 : 表达式2;

①条件表达式结果为 true 时，执行表达式1，否则执行表达式2

②表达式1与表达式2结果的类型需要保持一致！

```java
int a = 10;
int b = 20;
int max = a > b ? a : b;
```



# 第三章  Java 基础语法2

## 一、流程控制

### 顺序结构

Java 程序的运行时顺序执行

### 分支结构

#### 	条件判断

​			①

​			if(条件表达式){

​				//若条件表达式结果为 true 时，需要执行的语句

​			}

​			②

​			if(条件表达式){

​				//若条件表达式结果为 true 时，需要执行的语句

​			}else{

​				//若条件表达式结果为 false 时，需要执行的语句

​			}

​			③

​			if(条件表达式1){

​				//若条件表达式1 结果为 true 时，需要执行的语句

​			}else if(条件表达式2){

​				//若条件表达式2 结果为 true 时，需要执行的语句

​			}else if(条件表达式3){

​				//若条件表达式3 结果为 true 时，需要执行的语句

​			}

​			……

​			else{

​				//若上述条件表达式结果都为 false 时，需要执行的语句

​			}

​			注意：

​			①若某个条件表达式结果为 true ，执行相应语句，其他 else if 不再执行

​			②if-else 语句可以嵌套的

#### 	选择结构

​			switch(表达式){

​				case 值1:

​					//执行的语句

​					break;

​				case 值2:

​					//执行的语句

​					break;

​				case 值3:

​					//执行的语句

​					break;

​				default:

​					//执行的语句

​					break;

​			}

​			注意：

​				①表达式结果的类型只能是 byte short  char int  String(jdk1.7后)  枚举

​				②default 是可选的

​				③break 也是可选的,如果某个case 后的值匹配成功，依次向下执行，直到遇到 break 为止

​				④case 后只能写常量值，不能写表达式

​				⑤表达式结果的类型需要与 case 后值的类型保持一致！

​				

​				

```java
//需求：若一个数大于等于2 小于等于，则打印 "2-5"
int num = 2;
switch(num){
    case 2:
    case 3:
    case 4:
    case 5:
    	System.out.println("2-5");
    	break;
}
```



### 循环结构

重复的执行某语句

①初始化值

②循环条件

③迭代条件

④循环体



for 循环：

for( ①; ② ; ③){

​	④

}

执行流程：①②④③②……②



while 循环：

①

while(②){

​	④

​	③

}



do-while 循环：

①

do{

​	④

​	③

}while(②);



while 和  do-while 的区别？

while : 先判断循环条件，再执行循环体

do-while ：先执行循环体，再判断循环条件，do-while 至少执行一次



#### 嵌套循环

一个循环充当另一个循环的循环体

```java
/*
1—100之间的所有质数:除了1和其本身，不能被其他自然数整除的数

*/
class PrimeNumber {
	public static void main(String[] args) {
		boolean flag = true;

		for(int i = 2; i <= 100; i++){
			for(int j = 2; j < i; j++){
				
				if(i % j == 0){
					//该数一定不是质数
					flag = false;
                    break;
				}
			}

			//可以确定 i 是否是质数，是质数打印。
			if(flag){
				System.out.println(i);
			}

			flag = true;
		}

	}
}
```

## 二、特殊流程控制语句

break ：用于结束“当前”循环。可以使用在 switch-case 语句中，用于结束当前 switch-case 语句

continue ：用于结束“当次”循环。

```java
for(int i = 0; i <= 10; i++){
    if(i == 3){
        //break;
        continue;
    }
    System.out.println(i);
}
```

```java
label:for(int i = 0; i <= 10; i++){
    for(int j = 0; j <= 10; j++){
        if(j == 3){
            //break label;
            continue label;
        }
    }
}
```

```java
label:{//continue 不支持结束代码块
    for(int i = 0; i <= 10; i++){
        for(int j = 0; j <= 10; j++){
            if(j == 3){
                break label;
            }
        }
    }
    
    System.out.println("Hello Break!");
}
```

# 第四章 方法的声明和使用

## 一、方法

也叫函数，是一个功能的定义，是一个类中最基本的功能单元



## 二、方法的格式

修饰符 返回值类型 方法名(参数列表){

​	//需要执行的功能语句

​	return 返回值;

}



修饰符：暂时使用 public static 

返回值类型：说明方法运行后有结果，那个结果的数据类型

参数列表：就是局部变量，可以有0个或多个，每个参数之间以 "," 隔开

**return：用于结束当前方法

返回值：方法运行结束后，那个结果具体的值



## 三、方法的注意

1、“返回值类型”与“返回值”的数据类型需要保持一致！

2、通过 方法名+参数列表的方式调用方法，调用方法的方法名和参数列表（参数的个数、参数的类型）必须与声明时相同

3、若声明了“返回值类型”说明该方法运行后，有结果，若调用者需要用到该结果，可以声明变量接收

4、若方法运行后不需要返回结果给调用者，则“返回值类型”处声明为：void

​	void：无返回值

5、方法中不能声明方法，可以调用其他方法



## 四、声明方法前的两点明确

1、是否需要返回结果给调用者（调用者是否需要用结果参与其他运算）

​		明确是否需要返回值，返回值类型是什么

2、是否有未知的数据参与运算

​		明确是否需要参数，需要几个，参数的数据类型

```java
public class MethodTest{
    public static void main(String[] args){
        //需求：计算一个数 * 2 + 1 的结果
        /*int num = 5;
        int res = num * 2 + 1;

        num = 7;
        res = num * 2 + 1;*/
        
        //调用已经声明方法
        int res = result(10);//10 实际参数：用于传递给方法形式参数的具体值
        print99();
        print99();
    }
    
    //声明一个方法
    public static int result(int a){//形式参数：用于接收调用者传递的实际参数值
        return a * 2 + 1;
    }
    
    //打印 99 乘法表
    public static void print99(){
        
    }
    
    //需求：计算两个数的和
    public static int add(int a, int b){
        return a + b;
    }
}
```

## 五、跨类调用方法

通过 类名.方法名 的方式进行跨类调用方法（暂时使用 static 修饰的方法为例）



## 六、参数的值传递

### 基本数据类型

当将基本数据类型作为参数，传递给方法，方法运行结束后，原值不会发生改变



```java
class MethodTest{
    
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        add(a, b);
        System.out.println("a=" + a + " b=" + b);//a=10  b=20
    }
    
    //需求：改变两个数的值
    public static void add(int a, int b){//方法运行时，参数一定有值
        a += 1;
        b += 2;
    }
}
```

![1590716790770](img/1590716790770.png)



### 引用数据类型

## 七、方法重载（Overload）

在同一个类中

①方法名相同

②参数列表不同(参数的个数、参数的类型)

注意：与返回值类型无关



```java
public static void show(int a, char c){}

public static void show(char c, int a){}

public static int show(int a, char c, double d){}
```

