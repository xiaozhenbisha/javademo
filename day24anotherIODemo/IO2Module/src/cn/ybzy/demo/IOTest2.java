package cn.ybzy.demo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOTest2 {
    public static void main(String[] args) throws IOException {
        //验证我们，demo我们前面讲的理论，数据流
        //数组输入流
        //先定义一个数组
//        byte[] b1 = new byte[]{1,2,3,4};
//        //可以b1数组，转换形式为 输入流
//        ByteArrayInputStream bais = new ByteArrayInputStream(b1);
//        //上面一句话就转换
//
//        //显示输入流中的剩余的数组数量
//        System.out.println(bais.available());
//
//        //能放，也要能收
//        byte[] b2 = new byte[2];
//        bais.read(b2);
//        System.out.println(Arrays.toString(b2));
//        System.out.println("读取1次以后，输入流里剩下的数据量：" + bais.available());
//
//        bais.read(b2);
//        System.out.println(Arrays.toString(b2));
//        System.out.println("读取2次以后，输入流里剩下的数据量：" + bais.available());
//
//        bais.read(b2);
//        System.out.println(Arrays.toString(b2));
//        System.out.println("读取3次以后，输入流里剩下的数据量：" + bais.available());


        byte[] b1 = new byte[]{1,2,3,4};
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(b1);

        byte[] b2 = baos.toByteArray();
        System.out.println(Arrays.toString(b2));

        System.out.println(baos.toString());

        //FileOutputStream fos = new FileOutputStream("D:\\a.txt");
        //baos.writeTo(fos);

    }
}
