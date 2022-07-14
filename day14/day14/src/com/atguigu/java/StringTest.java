package com.atguigu.java;

import org.junit.Test;

/*
一、java.lang.String : 不可变的字符序列

        String str1 = "abc";
        String str2 = new String("abc");
        二者的区别？

        str1:代表一个对象，至少在内存中开辟一块内存空间
        str2:代表两个对象，至少在内存中开辟两块内存空间

 * 1. 获取字符串的方法：
 * 		①String concat(String str)：串接字符串
 * 		②String substring(int beginIndex)：获取取字符串的子串
 * 		  String substring(int beginIndex, endIndex) : 包含头不包含尾
 * 		③String toLowerCase()和String toUpperCase()：转换为小写/大写
 * 		④String trim()：删除首尾空格或制表符
 * 2. 搜索方法：
 * 		①int indexOf(int ch) : 获取指定字符在字符串中的位置,若没有指定的字符，返回 -1
 * 		 int indexOf(int ch, int fromIndex) : 从指定位置开始搜索
 * 		 int indexOf(String str)
 * 		 int indexOf(String str, int fromIndex)
 * 		 int lastIndexOf(int ch) : 反向获取指定字符位置
 * 3. 判断方法：
 *  	① boolean equals(Object obj)：判断是否相等
 *  	   boolean equalsIgnoreCase(String str)：判断是否相等,不考虑大小写
 *  	② boolean contains(String str) :判断是否包含某字符串
 *	   	③ boolean startsWith(String str)和 boolean endsWith(String str)：判断是否以指定字符串开始/结尾
 *	   	④ boolean isEmpty():判断字符串是否为空
 * 4. 其它方法：
 * 		①length()：返回字符串长度
 * 		②char charAt(int index):返回索引处的字符
 * 		③将字符数组转换为字符串
 * 			构造器：
 * 				  String(char[] ch)
 * 				  String(char[] ch, offset, count) : 将数组中一部分转换为字符串，从第几个索引位置开始转，转几个
 * 			静态方法：
 * 				  static String copyValueOf(char[] ch)
 * 				  static String copyValueOf(char[] ch, offset, count)
 * 				  static String valueOf(char[])
 * 		 将字符串转换字符数组: char[] toCharArray()
 * 		④String replace(char oldCahr, char newCahr) ： 替换字符串中字符
 * 		  String replace(String oldStr, String oldStr)：替换字符串中字符串
 *		⑤String[] split(String r):根据指定符号切割,可以按照正则表达式进行切割
 */
public class StringTest {

    @Test
    public void test8(){
        String str = "abcd,ef,fdfd,dfd";
        String str2 = str.replace('b', 'B');
        System.out.println(str2);

        System.out.println(str.replace("bc", "BDBDBDBD"));

        String[] strs = str.split(",");

        for (String s : strs) {
            System.out.println(s);
        }

    }


    //将字符串转换字符数组
    @Test
    public void test7(){
        String str = "abcdef";

        char[] chs = str.toCharArray();

        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }
    }
    

    //将字符数组转换为字符串
    @Test
    public void test6(){
        char[] chs = {'a', 'b', 'c', 'd', 'e'};

        String str = new String(chs);
        System.out.println(str);

        String str2 = new String(chs, 1, 2);
        System.out.println(str2);

        System.out.println("---------------------------------");

        String str3 = String.copyValueOf(chs, 1, 3);
        System.out.println(str3);

        System.out.println("---------------------------------");

        String str4 = String.valueOf(chs, 0, chs.length);
        System.out.println(str4);
    }


    @Test
    public void test5(){
        String str = "abcdef";

        System.out.println(str.length());

        char ch = str.charAt(3);
        System.out.println(ch);
    }
    
    @Test
    public void test4(){
        String str1 = "abcdef";
        String str2 = "abcDef";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        System.out.println(str1.contains("cde"));
        System.out.println("是否以abc开头：" + str1.startsWith("abc"));
        System.out.println("是否以def结尾：" + str1.endsWith("def"));

        String str3 = "";
        System.out.println(str3.isEmpty());
    }


    @Test
    public void test3(){
        String str = "abcdefababab";
        int index = str.indexOf('p');
        System.out.println(index);

        index = str.indexOf('b', 2);
        System.out.println(index);

        index = str.indexOf("ab", 3);
        System.out.println(index);

        System.out.println(str.lastIndexOf("ab"));
    }

    @Test
    public void test2(){
        String str1 = "   aBc";
        String str2 = "dEf\t\t\t";

        String str3 = str1.concat(str2);
        System.out.println(str3); //abcdef

        String str4 = str3.substring(2);
        System.out.println(str4);

        String str5 = str3.substring(2, 5);
        System.out.println(str5);

        String str6 = str3.toLowerCase();
        String str7 = str3.toUpperCase();
        System.out.println(str6);
        System.out.println(str7);

        String str8 = str3.trim();
        System.out.println(str8);
    }

    @Test
    public void test1(){
        String str1 = "abc";
        String str2 = new String("abc");
        String str3 = new String("abc");

        String str4 = "abc";

        System.out.println(str1 == str2); //false

        System.out.println(str1 == str4); //true

        String str5 = "def";
        String str6 = "ddd";

        String str7 = str4 + str5 + str6;
    }

}
