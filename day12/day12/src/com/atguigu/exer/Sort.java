package com.atguigu.exer;

public class Sort {

    public static void selectSort(Sortable[] a){//{new Student(), new Rectangle(), new Student()}

        for (int i = 0; i < a.length - 1; i++) {//外层循环控制比较多少轮
            for (int j = i + 1; j < a.length; j++) {//内层循环控制每轮比较多少次
                if(a[i].compare(a[j]) == -1){
                    Sortable s = a[i];
                    a[i] = a[j];
                    a[j] = s;
                }
            }
        }

    }

}
