package com.java.homework;

/**
 * 可以做一个倒计时10秒钟，提示新年快乐
 */
public class HOME3 {
    public static void main(String[] args) {
        for (int i = 10; i >0 ; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("倒计时："+i);
        }
        System.out.println("新年快乐");
    }
}
