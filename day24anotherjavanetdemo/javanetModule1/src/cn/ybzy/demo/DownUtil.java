package cn.ybzy.demo;

import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class DownUtil {
    //首先需要的东西，要知道要下载的目标文件的URL
    private String urlPath;
    //确定保存文件的位置
    private String targetFile;
    //确定下载用几条线程
    private int threadNum;
    //定义一个数组，放的是下载的线程类
    private DownThread[] threads;

    //把用于下载的线程类定义为工具里的内部类
    private class DownThread extends Thread {
        //线程类里边的具体的东西：链接上远程的文件，然后把文件划分为几块，
        //让线程分别去实现下载，一会来做
        private int startPos;
        private int currentPartSize;
        private RandomAccessFile currentPart;
        //记录每条线程已经下载下来的文件的字节数
        private int length;


        public DownThread(int startPos, int currentPartSize, RandomAccessFile currentPart) {
            this.startPos = startPos;
            this.currentPartSize = currentPartSize;
            this.currentPart = currentPart;
        }

        @Override
        public void run() {
            try {
                //真正实现下载
                //链接上目标文件
                URL url = new URL(urlPath);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection(); //是从web服务器上下载文件
                //真正去链接之前，要设置链接头部信息
                conn.setConnectTimeout(5000);
                //设置链接目标的http的方法
                conn.setRequestMethod("GET");
                //然后设置头部信息
                conn.setRequestProperty("Accept", "*/*"); //允许客户端处理所有文件
                conn.setRequestProperty("Accept-Language", "zh-CN");
                conn.setRequestProperty("Charset", "UTF-8");
                conn.setRequestProperty("Connection", "Keep-Alive");
                //前面设置这么多东西，一个目的。取得目标文件的大小
                //链接上目标
                conn.connect(); //可写，也可省略
                InputStream in = conn.getInputStream();
                //把in的指针，跳到该线程负责下载的位置
                in.skip(this.startPos);
                byte[] buffer = new byte[1024];
                int hasRead = 0;
                while(length < currentPartSize && (hasRead=in.read(buffer))!=-1){
                   currentPart.write(buffer,0,hasRead);
                   length += hasRead;
                }
                currentPart.close();
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //保存一下目标文件的大小
    private int fileSize;

    public DownUtil(String urlPath, String targetFile, int threadNum) {
        this.urlPath = urlPath;
        this.targetFile = targetFile;
        this.threadNum = threadNum;
        this.threads = new DownThread[threadNum];

    }

    //定义一个实现下载文件的方法
    public void download() throws Exception {
        //第一件事儿，获取目标文件的大小
        URL url = new URL(urlPath);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection(); //是从web服务器上下载文件
        //真正去链接之前，要设置链接头部信息
        conn.setConnectTimeout(5000);
        //设置链接目标的http的方法
        conn.setRequestMethod("GET");
        //然后设置头部信息
        conn.setRequestProperty("Accept", "*/*"); //允许客户端处理所有文件
        conn.setRequestProperty("Accept-Language", "zh-CN");
        conn.setRequestProperty("Charset", "UTF-8");
        conn.setRequestProperty("Connection", "Keep-Alive");
        //前面设置这么多东西，一个目的。取得目标文件的大小
        //链接上目标
        conn.connect(); //可写，也可省略
        fileSize = conn.getContentLength();//获取目标大小
        conn.disconnect(); //用了以后，及时关掉资源通道

        //根据文件的大小和下载线程数量，来进行目标文件的切块
        //先在本地创建一个和目标文件同大小的文件
        RandomAccessFile file = new RandomAccessFile(targetFile, "rw");
        file.setLength(fileSize);
        file.close();

        //每个线程负责下载的文件块的大小
        int currentPartSize = fileSize / threadNum + 1;

        for (int i = 0; i < threadNum; i++) {
            //设置每个线程下载的文件块的开始为值
            int startPos = i * currentPartSize;
            //让每个线程使用一个RandomAccessFile的对象来进行下载
            RandomAccessFile currentPart = new RandomAccessFile(targetFile, "rw");
            //每个线程负责下载的文件块
            currentPart.seek(startPos);
            //创建线程，真正负责下载
            threads[i] = new DownThread(startPos, currentPartSize, currentPart);
            //让线程启动，开始下载
            threads[i].start();
        }
    }

    //获取下载完成的百分比
    public double getCompleteRate(){
        //定义一个变量
        int sumSize = 0;
        for(int i=0;i<threadNum;i++){
            sumSize += threads[i].length;
        }
        return sumSize*1.0/fileSize;
    }
}
