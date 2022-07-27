package com.java.stringbuffertest;

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
