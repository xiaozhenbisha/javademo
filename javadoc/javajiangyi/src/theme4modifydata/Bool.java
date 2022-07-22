package theme4modifydata;

import java.util.Random;

public class Bool {
    public static void main(String[] args) { //生成随机数
        Random rand = new Random();
        int i = rand.nextInt() % 100;
        int j = rand.nextInt() % 100;
        System.out.println ("i = " + i);
        System.out.println ("j = " + j);
        System.out.println ("i > j 为 " + (i > j));
        System.out.println ("i < j 为 " + (i < j));
        System.out.println ("i >= j 为 " + (i >= j));
        System.out.println ("i <= j 为 " + (i <= j));
        System.out.println ("i == j 为 " + (i == j));
        System.out.println ("i != j 为 " + (i != j));
        System.out.println ("(i < 10) && (j < 10) 为 " + ((i < 10) && (j < 10)) );
        System.out.println ("(i < 10) || (j < 10) 为 " + ((i < 10) || (j < 10)) );
    }
}
