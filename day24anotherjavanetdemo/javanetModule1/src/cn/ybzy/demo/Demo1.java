package cn.ybzy.demo;

import java.io.IOException;
import java.net.*;

public class Demo1 {
    public static void main(String[] args) {
        try {
            InetAddress ia1 = InetAddress.getByName("www.qq.com");
//           InetAddress ia1 = InetAddress.getByName("61.135.169.105");
//           InetAddress ia1 = InetAddress.getLocalHost();
            System.out.println(ia1.getHostName());
            System.out.println(ia1.getHostAddress());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }


    }
}
