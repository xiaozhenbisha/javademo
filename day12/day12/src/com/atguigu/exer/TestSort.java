package com.atguigu.exer;

public class TestSort {

    public static void main(String[] args) {
        Sortable[] a = new Sortable[5];
        a[0] = new Student(99);
        a[1] = new Rectangle(1.1, 2.2);
        a[2] = new Student(88);
        a[3] = new Rectangle(0.1, 0.2);
        a[4] = new Student(89);

        Sort.selectSort(a);

        for (Sortable sortable : a) {
            System.out.println(sortable);
        }
    }

}
