package cn.ybzy.demo;

import java.io.File;
import java.io.IOException;

public class IOTest2 {
    public static void main(String[] args) {
      System.out.println(File.pathSeparator);
      System.out.println(File.pathSeparatorChar);

      System.out.println(File.separator);
      System.out.println(File.separatorChar);

      File file = new File("D:"+File.separator+"a.txt");

      //File file = new File("D:\\abc\\ccc","ccc.txt");
      try {
          file.createNewFile();
            //file.mkdir();
      } catch (Exception e) {
          e.printStackTrace();
      }
      System.out.println(file.getAbsolutePath());



    }
}
