package com.java.extendstest2;

public class BubbleTest {
    public static void main(String[] args) {
        int[] arr = {10, 100, -9, 22, 0};

        for (int i = 0; i < arr.length - 1; i++) {//外层循环控制比较多少轮
            for (int j = 0; j < arr.length - 1 - i; j++) { //内层循环控制每轮比较多少次
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
