package cn.ybzy.demo;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Demo2 {
    public static void main(String[] args) {
        try {
            String urlEncode = URLEncoder.encode("春节","UTF-8");
            System.out.println(urlEncode);

            String urlDecode = "%E6%98%A5%E8%8A%82";
            System.out.println(URLDecoder.decode(urlDecode,"UTF-8"));


        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
