package com.atguigu.review;

public class ReviewTest {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "def";

        String str3 = "abc" + "def";//"abcdef"
        String str4 = (str1 + str2).intern();

        String str5 = "abc" + "def";//

        System.out.println(str3 == str4); //false
        System.out.println(str3 == str5);
    }

}
