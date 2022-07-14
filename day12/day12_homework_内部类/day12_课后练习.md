# 代码阅读题

## 第1题

```java
interface A{
	int x = 0;
}
class B{
	int x = 1;
}
class C extends B implements A{
	public void printX(){
		System.out.println(x);
	}
	public static void main(String[] args) {
		new C().printX();
	}
}
```

## 第2题

```java
public class Test10 {
    public static void main(String[] args) {
        Out.In in = new Out().new In();
        in.print();
    }
}
class Out {
    private int age = 12;
    class In {
        private int age = 13;
        public void print() {
            int age = 14;
            System.out.println("局部变量：" + age);
            System.out.println("内部类变量：" + this.age);
            System.out.println("外部类变量：" + Out.this.age);
        }
    }
}
```

## 第3题

```java
package com.atguigu.test11;

public class Test11 {
	public static void main(String[] args) {
        Out out = new Out();
        out.Print(3);
    }
}
class Out {
    private int age = 12;
    public void Print(final int x) {
        class In {
            public void inPrint() {
                System.out.println(x);
                System.out.println(age);
            }
        }
        new In().inPrint();
    }
}
```

# 内部类编程题

## 第4题

编写一个匿名内部类，它继承Object，并在匿名内部类中，声明一个方法public void test()打印尚硅谷。

请编写代码调用这个方法。

## 第5题

案例：将第4题，改用匿名内部类实现实现接口，来代替CompareBig和CompareColor

## 第6题

案例：将第5题，改用匿名内部类实现接口，来代替V1Filter、V2Filter、AFilter

## 第7题

案例：

​	1、声明一个接口：Selector，包含抽象方法：

​	（1）boolean hasNext()

​	（2）Object next()

​	2、声明一个接口：Touchable，包含抽象方法：

​	（1）Selector select()

​	3、声明一个MyArrayList类，当做容器类使用，模拟动态数组数据结构的容器

​	（1）包含私有属性：

​	①Object[] all；用于保存对象，初始化长度为2

​	②int total；记录实际存储的对象个数

​	（2）包含方法：

​	①public void add(Object element)：用于添加一个元素到当前容器中，如果数组all已满，就扩容为原来的2倍

​	②public void remove(int index)：如果index<0或index>=total就打印“没有这个元素”并返回，否则删除index位置的元素

​	③public void set(int index, Object value)：如果index<0或index>=total就打印“没有这个元素”并返回，否则就替换index位置的元素为value

​	④public Object get(int index)：如果index<0或index>=total就打印“没有这个元素”并返回null，否则返回index位置的元素

​	⑤让类MyArrayList实现Touchable接口，并重写Selector select()方法，返回内部类MySelector的对象

​	⑥在类MyArrayList中声明private的内部类MySelector，实现Selector接口

​	A：在内部类MySelector声明一个属性：int cursor（游标）

​	B：MySelector实现Selector接口，并重写两个抽象方法，其中

* ​		boolean hasNext()实现为：return cursor != total
* ​		Object next()实现为：return all[cursor++]

4、在测试类Test06_01中，

（1）创建MyArrayList的对象list

（2）调用list的add方法，添加3个对象

（3）调用list的remove方法，删除[1]的对象

（4）调用list的set方法，替换[1]的对象

（5）调用list的get方法，获取[1]的对象

（6）调用list的select方法，获取Selector的对象，并调用hasNext()和next()遍历容器中所有的对象

5、在测试类Test06_02中，

（1）声明静态的MyArrayList类型的list类变量，

（2）声明public static void init()方法，

​	①在方法中创建MyArrayList类型对象，

​	②并调用list的add()方法，添加3个对象，

​	③并在init()方法上标记JUnit4的@BeforeClass注解

（3）声明public void before()方法，

​	①打印“该测试方法开始前list中的数据如下："

​	②调用list的select方法，获取Selector的对象，并调用hasNext()和next()遍历容器中所有的对象

​	③并在before()方法上标记JUnit4的@Before的注解

（4）声明public void after()方法，

​	①打印“该测试方法结束后list中的数据如下："

​	②调用list的select方法，获取Selector的对象，并调用hasNext()和next()遍历容器中所有的对象

​	③并在after()方法上标记JUnit4的@After的注解

（5）声明public void testAdd()方法，

​	①在方法中，打印“现在测试的是testAdd()方法"

​	②在方法中，再次调用list的add()方法往list容器对象中添加1个对象

​	③并在testAdd()方法上标记JUnit4的@Test的注解

（6）声明public void testRemove()方法，

​	①在方法中，打印“现在测试的是testRemove()方法"

​	②调用list的remove方法，删除[1]的对象

​	③并在testRemove()方法上标记JUnit4的@Test的注解

（7）声明public void testSet()方法

​	①在方法中，打印“现在测试的是testSet()方法"

​	②调用list的set方法，替换[1]的对象

​	③并在testSet()方法上标记JUnit4的@Test的注解

（8）声明public void testGet()方法

​	①在方法中，打印“现在测试的是testGet()方法"

​	②调用list的get方法，获取[1]的对象，并打印

​	③并在testGet()方法上标记JUni



