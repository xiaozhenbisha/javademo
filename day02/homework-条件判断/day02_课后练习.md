# day02_课后练习

# 编程题

## 第一题

语法点：变量，运算符，if...else

案例：从键盘输入一个整数，判断它是奇数还是偶数（这里把0归为偶数）

![1557990838327](imgs/1557990838327.png)

开发提示：

​	键盘输入需要用到Scanner类。

```java
java.util.Scanner input = new java.util.Scanner(System.in);//准备从键盘输入的扫描仪
int num = input.nextInt();//输入整数
```

​	能够被2整除的是偶数，不能被2整除的是奇数

## 第二题

语法点：变量，运算符，if...else

案例：从键盘输入一个字符，判断它是字母还是数字，还是其他字符

![1557991405648](imgs/1557991405648.png)

开发提示：

​	键盘输入需要用到Scanner类。

```java
java.util.Scanner input = new java.util.Scanner(System.in);//准备接收从键盘输入的扫描仪
char c = input.next().charAt(0);//输入单个字符
```

​	数字范围：'0'-'9'

​	字母范围：'A'-'Z'，'a'-'z'





## 第三题

* 语法点：变量，运算符，if...else

* 按步骤编写代码，效果如图所示：

  ![1557999671932](imgs/1557999671932.png)

* 编写步骤：

  1. 定义类 Test2
  2. 定义 main方法
  3. 定义变量折扣 discount，初始化为1, 总价totalPrice的值从键盘输入
  4. 判断当`totalPrice >=500` ,discount赋值为0.5
  5. 判断当`totalPrice >=400` 且`<500`时,discount赋值为0.6
  6. 判断当`totalPrice >=300` 且`<400`时,discount赋值为0.7
  7. 判断当`totalPrice >=200` 且`<300`时,discount赋值为0.8
  8. 判断当`totalPrice >=0` 且`<200`时,discount赋值为1
  9. 判断当`totalPrice<0`时，显示输入有误
  10. 输出结果

* 开发提示：

  键盘输入需要用到Scanner类。

  ```java
  java.util.Scanner input = new java.util.Scanner(System.in);//准备接收从键盘输入的扫描仪
  double totalPrice = input.nextDouble();//输入double值
  ```

  ​	

## 第四题

语法点：变量，运算符，if...else

案例：从键盘输入生日，判断星座

![1558000803855](imgs/1558000803855.png)

* 开发提示：
  1. 各个星座的日期范围如下：

![1558000604568](imgs/1558000604568.png)

