# 第一章 Java 编程语言概述

## 一、Java 三大体系平台

JavaSE Java Standard Edition Java 标准版

JavaEE Java Enterprise Edition Java 企业版

JavaME Java Micro Edition Java微型版





C/S Client/Server 客户端/服务端

B/S Browser/Server 浏览器/服务器



## 二、搭建开发环境

JVM Java Virtual Machine Java 虚拟机 ：用于与操作系统进行交互

JRE  Java Runtime Environment Java 运行环境：包括 JVM + Java 提供的核心类库

JDK Java Development Kit   Java开发工具集 ：包括 JRE + 开发工具包



## 三、配置 path 环境变量

1、下载安装 jdk

2、通过命令提示符到 jdk 安装路径的 bin 路径下，执行 javac

3、配置 path 环境变量：jdk 安装路径的 bin 路径下

​	目的：在任意路径下执行 javac

​	执行流程：先在当前路径下找是否有 javac.exe 在，若没有再到 path 环境变量中从前往后依次查找

4、配置 JAVA_HOME : 配置到 JDK 安装的根目录。 如： d:\java\jdk1.8.0_141

5、将 path 的jdk路径修改为： %JAVA_HOME%\bin 



## 四、开发第一个应用程序的步骤

1、编写：.java 源文件 【HelloWorld.java】

2、编译：通过 javac 命令，生成一个或多个 .class 字节码文件。 【javac HelloWorld.java】

3、运行：通过 java 命令，将生成的一个或多个 .class 字节码文件加载到内存中。 【java HelloWorld】



## 五、开发第一个应用程序的注意

1、以 .java 结尾的文件，称为 .java 源文件

2、一个 .java 源文件中可以有多个类，但是只能有一个 public 修饰的类

3、public 修饰类的名称必须与 .java 源文件名称一致

4、每条语句以 ";" 结尾

5、Java 严格区分大小写

6、若一个类需要执行，该类中必须提供主方法，是程序的入口

```
public static void main(String[] args){
    
}
```

