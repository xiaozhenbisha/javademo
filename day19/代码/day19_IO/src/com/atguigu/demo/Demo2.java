package com.atguigu.demo;

import org.junit.Test;

/*
    此类用于演示 递归  类似于循环
        递归一定要避免死循环(java.lang.StackOverflowError) 栈内存溢出
        为什么栈内存会溢出？(方法会占用栈内存，方法一直入栈，而不出栈)
        方法什么时候出栈？执行return,方法就会结束，方法就会出栈
       递归一定要有出口(循环必须有出口[调用自己的方法必须有条件])


 */
public class Demo2 {

    @Test
    public void test(){
        //打印三次好好学习天天向上    while()   循环因子  设置循环条件  自增
        method(1);
    }
    public void method(int i){
        if(i<=3){
            System.out.println("好好学习天天向上"+i);
            i++;
            method(i);//调用本身是有条件的(当条件不满足时，就循环结束)
        }
        return;//默认有的
    }

}
