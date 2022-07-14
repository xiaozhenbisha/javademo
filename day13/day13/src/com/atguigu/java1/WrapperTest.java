package com.atguigu.java1;

import org.junit.Test;

/*
一、包装类（包裹类 Wrapper）

Java 针对八种基本数据类型提供了对应的包装类

基本数据类型      包装类
byte              Byte
short             Short
int               Integer
long              Long
float             Float
double            Double
char              Character
boolean           Boolean

1、基本数据类型与包装类之间的转换
装箱：将基本数据类型转换成对应的包装类
①通过对应包装类的构造器
②通过对应包装类的静态方法 valueOf() 

拆箱：将包装类转换成对应的基本数据类型
①通过对应包装类对象的 xxxValue()。  xxx:表示对应的基本数据类型

2、自动装箱与自动拆箱（jdk1.5后）

3、包装类对象的注意：
【面试题】
注意：Integer类提供了一个小的缓存（-128~127）之间，若需要装箱的值在该取值范围内，
     则从缓存中取一个 Integer 实例，若超出该取值范围，则重新 new Integer 的实例

4、基本数据类型、包装类 与 String 之间的转换
基本数据类型、包装类 转换成 String
①String str = a + "";
②使用对应包装类的静态方法 toString()
③使用 String 类中的静态方法 valueOf()

String 转换成 基本数据类型、包装类
①通过对应包装类的构造器
②通过对应包装类的静态方法 parseXxx().  Xxx代表对应的基本数据类型。注意：没有 parseChar()
③使用对应包装类的静态方法 valueOf
 */
public class WrapperTest {
    //String 转换成 基本数据类型、包装类3
    @Test
    public void test9(){
        String str = "123";
        Integer n = Integer.valueOf(str);
        System.out.println(n);

        String str2 = "15.5f";
        Float f2 = Float.valueOf(str2);
        System.out.println(f2);
    }
    
    
    //String 转换成 基本数据类型、包装类2
    @Test
    public void test8(){
        String str1 = "123";
        int n = Integer.parseInt(str1);
        System.out.println(n);

        System.out.println("--------------------------");

        String str2 = "15.6f";
        float f = Float.parseFloat(str2);
        System.out.println(f);

        System.out.println("--------------------------");

        String str3 = "22.22";
        double d1 = Double.parseDouble(str3);
        System.out.println(d1);
    }
    
    
    //String 转换成 基本数据类型、包装类
    @Test
    public void test7(){
        String str = "123";
        Integer num = new Integer(str);
        System.out.println(num);

        System.out.println("--------------------------");
        String str1 = "15.6f";
        Float f = new Float(str1);
        System.out.println(f);

        System.out.println("--------------------------");
        String str2 = "a;lkdjflkajdskfj";
        Boolean b = new Boolean(str2); //转换的除了 true 其余都为 false
        System.out.println(b);
    }


    //基本数据类型、包装类 转换成 String
    @Test
    public void test6(){
        int a = 100;
        String str = a + "";
        System.out.println(str);

        System.out.println("----------------------------");

        String str2 = Integer.toString(a);
        System.out.println(str2);

        System.out.println("----------------------------");

        float f1 = 15.6f;
        String str3 = Float.toString(f1);
        System.out.println(str3);

        System.out.println("----------------------------");
        boolean b = false;
        String str4 = Boolean.toString(b);
        System.out.println(str4);

        System.out.println("----------------------------");
        String str5 = String.valueOf(a);
        System.out.println(str5);

    }


    //缓存演示
    @Test
    public void test5(){
        Integer num1 = 100;
        Integer num2 = 100;

        System.out.println(num1 == num2); //true


        Integer num3 = 130;
        Integer num4 = 130;

        System.out.println(num3 == num4);//false
    }


    //自动装箱与自动拆箱
    @Test
    public void test4(){
        Integer num = 100; //自动装箱
        int a = num; //自动拆箱
    }


    //拆箱
    @Test
    public void test3(){
        int a = 100;
        Integer num = new Integer(a);//装箱
        int a1 = num.intValue(); //拆箱
        System.out.println(a1);

        System.out.println("--------------------------------");

        Float f1 = new Float(15.6f);//装箱
        float f2 = f1.floatValue();//拆箱
        System.out.println(f2);


        System.out.println("--------------------------------");
        Character ch = new Character('a');
        char ch2 = ch.charValue();
    }
    

    //装箱2
    @Test
    public void test2(){
        int a = 100;
        Integer num = Integer.valueOf(a);
        System.out.println(num);

        System.out.println("----------------------------");

        double d1 = 15.6;
        Double d2 = Double.valueOf(d1);
        System.out.println(d2);

        System.out.println("----------------------------");
        char ch = 'A';
        Character c2 = Character.valueOf(ch);
        System.out.println(c2);
    }

    //装箱1
    @Test
    public void test1(){
        int a = 100;
        Integer num = new Integer(a);
        System.out.println(num);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.toHexString(a));
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toOctalString(a));

        System.out.println("-------------------------------------------------");

        float f1 = 15.6f;
        Float f2 = new Float(f1);
        System.out.println(f2);

        boolean flag = true;
        Boolean b1 = new Boolean(flag);
        System.out.println(b1);

    }

}
