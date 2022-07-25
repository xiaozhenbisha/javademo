package com.java.testarray;

/**
 * 数组的遍历：
 *
 * 普通 for 循环：
 *
 * 增强 for 循环：
 *
 * 	for(被遍历数组中元素的数据类型 变量名 : 被遍历的数组){
 *
 *        }
 *
 * 普通 for 循环与增强 for 循环的区别？
 * 增强 for 循环不擅长改变数组中元素的值
 */
public class ArrayTest3 {
    public static void main(String[] args) {
        /**
         * int[] arr = new int[]{1,2,3,4,5};
         *         for(int a : arr){
         *             if(a == 2){
         *                 a = 100;
         *             }
         *         }
         *
         *         //遍历数组
         *         for(int a : arr){
         *             System.out.println(a);
         *         }
         */


		/*for(int i = 0; i < arr.length; i++){
			int a = arr[i];
			System.out.println(a);
		}

		System.out.println("-------------------------------------");

		for(int a : arr){
			System.out.println(a);
		}

		System.out.println("-------------------------------------");

		Person[] persons = new Person[3];

		persons[0] = new Person();
		persons[1] = new Person("张三", 18);
		persons[2] = new Person("李四", 20);

		for(Person p : persons){
			System.out.println(p.say());
		}*/

        //需求：判断数组中元素的值为 2，则修改为 100
		/*for(int i = 0; i < arr.length; i++){
			if(arr[i] == 2){
				arr[i] = 100;
			}
		}*/
        System.out.println("-------------------------------------");

        Person[] persons = new Person[3];

        persons[0] = new Person();
        persons[1] = new Person("张三", 18);
        persons[2] = new Person("李四", 20);

        for(Person p : persons){
            System.out.println(p.say());
        }

    }
}
