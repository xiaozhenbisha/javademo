package cn.ybzy.demo;

import com.sun.org.apache.regexp.internal.REUtil;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class IOTest3 {
    public static void main(String[] args) throws IOException {
        //用自己的类，创建数组输出流
        MyByteArrayOutputStream out = new MyByteArrayOutputStream();

        //默认情况下，里面存放数组的buf的长度
        System.out.println(out.getBuf().length);
        System.out.println(out.size());
        System.out.println("========");

        for(int i=0;i<32;i++){
            out.write(1);
        }
        System.out.println(out.getBuf().length);
        System.out.println(out.size());
        System.out.println("========");

        out.write(1);
        System.out.println(out.getBuf().length);
        System.out.println(out.size());
        System.out.println("========");

        out.write(new byte[98]);
        System.out.println(out.getBuf().length);
        System.out.println(out.size());

        System.out.println(Integer.MAX_VALUE);




    }
}

class MyByteArrayOutputStream extends ByteArrayOutputStream{
    public byte[] getBuf(){
        return super.buf;
    }
}
