package com.java.exceptiontest.javaexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 一、异常的处理方式之二：throws
 *         只不过处理异常的方式是将异常抛出，交给调用者做具体的处理
 *
 *     使用在方法的声明处，后面跟异常的类型
 */
public class ExceptionTest3 {
    public static void main(String[] args) {
        try {
            show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void show() throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("");

        fis.read();

        fis.close();
    }
}
