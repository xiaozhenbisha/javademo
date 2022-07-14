package com.atguigu.java;

import org.junit.Test;

/*
一、StringBuffer 与 StringBuilder ： 可变的字符序列. 二者具有兼容的 API

StringBuffer ： 是线程安全的，因此效率低
StringBuilder ： 是线程不安全的，因此效率高

 * StringBuffer 和 StringBuilder 的常用方法：
 * 	① StringBuffer append(String str) : 添加
 * 	 StringBuffer insert(int offset, String str) ： 插入
 * 	 StringBuffer replace(int start, int end, String str)：替换
 *
 *  ② int indexOf(String str) ：返回子串的位置索引
 * 	 int lastIndexOf()
 *
 *  ③ String substring(int start, int end)：取子字符串序列
 *  ④ StringBuffer delete(int start, int end)：删除一段字符串
 *      StringBuffer deleteCharAt(int index):删除指定位置字符
 *  ⑤ String toString()：转换为String对象
 */
public class StringBufferTest {

    public static void main(String[] args) {
        String text = "";
        long startTime = 0L;
        long endTime = 0L;

        StringBuffer buffer = new StringBuffer("");
        StringBuilder builder = new StringBuilder("");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer的执行时间：" + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder的执行时间：" + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            text = text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String的执行时间：" + (endTime - startTime));
    }

    @Test
    public void test1() {
        StringBuffer sb = new StringBuffer("abcdef");
        sb.append("ddd").append(15.6f).append(true).append(123);
        System.out.println(sb);

        sb.insert(2, "DDDDD");
        System.out.println(sb);

        sb.replace(2, 7, "AAA");
        System.out.println(sb);

        int index = sb.indexOf("AAA");
        System.out.println(index);
        System.out.println(sb.lastIndexOf("AAA", 10));

        String newStr = sb.substring(2, 5);
        System.out.println(newStr);

        sb.delete(2, 5);
        System.out.println(sb);

        sb.deleteCharAt(2);
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str);
    }


}
