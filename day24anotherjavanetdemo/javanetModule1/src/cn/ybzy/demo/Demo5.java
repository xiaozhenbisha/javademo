package cn.ybzy.demo;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.*;

public class Demo5 {
    public static void main(String[] args) throws Exception {
        String urlPath = "https://xdclass.net";
        //要提交给服务器的数据
        String param = "name="+ URLEncoder.encode("张三","UTF-8");

        //建立链接
        URL url = new URL(urlPath);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        //设置参数
        conn.setDoOutput(true);
        conn.setDoInput(true);
        //我们使用post方式提交http请求，必须死记，必须设置上面的两个设置项目
        conn.setUseCaches(false);
        conn.setRequestMethod("POST");

        //设置请求头信息
        conn.setRequestProperty("Charset","UTF-8");
        conn.setRequestProperty("Connection","Keep-Alive");
        conn.setRequestProperty("Content-Type","application/x-www-form-urlencoded");

        //获取到输出流，才能把param放到请求体
        conn.connect();
        DataOutputStream dos = new DataOutputStream(conn.getOutputStream()) ;
        dos.writeBytes(param); //这里写到输出里，只是把数据放到内存中的缓冲区里
        dos.flush();
        dos.close();

        //获取服务器响应回来的信息
        int resultCode = conn.getResponseCode();
        if(resultCode == HttpURLConnection.HTTP_OK){
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
            String line = null;
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
        }
    }
}
