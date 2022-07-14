package com.atguigu.exer;

/*
编写程序，在main方法中接收参数字符串”      abcdjklnmuxwxyz     ”，打印字符串长度；
删除字符串开始和结尾处的空白，以获得新字符串，并打印输出新串的长度；
判断新字符串是否以“abc”开头，是否以“xyz”结尾，打印判断结果；
获取该新串第3位至第6位间的子串，将其转换为大写并打印；
查找该新串是否包含“lnm ”子串，并打印子串在字符串中的位置。

 */
public class StringExer1 {

    public static void main(String[] args) {
        String str = args[0];
        System.out.println("字符串长度：" + str.length());

        String newStr = str.trim();
        System.out.println("新串的长度：" + newStr.length());

        System.out.println("是否以abc开头："+ newStr.startsWith("abc"));
        System.out.println("是否以xyz结尾：" + newStr.endsWith("xyz"));

        String newString2 = newStr.substring(3, 6);
        System.out.println("截取子串：" + newString2);
        System.out.println("转换大写:" + newString2.toUpperCase());

        System.out.println("是否包含lnm:" + newStr.contains("lnm"));
        System.out.println("lnm在字符串中的位置: " + newStr.indexOf("lnm") );
    }

}
