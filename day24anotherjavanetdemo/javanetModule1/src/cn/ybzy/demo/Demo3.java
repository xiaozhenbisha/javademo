package cn.ybzy.demo;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Demo3 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://14.215.177.39/");
            System.out.println(url.getProtocol());
            System.out.println(url.getPort());
            System.out.println(url.getHost());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            //正式和http://14.215.177.39/对应的服务器链接TCP链接
            conn.connect();

            InputStream in = conn.getInputStream(); //这个方法，就会向http://14.215.177.39/对应的服务器
            //发送，http请求，服务器收到这个请求后，会给我们一个http响应，响应包含：头，正文
            //正文部分，就包含在getInputStream方法，返回的in当中

            //把in中的字符，打印出来，给你们看看
            byte[] buffer = new byte[1024];
            int hasRead = 0;
            while((hasRead=in.read(buffer))!=-1){
                System.out.println(new String(buffer,0,hasRead));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
