package com.java.stringbuffertest;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * 一、
 * java.util.Date : 表示特定瞬间，精确到毫秒
 *
 * java.text.DateFormat : 用于格式化时间/日期，但是DateFormat 是一个抽象类
 *     |--java.text.SimpleDateFormat : 是 DateFormat 的子类
 *
 * java.time.* : jdk1.8提供的时间日期 API
 *
 * java.lang.Math : 用于数学运算的类
 *     double ceil(double d) : 返回不小于d的最小整数
 *  	double floor(double d): 返回不大于d的最大整数
 *  	int round(float f) : 返回最接近f的int型（四舍五入）
 *  	long round(double d):返回最接近d的long型
 *  	double abs(double d):
 *  	double max(double d1, double d2) : 返回较大值
 *  	int min(int i1, int i2) :　返回较小值
 *
 *  	double random() : 返回一个大于等于0.0并且小于1.0的随机数
 *
 * java.math.BigInteger : 支持任意精度的整数
 * java.math.BigDecimal : 支持任意精度的浮点数
 */

public class OtherTest {
    @Test
    public void testBigInteger(){
        BigInteger bi = new BigInteger("12433241123");
        BigDecimal bd = new BigDecimal("12435.351");
        BigDecimal bd2 = new BigDecimal("11");
        System.out.println(bi);

        System.out.println(bd.divide(bd2,BigDecimal.ROUND_HALF_UP));
        System.out.println(bd.divide(bd2,15,BigDecimal.ROUND_HALF_UP));
    }


    @Test
    public void test5(){
        double d1 = Math.random();
        System.out.println(d1);

        //需求：产生一个1-100以内的随机数
        for(int i = 0; i < 6; i++){
            int num = (int)(Math.random() * 36 + 1);
            System.out.println(num);
        }
    }

    @Test
    public void test4(){
        System.out.println(Math.ceil(15.6));
        System.out.println(Math.floor(15.6));
        System.out.println(Math.round(15.6));
        System.out.println(Math.abs(15));
        System.out.println(Math.max(15, 16));
        System.out.println(Math.min(15, 16));
    }

    //jdk1.8的时间日期API
    @Test
    public void test3(){
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDateTime ldt2 = LocalDateTime.of(2016, 10, 10, 11, 11, 11);
        System.out.println(ldt2);

        System.out.println("--------------------------");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss E");
        String strDate = ldt.format(dtf);
        System.out.println(strDate);
    }

    @Test
    public void test2() throws ParseException {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
        String strDate = sdf.format(date);
        System.out.println(strDate);

        Date newDate = sdf.parse(strDate);
        System.out.println(newDate);
    }

    @Test
    public void test1(){
        Date date = new Date();
        System.out.println(date);

        long mill = date.getTime();
        System.out.println(mill);

        Date newDate = new Date(mill);
        System.out.println(newDate);
    }
}
