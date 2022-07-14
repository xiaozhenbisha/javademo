package com.atguigu.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) throws Exception {
        //1. 创建一个输入流(读文件)   字符缓冲输入流(readLine())   String
        BufferedReader in=new BufferedReader(new FileReader("d:/iotest/java.txt"));
        //计算得到的结果怎么存储
        Map<String,Integer> map=new HashMap<>();
        //2. 将文件中的数据全读出
        String line=null;
        while((line=in.readLine())!=null){//没循环一次就会得到一行数据
            String[] words=line.split(" ");
            //每个单词出现了多少次，拿出一个单词将作为key值去map中查找
            for(String word:words){
                Integer num=map.get(word);
                //1. 查到了 (说明之前是出现过此单词)
                //2. 查不到(说明之前没有出现过次单词)
                if(num==null){
                    //没有查到  word单词是第一次出现
                    num=1;
                }else{
                    //找到了，word不是第一次出现，取出其次数自增1
                    num++;
                }
                map.put(word,num);
            }
        }
        //3. 资源的关闭
        in.close();
        System.out.println(map);
    }
}
