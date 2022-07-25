package com.java.testarray;

/**
 * 使用简单数组
 * (1)创建一个名为TestArray的类，在main()方法中声明array1和array2两个变量，
 * 他们是int[]类型的数组。
 * (2)使用大括号{}，把array1初始化为8个素数：2,3,5,7,11,13,17,19。
 * (3)显示array1的内容。
 * (4)赋值array2变量等于array1，修改array2中的偶索引元素，使其等于索引值
 * (如array[0]=0,array[2]=2)。打印出array1。
 */
public class ArrayTest11 {
    public static void main(String[] args) {
        //int[] arr = new int[]{1,2,3,4,5};
        //int[] arr;
        //arr = new int[]{1,2,3,4,5};

        //int[] arr = {1,2,3,4,5};
		/*
		错误的语法格式
		int[] arr;
		arr = {1,2,3,4,5};*/

        int[] array1 = {2,3,5,7,11,13,17,19};
        int[] array2;

        for(int a : array1){
            System.out.print(a + "\t");
        }

        System.out.println();
        System.out.println("--------------------------");

        //传递的地址值
        array2 = array1;

        for(int i = 0; i < array2.length; i++){
            if(i % 2 == 0){
                array2[i] = i;
            }
        }

        System.out.println("--------------------------");

        for(int a : array1){
            System.out.print(a + "\t");
        }

        System.out.println();

        for(int a : array2){
            System.out.print(a + "\t");
        }
    }
}
