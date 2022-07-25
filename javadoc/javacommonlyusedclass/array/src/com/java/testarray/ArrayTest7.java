package com.java.testarray;

public class ArrayTest7 {
    public static void main(String[] args) {
        //1. 声明一个二维数组
        int[][] arr;

        //2. 为二维数组进行初始化
        //静态初始化：初始化操作和赋值操作同时进行
        arr = new int[][]{ {1,2,3}, {4,5,6}, {7,8} };


        //动态初始化：初始化操作和赋值操作分开进行
        //方式一：
        //arr = new int[5][6];//{ {0,11,0,0,0,0},{0,0,0,0,0,0},{0,0,66,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0} }
        arr[0][1] = 11;
        arr[2][1] = 66;

        //方式二：
		/*arr = new int[5][];//{ null, {0, 0}, {0,11,0}, null, null }
		arr[1] = new int[2];

		arr[2] = new int[3];
		arr[2][1] = 11;*/

        //3. 普通 for 循环二维数组的遍历
        for(int i = 0; i < arr.length; i++){
            int[] as = arr[i];

            for(int j = 0; j < as.length; j++){
                System.out.print(as[j] + "\t");
            }

            System.out.println();
        }

        System.out.println("------------------------------------------");

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }

            System.out.println();
        }

        System.out.println("------------------------------------------");

        //4. 增强 for 循环遍历二维数组

        for(int[] as : arr){
            for(int a : as){
                System.out.print(a + "\t");
            }
            System.out.println();
        }


        //多维数组
        //int[][][] array;

        //6.
        /**
         * int a, b;
         *         int a;
         *         int b;
         *
         *         int arr[];
         *
         *         int[] a, b[];
         *
         *         int[] a;
         *         int[] b[];
         */

    }
}
