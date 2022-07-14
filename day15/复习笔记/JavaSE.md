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



## 六、参数的值传递:基本数据类型

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



### 引用数据类型:(见第五章)

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

# 第五章 面向对象编程（上）

## 一、面向过程与面向对象

面向过程：强调的是功能行为

面向对象：将功能行为封装进对象，强调具备了功能行为的对象



【例子】把大象装冰箱一共分几步？

①打开冰箱 ②把大象装进去（存储大象）③关闭冰箱



如何运用面向对象思想思考上述问题？

人{

​	推(冰箱){

​		冰箱.关闭()

​	}



​	指挥(动物){

​		动物.进入()

​	}



​	拉(冰箱){

​		冰箱.打开()

​	}

}



冰箱{

​	打开(){}

​	存储(){}

​	关闭(){}

}



大象{

​	进入(){}

}



小松鼠(){

​	进入(){}

}

面向对象更加注重前期的设计

①就是对类的设计

②设计类的成员：属性 & 方法



1、面向对象：将现实生活中一类事物的共性内容，进行提取，抽象成相应的 Java 类，使用 Java 类对其进行描述

现实生活中的事物： 张三  李四  王五

共性内容：姓名 性别  年龄  吃饭的功能 睡觉的功能



```java
//抽象的：描述的是现实生活中的“一类”事物
class Person{
    //属性
    String name = "张三";
    char gender;
    int age;
    
    //方法-行为
    public void eat(){
        int a = 10;
        System.out.println("吃饭");
    }
    
    public void sleep(){
        System.out.println("睡觉");
    }
}
```



2、类是抽象的，描述的是现实生活中的“一类”事物。若需要具体到某一个人，**通过 new 关键字创建对象**

```java
class PersonTest{
    public static void main(String[] args){
        //创建 Person 的对象
        Person p = new Person();
        //设置属性值
        p.name = "张三";
        p.gender = '男';
        p.age = 18;
        
        //获取属性值
        String n = p.name;
        System.out.println(n + "," + p.gender + "," + p.age);
        
        p.eat();
        p.sleep();
        
        Person p2 = new Person();
    }
}
```

3、类和对象

类：抽象的，描述的现实生活中的一类事物。相当于 汽车设计图

对象：是一个实实在在的个体。 相当于 一辆辆的汽车

![](img/汽车图纸.PNG)

## 二、对象的属性

属性：也叫成员变量，也叫实例变量



### 1、局部变量&成员变量的区别

①作用域不同

②内存中的位置不同

③成员变量有默认值，局部变量没有默认值（因此局部变量使用前必须赋值）



### 2、属性的默认值

基本数据类型：

byte  short  int ---> 0

long  ---> 0L

float ---> 0.0F

double  ---> 0.0D

char  --->  '\u0000'

boolean ---> false



引用数据类型：  --->  null

​	类(class) 

​	接口(interface)

​	数组([])



### 3、为属性赋初始值的方式

①默认值（缺省值）

②直接显示赋值



## 三、参数的值传递：引用数据类型

基本数据类型：(见第四章)

引用数据类型:当将引用数据类型作为参数，传递给方法，方法运行结束后，原属性值会发生改变

```java
class ReviewTest {
	public static void main(String[] args) {
		ReviewTest rt = new ReviewTest();

		Number1 num = new Number1();
		num.a = 10;
		num.b = 20;

		rt.add(num);
		System.out.println("num.a=" + num.a + " num.b=" + num.b);//
	}
	public void add(Number1 num){//相当于：Number1 num = new Number1()
		num.a += 1;
		num.b += 2;
	}
}

class Number1{

	int a;
	int b;

}
```

![1590804540603](img/1590804540603.png)

## 四、Java 内存管理和垃圾回收

内存管理：

分配：由 JVM 自动的为其分配内存空间

释放：由 JVM 自动的通过垃圾回收机制释放内存空间



垃圾回收机制（GC Garbage Collection）：将内存中的垃圾对象从内存中释放



垃圾对象：不再被任何引用指向的对象



Person p = new Person(); //分配

p = null;



System.gc() : 通知垃圾回收机制可以释放内存，但是垃圾回收机制并不会立即的执行

​		       通知并加快垃圾回收机制的运行。

## 五、面向对象的特性之一：封装性

1、封装的理解：该隐藏的隐藏起来，该暴露的暴露出来



2、访问控制修饰符

public : 公共的，可用于修饰属性、方法、类。 任何地方都可以访问

private ：私有的，可用于修饰属性、方法。只能在本类中访问



3、封装的步骤

①属性私有化(private)

②提供公共的(public) get/set 方法

```java
class AnimalTest{
    
    public static void main(String[] args){
        Animal ani1 = new Animal();
        ani1.name = "大象";
        //ani1.legs = -1000;
        
        ani1.setLegs(-1000);
        
        int l = ani1.getLegs();
    }
    
}

class Animal{
    private String name;
    private int legs; //描述腿的个数
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    //设置属性值
    public void setLegs(int legs){
        if(legs >= 0 && legs <= 4 && legs % 2 == 0){
            this.legs = legs;
        }
    }
    
    //获取属性值
    public int getLegs(){
        return legs;
    }
}
```



## 六、this 关键字

代表**当前对象**的引用，可用于调用属性、方法、构造器

this.属性

this.方法

this(……) ： 调用本类构造器

​	①this调用本类构造器，必须写在当前构造器中可执行代码的首行

​	②避免构成递归构造器调用



谁让拥有 this 关键字的方法运行了，谁就是当前对象



```java
class AnimalTest{
    
    public static void main(String[] args){
        Animal ani1 = new Animal();
        ani1.name = "大象";
        //ani1.legs = -1000;
        ani1.setLegs(-1000);
        int l = ani1.getLegs();
        
        Animal ani2 = new Animal();
        ani2.setName("老虎");
        ani2.setLegs(4);
    }
    
}

class Animal{
    private String name;
    private int legs; //描述腿的个数
    
    public void setName(String name){
        this.name = name;//用于区分局部变量和成员变量
    }
    
    public String getName(){
        return name;
    }
    
    //设置属性值
    public void setLegs(int legs){
        if(legs >= 0 && legs <= 4 && legs % 2 == 0){
            this.legs = legs;
        }
    }
    
    //获取属性值
    public int getLegs(){
        return legs;
    }
    
    public void show(){
        this.setLegs("设置属性值");
    }
}
```

## 七、构造器的声明和使用

构造器，也叫构造方法，是类的成员之一。

属性

方法

构造器



### 1、构造器的格式

​	访问控制修饰符 类名(参数列表){

​		//功能语句

​	}

### 2、构造器的作用

①创建对象

②为对象进行初始化（创建对象的同时具备的属性和功能行为）



### 3、构造器的注意

①构造器的名称必须与类名一致！

②**若一个类中没有显示提供任何构造器时，系统会提供一个默认的无参构造器

​	public Person(){}

③**若一个类中显示的提供了任何一个构造器，系统默认无参构造器将不再提供

④构造器只能调用一次，并且是在创建对象的时候

⑤构造器之间可以构成重载



### 4、构造器的重载

使用在同一个类中

①构造器的名称相同

②参数列表不同（参数的个数、参数的类型）



### 5、为属性赋初始值的方式

①默认值（缺省值）

②直接显示赋值

③构造器赋值

顺序：①②③



```java
class ConstructorTest{
    
    public static void main(String[] args){
        Person p = new Person();
        //p.cry();
        
        Person p1 = new Person();
        //p1.cry();
        
        Person p2 = new Person("张三");
    }
    
}

class Person{

	private String name;
    private int age;
    
    //声明一个构造器
    public Person(){
        cry();
    }
    
    public Person(String name){
        //this(name, 18);构成递归构造器调用，需要避免该情况的发生
        this.name = name;
    }
    
    public Person(String name, int age){
        this(name);
        this.age = age;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void cry(){
        System.out.println("哭……");
    }
    
}
```

## 八、包的管理

包的作用：

①用于区分重命名

②用于控制访问权限

③用于划分项目结构层次，通常将功能相近的类划分到同一个包中



package：用于确定当前类的位置

​	①写在当前 .java 源文件中可执行代码的首行

​	②包的命名规范：所有字母都小写。（通常使用所在公司域名的倒置）

​		www.atguigu.com  -->   com.atguigu.项目名.模块名

​	③每个 "." 代表一层目录



import ： 用于确定需要引入类的位置

​	①写在 package 与 class 之间

​	②import 语句可以有多条，并排列出

​	③import com.atguigu.java.* : 代表导入 java 包中所有的类和接口。（不包括包）

​	④若在一个类中使用两个相同类名不同包名的两个类时

​		如：java.sql.Date    java.util.Date

​		选择一个使用 import java.sql.Date 导包的方式

​		选择另外一个使用全限定类名（全类名）java.util.Date date = new java.util.Date();

​	⑤import static 静态导包，可以导入一个类中所有的静态成员。（可以省略 类名.）

# 第六章 数组的声明和使用

用于批量保存一类数据，是引用数据类型之一



## 一、声明一个数组

变量的格式：数据类型 变量名 = 值;

int a = 10;

int b;

b = 20;

```java
int[] scores;
String[] names;
Person[] persons;
```



## 二、为数组初始化并赋值

1、静态初始化：初始化操作和赋值操作同时进行

```java
scores = new int[]{1,2,3,4,5};
```

2、动态初始化：初始化操作和赋值操作分开进行

```java
names = new String[3];
names[0] = "张三";
names[1] = "李四";
names[2] = "王五";
```

```javascript
persons = new Person[3];
persons[0] = new Person();
persons[1] = new Person("张三", 18);
persons[2] = new Person("李四", 20);
```

## 三、数组的遍历

```java
int s = scores[0];
System.out.println(s);
System.out.println(scores[1]);
System.out.println(scores[2]);
System.out.println(scores[3]);
System.out.println(scores[4]);
```



### 1、普通 for 循环遍历数组

```java
for(int i = 0; i < scores.length; i++){
	int a = scores[i];
    System.out.println(a);
}
```

```java
for(int i = 0; i < persons.length; i++){
    Person p = persons[i];
    System.out.println(p.say());
}
```

### 2、增强 for 循环遍历数组

for(被遍历数组中元素的数据类型 变量名 :  被遍历的数组){

}

```java
for(int a : scores){
    System.out.println(a);
}
```

```java
for(Person p : persons){
    System.out.println(p.say());
}
```

```java
//注意:增强 for 循环不擅长修改数组中元素的值
//需求：改变数组中元素的值
for(int a : scores){
    if(a == 2){
        a = 22;//改变变量 a 的值，与数组中元素的值没关系
    }
}
```

```java
for(int i = 0; i < scores.length; i++){
    if(scores[i] == 2){
        scores[i] = 22;
    }
}
```

```java
for(Person p : persons){
    if(p.getAge() == 18){
        p.setAge(22);
    }
}

for(Person p : persons){
    System.out.println(p.getAge());
}
```

## 四、数组的特点

1、数组无论静态初始化还是动态初始化必须指明长度

2、数组中每个元素都具有索引值（下角标、下标），索引值从0开始，到数组的长度 - 1.

3、获取数组长度的属性：length



## 五、数组的默认值

基本数据类型：

byte short int --> 0

long --> 0L

float --> 0.0F

double --> 0.0D

char --> '\u0000'

boolean --> false



引用数据类型： --->  null

​	|--类(class)

​	|--接口(interface)

​	|--数组([])

## 六、数组的常见异常

```java
int[] arr = new int[5];
arr[8] = 100; //ArrayIndexOutOfBoundsException 数组下标越界异常
```

```java
Person[] persons = new Person[3]; //{new Person("张三"， 18), null, null}
persons[0] = new Person("张三"， 18)；

for(Person p : persons){
	System.out.println(p.say());//null.say()
}//NullPointerException 空指针异常
```

## 七、二维数组

### 1、声明一个二维数组

```java
int[][] arr;
```



### 2、为二维数组初始化并赋值

①静态初始化：初始化操作和赋值操作同时进行

```java
arr = new int[][]{  {1,2,3}, {4,5,6}, {7,8}  };
```

②动态初始化：初始化操作和赋值操作分开进行

​	方式一：

```java
arr = new int[3][4];//{ {0,11,0,0}, {0,0,66,0}, {0,0,0,0} }
arr[0][1] = 11;
arr[1][2] = 66;
```

​	方式二：

```java
arr = new int[3][];//{ null, {0,66}, {0,0,0} }
arr[1] = new int[2];
arr[2] = new int[3];

arr[1][1] = 66;
```

### 3、二维数组的遍历

```java
//从二维数组中获取一个个的以为数组
for(int i = 0; i < arr.length; i++){
    int[] as = arr[i];
    
    //从一维数组中取出一个个的 int 类型的数据
    for(int j = 0; j < as.length; j++){
        System.out.print(as[j] + "\t");
    }
    System.out.println();
}

//从二维数组中获取一个个的以为数组
for(int i = 0; i < arr.length; i++){
    //从一维数组中取出一个个的 int 类型的数据
    for(int j = 0; j < arr[i].length; j++){
        System.out.print(arr[i][j] + "\t");
    }
    System.out.println();
}
```

```java
for(int[] as : arr){
    for(int a : as){
        System.out.print(a + "\t");
    }
    System.out.println();
}
```

## 八、命令行参数(了解)

```java
class HelloWorld{
    public static void main(String[] args){//args : 命令行参数
        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
        
        //将 String 转换成 int
        int num = Integer.parseInt(args[0]);
    }
}
//通过运行命令 java HelloWorld "aaa bbb" ccc  传递一些测试数据
```



## 九、可变参数

注意：

​	①可变参数与数组参数之间不能构成重载

​	②可变参数必须写在参数列表的末尾

```java
public static void main(String[] args){
    //int[] arr = {1,2,3,4,5}; 
    //int sum = add(arr);//每次调用该方法，需要创建一个数组，有点麻烦
    
    add(1,2,3,4,5);//
}

//需求：计算两个整数的和
/*public int add(int a, int b){
    return a + b;
}

//需求：计算三个整数的和
public int add(int a, int b, int c){
    return a + b + c;
}*/

//需求：计算 N 个整数的和
/*public static int add(int[] arr){
    int sum = 0;
    for(int i = 0; i < arr.length; i++){
        sum += arr[i];
    }
    return sum;
}*/

//可变参数低层是数组，数组中数据如何取，可变参数中的数据就如何取
public static int add(int ... arr){//可变参数，调用该方法时可以传递 0 个或 多个 int 类型的数据
    int sum = 0;
    for(int i = 0; i < arr.length; i++){
        sum += arr[i];
    }
    return sum;
}

public static void add(String ... args){
    
}

public static void add(double d1, Person ... persons){
    
}
```

# 第七章 面向对象编程（下）

## 一、面向对象的特性之二：继承



![](img/1588726897177.png)

### 1、为什么使用继承

①提高代码的复用性

②利于维护

③有了继承让类与类之间产生关系，我们可以创建更加特殊的类型（多态）



### 2、如何使用继承

​	关键字：extends   ---- “扩展” 子类是父类的扩展

​	例如： class A extends B{}

​	子类：A    父类（超类、基类、SuperClass）：B



### 3、通过继承，子类可以继承父类中所有的属性（包括私有的）和方法。

​		注意：父类中私有属性，也可以继承，只不过因为 private 修饰符的作用，子类不能直接访问

​			   若要访问需要通过公共的 get/set 方法



### 4、继承的注意

①不能为了简化代码，获取某功能而继承，若要继承两个类之间要满足一定的所属关系：is a

②Java 只支持单继承，不支持多继承。（一个父类可以有多个子类，但是一个子类只能有一个父类）

③Java 支持多层继承

```java
class A{

	void test1(){}

	void test2(){}

}

class B extends A{
    //void test1(){}

	//void test2(){}    
}

class A{
    
    void test1(){
        //111111111111
    }
    
}

class B{
    void test1(){
        //2222222222
    }
}

class C extends A, B{}
C c = new C();
c.test1();
```



## 二、方法的重写（方法的覆盖 Override）

若父类中的方法对于子类来说不适用，子类可以对父类中的方法进行重写

前提：要有继承关系

①方法名与参数列表必须相同

②子类重写方法的访问控制修饰符不能小于父类被重写方法的访问控制修饰符

③子类重写方法的返回值类型是父类被重写方法返回值类型的子类

（通常应用时，使方法签名一模一样）



【面试题】 Override 和 Overload 的区别？

方法重载（Overload）

前提：在同一个类中

①方法名必须相同

②参数列表必须不同（参数的个数、参数的类型）

注意：与返回值类型无关



## 三、super 关键字

super 使用方式与 this 几乎一模一样。

this : 使用在本类中，代表当前对象的引用

super:使用在子类中，代表父类对象的引用



super.属性

super.方法

super(……) ： 调用父类构造器

​	①当子类继承父类后，子类“所有”构造器中默认第一行第一句有一个隐式的 super()

​		super() 作用:调用父类无参构造器

​		super() 目的:子类继承父类后，继承了父类中所有的属性和方法，因此子类需要知道父类

​					是如何为对象进行初始化 	

​	②若父类中没有提供无参构造器，子类“所有”构造器必须显示调用父类中有参构造器

​		（保证在创建子类对象前先初始化父类）

​	③super() 和 this() 必须使用在当前构造器中可执行代码的首行

​		因此，super() 和 this() 二者不能同时出现



## 四、四种访问控制修饰符

private ：私有的，可用于修饰属性、方法。 只能在本类中访问

*default* : 默认的（缺省的），可用于修饰属性、方法、类。可以在本类中、本包中。

​		(注意：default 并不是访问控制修饰符的关键字，在什么都不加的情况下就是 defualt)

protected : 受保护的，可用于修饰属性、方法。 在本类中、本包中、子类中。

public ：公共的，可用于修饰属性、方法、类。在任何地方都可以访问

![](img/1588899877605.png)

## 五、面向对象的特性之三：多态

一类事物的多种表现形态。  人 - 男人 女人



### 1、多态的体现

①方法的重载与重写

②对象的多态性



### 2、对象的多态性

父类的引用指向子类的对象。

```java
Person p = new Man();//多态
p.eat();
p.sleep();

//p.smoking(); 编译不能通过
```



### 3、虚拟方法调用（动态绑定）

​	在多态的情况下，编译时：“看左边”，看的父类的引用。（而父类中没有子类特有的方法）

​				       运行时：“看右边”，看的是子类对象。（实际运行的是子类重写父类的方法）



### 4、引用数据类型之间的转换

向上转型：子类转父类。系统自动完成

向下转型：父类转子类。需要使用强转符“(需要转换的类型)”

​			可能引发 ClassCastException 异常

```java
Person p = new Man();//多态-向上转型
p.eat();
p.sleep();

Man man = (Man)p;//向下转型
man.smoking();

Woman woman = (Woman)p;//编译？YES  运行？NO！发生 CassCastException
```

Java 为上述CassCastException提供了相应的解决办法

### 5、instanceof 运算符

​	例如：

​	p instanceof Woman : 判断 p 引用指向的对象是不是 Woman 的本类类型及子类类型，若是返回 true

```java
if(p instanceof Woman){
    Woman woman = (Woman)p;
}
```



### 6、多态的应用

①多态数组：

```java
Person[] persons = new Person[3];//数组中可以存储 Person 本类类型的对象及子类类型的对象
persons[0] = new Person();
persons[1] = new Man();
persons[2] = new Woman();

for(int i = 0; i < persons.length; i++){
    persons[i].eat(); //虚拟方法调用
    persons[i].sleep();
}

for(Person p : persons){//多态
    p.eat(); //虚拟方法调用
    p.sleep();
}
```

②多态参数：

```java
//需求：展示一个男人吃饭和睡觉的功能
/*public void show(Man man){
    man.eat();
    man.sleep();
}

//需求：展示一个女人吃饭和睡觉的功能
public void show(Woman woman){
    woman.eat();
    woman.sleep();
}*/

public void show(Person p){//多态参数：可以接收Person本类类型的对象及子类类型的对象
    p.eat();//虚拟方法调用
    p.sleep();
}
```



## 六、对象的关联

简单的说，就是一个对象中使用了另一个对象

```java
class Teacher{
    
    private String name;
    private int age;
    
    private Computer computer;//对象的关联
    
    public String say(){
        return name + "," + age + "," + computer.getDetails();
    }
    
}

class Computer{
    
    public String getDetails(){
        return "我是一台高配电脑"
    }
    
}
```

## 七、java.lang.Object 类

是所有类的父类。若一个类没有显示的继承任何类时，默认 extends java.lang.Object。

java.lang 是默认包

1、既然 Obejct 类是所有类的父类，因此 Object 类中的内容是最具共性的。

2、既然 Obejct 类是所有类的父类，因此子类可以继承 Object 类中所有的方法。

3、既然 Obejct 类是所有类的父类，若 Object 类中的方法对于子类不适用，子类可以重写 Object 类中的方法



### 1、public boolean equals(Object obj)

①在 java.lang.Object 中

②作用是比较两个引用数据类型是否相等

③ Object 类中的 equals() 比较两个对象的地址值是否相等。（通过查看源码发现实际使用 == 完成的）

④若 Object 类中的 equals() 对于我们来说不适用，我们可以进行重写



### 2、“==” 运算符

①基本数据类型：比较两个基本数据类型的值是否相等。相等返回 true

②引用数据类型：比较两个引用数据类型的地址值是否相等。相等返回 true



【面试题】== 与 equals 的区别？



### 3、public String toString() 

返回当前对象的字符串变现形式

①在 java.lang.Object 类中

②若直接输出对象的引用时，默认调用 toString()

③Object 类中的 toString 返回的格式如下：

​	getClass().getName() + '@' + Integer.toHexString(hashCode())

④若 Object 类中的 toString() 对于我们来说不适用，我们可以进行重写



```java
class ObjectTest{
    public static void main(String[] args){
        Person p1 = new Person("张三", 18);
        Person p2 = new Person("张三", 18);
        
       	String str1 = new String("张三");
        String str2 = new String("张三")；
        
        System.out.println(p1.equals(p2));// false---true
        System.out.println(str1 == str2);//false
        System.out.println(str1.equals(str2));//true
        
        System.out.println(p1.toString());
        System.out.println(p1);
    }
}

class Person /*extends java.lang.Object*/{
    private String name;
    private int age;
    
    public Person(){}
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    //重写 Object 类中的 equals
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        
        if(obj instanceof Person){
            Person p = (Person)obj;
            
            if(this.name.equals(p.name) && this.age == p.age){
                return true;
            }
        }
        
        return false;
    }
    
    //重写 Object 类中的 toString()
    public String toString(){
        return "姓名：" + name + " 年龄：" + age;
    }
}
```

## 八、static 修饰符

代表静态的，可用于修饰 属性、方法、代码块、**内部类



### 1、static 修饰的属性（静态变量或类变量）

①随着类的加载而加载，随着类的消失而消失（生命周期最长）

②static 修饰的属性被所有该类的对象所共享

③一旦某个对象修改该属性值，其他对象的该属性值也会随之改变

④静态变量的存在优先于对象

⑤可以通过“类名.类变量”的方式使用



### 2、静态变量与实例变量

①内存中的位置不同

②生命周期不同



### 3、static 修饰的方法（静态方法或类方法）

①随着类的加载而加载

②静态方法的存在优先于对象

③可以通过“类名.类方法”的方式调用

④静态方法中不可以使用非静态成员，非静态方法中可以使用静态成员

⑤静态方法中不能使用 this 和 super



## 九、类的成员之一：代码块

属性、方法、构造器、代码块



### 1、非静态代码块

①格式：类中的一对 {}

②每次创建对象时执行

③非静态代码块的执行优先于对象

④用于为对象进行初始化（通常用于为构造器中的共性内容进行初始化）

⑤非静态代码块可以有多个，依次向下的顺序执行



### 2、静态代码块

①格式：static{ }

②随着类的加载而加载，并且只加载执行一次

③静态代码块的执行优先于非静态代码块

④静态代码块中不能使用非静态成员，不能使用 this 和 super

⑤静态代码块可以有多个，依次向下的顺序执行。



## 十、final 修饰符

代表最终的，可用于修饰 变量、方法、类

①final 修饰的类不能被继承

②final 修饰的方法不能被重写

③final 修饰的变量叫常量，一旦赋值，值不能改变

​		1)常量的命名规范：所有字母都大写，每个单词以"_"隔开。 如： XXX_YYY_ZZZ

​		2)**常量没有默认值，在使用前必须赋值（直接显示赋值、构造器赋值、代码块）

​			若选择构造器赋值，则保证每个构造器中都为常量赋值



# 第八章 高级类特性

## 一、抽象类

### 1、为什么使用抽象类

类用于描述现实生活中的一类事物，类中有属性有方法，方法都有方法体。

某种情况下，父类只能知道子类应该具备一个怎样的方法，但是不能明确知道子类如何实现该方法

例如：几何图形（多态练习），所有几何图形都应该具备计算面积的功能，但是不同几何图形计算面积的方式不同



Java 为上述问题提供了相应的解决办法

Java 允许父类中只是提供一个方法的声明，不提供具体的实现，具体的实现交给子类来完成

该方法称为“抽象方法”，拥有一个或多个抽象方法的类，称为“抽象类”



### 2、如何使用抽象：abstract

1）使用 abstract 修饰的类称为“抽象类”

①格式：访问控制修饰符 abstract class 类名{}

②拥有一个或多个抽象方法的类必须是抽象类

③抽象类中可以有非抽象方法，抽象类中可以没有抽象方法

④**抽象类不能创建实例

⑤抽象类中可以声明构造器。

​	目的：当子类继承父类后，继承父类中所有的属性和方法，因此子类需要知道父类如何进行初始化



2) 使用 abstract 修饰的方法称为“抽象方法”

①格式：访问控制修饰符 abstract 返回值类型 方法名(参数列表);

②子类继承父类后，若重写了父类中“所有”的抽象方法，该类是具体类，可以创建实例

③子类继承父类后，若没有重写父类中“所以”的抽象方法，该类必须是抽象类，不可以创建实例



```java
abstract class Person{
    
    private String name;
    private int age;
    
    public Person(){}
    
    public void setName(String name){
        this.name = name;
    }
    
    //人都应该具备一个说话的功能，但是不同的人说话的方式不同
    public abstract void speak();
}

class Chinese extends Person{
    
    public void speak(){
        System.out.println("中国人说汉语");
    }
    
}

abstract class American extends Person{
    //public abstract void speak();
}
```



### 3、abstract 关键字的注意

① abstract 和 final 不能同时使用

② abstract 和 static 不能同时使用

③ abstract 和 private 不能同时使用



## 二、接口

可以定义多个不相关事物的相同功能

![](img/1589160060412.png)

### 1、如何使用接口（如下以jdk1.7为标准）

①接口与类时平级的

​	关键字：interface

​	如：

​	public interface Flyer{}

②可以把接口理解为特殊的抽象类，因为jdk1.7前接口中只能定义“全局静态常量”和抽象方法

```java
//全局静态常量
int NUM = 100;//public static final 

//抽象方法
void fly();//public abstract 
```

③接口中不能有变量、构造器、代码块

④**接口不能创建实例

⑤接口就是用来被实现的

​	实现接口关键字：implements

​	如：

​	class Bird implements Flyer{}

⑥实现接口的类称为“实现类”，实现类的功能和“继承”一样的，可以继承接口中所有的成员

⑦若实现类实现了接口中所有的抽象方法，该类为具体类，可以创建实例

   若实现类没有实现接口中所有的抽象方法，该类必须是抽象类，不能创建实例

⑧接口可以多实现  ---  解决了 Java 中单继承的局限性

​	如：

​	class Bird implements Flyer, Runner{}

⑨接口不能继承任何类，接口可以继承接口并且可以多继承接口

⑩一个类可以继承另一个类，同时实现多个接口

​	如：

​	class Bird extends Animal  implements Flyer, Runner{}

​	注意：先继承，后实现



### 2、jdk1.8对于接口的升级

（Lambda表达式需要函数式接口（接口中只有一个抽象方法的接口）的支持）

①接口中的默认方法

②接口中的静态方法

```java
public class DefaultMethodTest {

    public static void main(String[] args) {
        SubClass sc = new SubClass();
        //若接口中与父类中具有相同方法签名的方法时，默认为类优先原则，接口中的默认方法会被忽略
        sc.show();

        MyInterface.test();
    }

}

interface MyInterface{

    default void show(){
        System.out.println("接口中的默认方法");
    }

    public static void test(){
        System.out.println("接口中的静态方法");
    }
}

interface MyFun{

    default  void show(){
        System.out.println("MyFun 接口中的默认方法");
    }

}

class MySuperClass{

    public void show(){
        System.out.println("父类中的方法");
    }

}

class SubClass /*extends MySuperClass*/ implements MyInterface, MyFun{
    @Override
    public void show() {
        MyFun.super.show();
    }
}
```



## 三、内部类

### 1、成员内部类

在类中声明另一个类，里面的类称为内部类，外面的类称为外部类

①是类的成员之一。（属性、方法、构造器、代码块）

②可以使用四种访问控制修饰符（public protected *default* private）

③可以使用 static 和 final

④与类具有相同的特性

```java
class Person{
    
    private String name;
    
    public Person(){
        System.out.println(name);
        setName("李四");
        Computer com = new Computer();
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    //成员内部类
    public class Computer{
        
        private String name;
        
        public Computer(){}
        
        public void setName(String name){
            System.out.println("局部变量 name:" + name);
            System.out.println("当前内部类Computer对象的 name: " + this.name);
            System.out.println("当前外部类Person对象的 name:" + Person.this.name);
            System.out.println("不需要区分使用同级别成员：" + getName());
            this.name = name;
        }   
    }
    
    //对类的隐藏
    private class Head{
        
    }
    
    //静态内部类
    static class Mobile{
        public void show(){
            System.out.println("静态内部类中的方法");
        }
    }
    
}

class InnerClassTest{
    
    public static void main(String[] args){
        //创建静态内部类对象
        Person.Mobile pm = new Person.Mobile();
        pm.show();
        
        //创建非静态内部类的对象
        Person p = new Person();
        Person.Computer pc = p.new Computer();
        pc.setName("IBM");
    }
    
}
```



### 2、局部内部类

```java
//如下方式使用较少
    public void show(){

        int num = 10;
		//局部内部类
        class Inner{

            public void test(){
                System.out.println(num);
                //注意：若局部内部类中使用了同级别的局部变量，该局部变量必须使用 final 修饰
                //jdk1.7 必须手动加 final，jdk1.8默认为 final
            }

        }

        Inner in = new Inner();

    }
```



```java
   //
    public Comparator getComparator(){
        //
        return new MyComparator();
    }

    public Comparator getComparator1(){

        //若该类仅对于当前方法有用，可以声明为局部内部类
        class MyComparator implements Comparator{

        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }

        return new MyComparator();
    }

    public Comparator getComparator2(){
        //匿名内部类
        Comparator com = new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };

        return com;
    }

    public Comparator getComparator3(){
        //
        return new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
    }
```

## 四、枚举类

是 jdk1.5 后出的特性，可以定义有限数量的可穷举数据集。

简而言之，当确定一个类有几个对象时，使用枚举



### 1、自定义枚举

①私有化构造器

②类的内部创建对象

```java
package com.atguigu.java;

/*
自定义枚举类
 */
public class Season1 {

    private String seasonName;
    private String seasonDesc;

    //2. 类的内部创建对象
    public static final Season1 SPRING = new Season1("春天", "春眠不觉晓");
    public static final Season1 SUMMER = new Season1("夏天", "夏天蚊子咬");
    public static final Season1 AUTUMN = new Season1("秋天", "秋天叶子黄");
    public static final Season1 WINTER = new Season1("冬天", "冬天雪花飘");

    //1. 私有化构造器
    private Season1(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    public void setSeasonDesc(String seasonDesc) {
        this.seasonDesc = seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}

```

### 2、使用 enum 关键字

​	valueOf(String name) : 根据枚举类对象的名称，获取枚举类对象

​	values() : 获取当前枚举类中所有的枚举类对象，组成的数组

```java
public enum Season1 {
    
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER;

}
```

### 3、枚举类实现接口

```java
public enum Season1 implements MyInterface{
    
    SPRING{
        public void show(){
            System.out.println("春天");
        }
    },
    SUMMER{
        public void show(){
            System.out.println("夏天");
        }
    },
    AUTUMN{
        public void show(){
            System.out.println("秋天");
        }
    },
    WINTER{
        public void show(){
            System.out.println("冬天");
        }
    };
    
    /*public void show(){
        System.out.println("季节");
    }*/

}
```

## 五、注解

jdk1.5后出的特性，是一个元数据，是一个代码级别的说明

​	String name = "atguigu";



### 1、JDK 内置的常用注解

​    ① @Override ：用于注解方法，说明该方法必须是重写方法
​    ② @Deprecated ：用于注解属性、方法、类。 说明已经过时
​    ③ @SuppressWarnings ：用于抑制编译器警告    

### 2、自定义注解

```java
public @interface MyAnnotation{
    
    String value() default "atguigu";

}
```

### 3、元注解

```
@Retention : 描述注解的生命周期
@Target : 描述注解可用于修饰哪些程序元素
@Documented ：随之生成说明文档，但注解的生命周期必须是 RUNTIME
@Inherited: 被它修饰的 Annotation 将具有继承性
```

# 第九章 使用基础 API

## 一、包装类（包裹类 Wrapper）

Java 针对八种基本数据类型提供了对应的包装类



基本数据类型		包装类

byte				Byte

short			      Short

int				   Integer

long				Long

float				Float

double			   Double

char				Character

boolean			  Boolean



### 1、基本数据类型与包装类之间的转换

装箱：将基本数据类型转换成对应的包装类

```java
①通过对应包装类的构造器
②通过对应包装类的静态方法 valueOf() 
```

拆箱：将包装类转换成对应的基本数据类型

```java
①通过对应包装类对象的 xxxValue()。  xxx:表示对应的基本数据类型
```

### 2、自动装箱与自动拆箱(jdk1.5后)

```java
Integer num1 = 100; //自动装箱
Integer num2 = 100;

int a = num1; //自动拆箱

System.out.println(num1 == num2);//true

Integer num3 = 130;
Integer num4 = 130;

System.out.println(num3 == num4);//false
```

注意：Integer 提供了一个小的缓存（-128~127）之间，若需要装箱的值在该取值范围内，则从缓冲中取一个对象，若需要装箱值超过该取值范围，则重新 new Integer 的实例



### 3、String 与 基本数据类型、包装类之间的转换

```java
基本数据类型、包装类 转换成 String
①String str = a + "";
②使用对应包装类的静态方法 toString()
③使用 String 类中的静态方法 valueOf()

String 转换成 基本数据类型、包装类
①通过对应包装类的构造器
②通过对应包装类的静态方法 parseXxx().  Xxx代表对应的基本数据类型。注意：没有 parseChar()
③使用对应包装类的静态方法 valueOf
```

## 二、字符串处理类 ：String

不可变的字符序列



String str1 = "abc";

String str2 = new String("abc");



str1:代表一个对象，至少在内存中开辟一块内存空间

str2:代表两个对象，至少在内存中开辟两块内存空间



![](img/1589248181339.png)



```
* 1. 获取字符串的方法：
*     ①String concat(String str)：串接字符串
*     ②String substring(int beginIndex)：获取取字符串的子串
*       String substring(int beginIndex, endIndex) : 包含头不包含尾
*     ③String toLowerCase()和String toUpperCase()：转换为小写/大写
*     ④String trim()：删除首尾空格或制表符
* 2. 搜索方法：
*     ①int indexOf(int ch) : 获取指定字符在字符串中的位置,若没有指定的字符，返回 -1
*      int indexOf(int ch, int fromIndex) : 从指定位置开始搜索
*      int indexOf(String str)
*      int indexOf(String str, int fromIndex)
*      int lastIndexOf(int ch) : 反向获取指定字符位置
* 3. 判断方法：
*      ① boolean equals(Object obj)：判断是否相等
*         boolean equalsIgnoreCase(String str)：判断是否相等,不考虑大小写
*      ② boolean contains(String str) :判断是否包含某字符串
*         ③ boolean startsWith(String str)和 boolean endsWith(String str)：判断是否以指定字符串开始/结尾
*         ④ boolean isEmpty():判断字符串是否为空
* 4. 其它方法：
*     ①length()：返回字符串长度
*     ②char charAt(int index):返回索引处的字符
*     ③将字符数组转换为字符串
*        构造器：
*             String(char[] ch)
*             String(char[] ch, offset, count) : 将数组中一部分转换为字符串，从第几个索引位置开始转，转几个
*        静态方法：
*             static String copyValueOf(char[] ch)
*             static String copyValueOf(char[] ch, offset, count)
*             static String valueOf(char[])
*      将字符串转换字符数组: char[] toCharArray()
*     ④String replace(char oldCahr, char newCahr) ： 替换字符串中字符
*       String replace(String oldStr, String oldStr)：替换字符串中字符串
*     ⑤String[] split(String r):根据指定符号切割,可以按照正则表达式进行切割
```

## 三、StringBuffer 与 StringBuilder 

可变的字符序列，二者具备兼容的 API



1、StringBuffer 与 StringBuilder 的区别？

StringBuffer : 是线程安全的，因此效率低

StringBuilder ：是线程不安全的，因此效率高



```java
* StringBuffer 和 StringBuilder 的常用方法：
*  ① StringBuffer append(String str) : 添加
*   StringBuffer insert(int offset, String str) ： 插入
*   StringBuffer replace(int start, int end, String str)：替换
*
*  ② int indexOf(String str) ：返回子串的位置索引
*   int lastIndexOf()
*
*  ③ String substring(int start, int end)：取子字符串序列
*  ④ StringBuffer delete(int start, int end)：删除一段字符串
*      StringBuffer deleteCharAt(int index):删除指定位置字符
*  ⑤ String toString()：转换为String对象
```



## 四、其他常用类

java.util.Date : 表示时间和日期

java.text.DateFormat : 用于格式化日期/时间,是一个抽象类

​	|--java.text.SimpleDateFormat : 是 DateFormat 的子类

java.time.* ：（jdk1.8的新的时间日期 API）

java.lang.Math : 用于数学运算的类

java.math.BigInteger : 用于操作任意精度的整数

java.math.BigDecimal : 用于操作任意精度的浮点数



## 第十章 异常

不可预知的非正常情况



Java 中异常都是以对象形式存在的，一旦某句代码发生异常，会在该代码处生成一个异常对象

然后以堆栈式抛出，若不对该异常对象进行处理，最终导致程序终止运行。

![](img/1589332116028.png)

## 一、异常的体系结构

java.lang.Throwable : 是所有错误和异常的父类

​	|--java.lang.Error : 错误，一些严重的错误。 如：内存溢出、系统错误等。我们不在代码中对其进行处理

​	|--java.lang.Exception: 异常，我们需要尽可能的预知并处理的异常。如：用户输入有误、网络连接失败等。

​		|--编译时异常（受检异常 checked）：编译时对其进行检查，若不处理，编译不能通过

​		|--运行时异常（非受检异常 unchecked）: 有时可以保证程序的正常运行，但是一旦某句代码发生异											 常，会在该代码处生成一个异常对象，然后以堆栈式抛出

​										         若不处理，最终导致程序终止运行。

![](img/1589333020885.png)



## 二、异常的处理

Java 中异常的处理采用的是抓抛模型

抛：若某句代码发生异常，会在该代码处生成一个异常对象，然后堆栈式抛出

抓：将上述抛出的异常对象进行捕获处理



try{

​	//可能发生异常的语句

}catch(异常类型 变量名){

​	//异常的处理语句

}catch(Exception1 e1){

​	//异常的处理语句

}catch(Exception2 e2){

​	//异常的处理语句

}

……

finally{

​	//一定执行的语句

}

注意：

​	①catch 可以有多个，一旦某个 catch 异常类型匹配成功，其他 catch 将不再执行

​	②catch 可以有多个，若catch中的异常类型具有子父类关系，则子上父下