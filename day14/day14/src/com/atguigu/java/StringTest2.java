package com.atguigu.java;

import java.util.Arrays;

/*
模拟一个trim方法，去除字符串两端的空格。

将一个字符串进行反转。将字符串中指定部分进行反转。比如将“abcdefg”反转为”abfedcg”

获取一个字符串在另一个字符串中出现的次数。
      比如：获取“ ab”在 “abkkcadkabkebfkabkskab”
      中出现的次数

4.获取两个字符串中最大相同子串。比如：
   str1 = "abcwerthelloyuiodef“;str2 = "cvhellobnm"
   提示：将短的那个串进行长度依次递减的子串与较长
   的串比较。

5.对字符串中字符进行自然顺序排序。
提示：
1）字符串变成字符数组。
2）对数组排序，选择，冒泡，Arrays.sort();
3）将排序后的数组变成字符串。

 */
public class StringTest2 {

    public static void main(String[] args) {

        System.out.println(myTrim("     "));
        System.out.println(revString("abcdefg", 2, 5));
        System.out.println(getCount("aba", "abkkcadkabkebfkabkskababab"));
        System.out.println(maxStr("abcwerthelloyuiodef", "cvhellobnm"));
        System.out.println(sort("defacb"));

    }

    public static String sort(String str){
        char[] chs = str.toCharArray();

        Arrays.sort(chs);

        return new String(chs);
    }

    public static String maxStr(String str1, String str2){
        String maxStr = str1.length() > str2.length() ? str1 : str2;
        String minStr = str1.length() > str2.length() ? str2 : str1;

        int minLength = minStr.length();

        for(int i = 0; i < minLength; i++){//外层循环控制比较多少轮
            for(int x = 0, y = minLength - i; y <= minLength ; x++, y++){
                String newStr = minStr.substring(x, y);

                if(maxStr.contains(newStr)){
                    return newStr;
                }
            }
        }

        return null;
    }


    public static int getCount(String str1, String str2){
        int count = 0;
        int index = 0;
        while((index = str2.indexOf(str1, index)) != -1){
            count++;
            index += 1;
        }

        return count;
    }

    public static String revString(String str, int start, int end){
        char[] chs = str.toCharArray();

        for(int i = start, j = end; i < j; i++, j--){
            char c = chs[i];
            chs[i] = chs[j];
            chs[j] = c;
        }

        return new String(chs);
    }

    //   abcdef
    public static String myTrim(String str){
        char[] chs = str.toCharArray();

        int start = 0;
        int end = chs.length - 1;
        while(end >= start && chs[start] == ' '){
            start++;
        }

        while(end >= start && chs[end] == ' '){
            end--;
        }

        String newStr = str.substring(start, end+1);
        return newStr;
    }
}
