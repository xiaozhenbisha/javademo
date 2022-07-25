package com.java.testarray;

public class ArrayTest4 {
    public static void main(String[] args) {

        char[] letters = new char[36];

		/*letters[0] = (char)('A' + 0);
		letters[1] = (char)('A' + 1);
		letters[2] = (char)('A' + 2);*/

        for(int i = 0; i < letters.length; i++){
            if(i < 26){
                letters[i] = (char)('A' + i);
            }else{
                letters[i] = (char)('0' + i - 26);
            }
        }

        //数组的遍历
        for(int i = 0; i < letters.length; i++){
            System.out.print(letters[i]);
        }
    }
}
