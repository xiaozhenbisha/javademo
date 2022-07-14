# 第十六章 文件与IO流

## 16.1 File文件类(了解)

### 16.1.1 File类概述

​	 理解：  File类是java.io包下代表与平台(操作系统)无关的文件和目录(文件夹)
 	功能： 对文件和目录的操作(新建、删除、改名、获得目录下的内容、文件的大小、文件的各种路径)   访问不到文件的内容

### 16.1.2 构造器

```java
new File(String pathname)  //根据文件或目录的路径字符串构造一个File对象
                /*绝对路径：从根目录开始的路径(windows系统是从盘符开始的，linux根目录就是一个/)
                相对路径：找一个参照物(当前文件/当前项目)
                    ./   当前文件所在的文件夹(./在java中指的是当前项目[Project])
                        day19_IO是项目下的一个模块
                    ../   当前文件所在文件夹的上一级(当前项目的上一级)
                        没有   .../  符号*/
 new File(File parent,String child) //根据父级File对象和子级字符串名称构建File对象
 new File(String parent,String child)// 根据父级的字符串路径和子级字符串名称构建File对象
```

### 16.1.3 有哪些方法

​	1）: 获取文件和目录基本信息的方法

```java
file.getName();//返回文件或目录名
file.length();//获得文件的内容长度(字节)
file.lastModified();//获得最后一次修改的时间：毫秒数
file.getPath();//返回路径字符串
file.getAbsolutePath();//返回绝对路径
file.getCanonicalPath();//返回规范路径
```

 	2）: 判断信息

```java
file.exists();//判断文件或路径是否存在
file.isFile();//判断是否是文件 (必须存在)
file.isDirectory();//判断是否是目录
file.isAbsolute();//判断是否是用绝对路径创建的对象
file.canRead();//是否可读
file.canWrite();//是否可写
file.isHidden();//是否隐藏
```

​	3）: 文件和目录的创建和删除

```java
file.createNewFile();//只能新建文件(要保证file对象的目录的路径是必须存在的)
file.mkdir();//只能创建一级
file.mkdirs();//创建多级目录
file.delete();//删除文件或空目录
删除文件，直接删除
删除目录，只能删除空目录
```

​	4）: 获取父级信息

```java
file.getParent();//返回当前对象的父级路径(String)
file.getParentFile();//获得当前当前对象的父级对象
```

​	5）：目录的遍历

```java
String[] list();   //返回目录中所有内容(一级)的名称
File[] listFiles();   //返回目录中所有子级File对象
File[] listFiles(FileFilter filter);  //返回目录中符合条件的子级File对象
```

## 16.2 IO流(重点)

### 16.2.1 IO流概述


​	IO就是 数据的传输，可以看做是一种数据的流动，按照流动的方向，以内存为基准，分为`输入input` 和`输出output` ，即流向内存是输入流，流出内存的输出流。

​	Java中I/O操作主要是指使用`java.io`包下的内容，进行输入、输出操作。**输入**也叫做**读取**数据，**输出**也叫做作**写出**数据。 

### 16.2.2 IO流的分类

```
① 按方向分(自己的占位)
    输入流(数据从外界[磁盘(此时)，网络(网络编程)，输入设备(Scanner)...]到程序)
    输出流(数据从程序到外界[磁盘、网络、显示设备...])
② 按数据处理类型
    字节流:处理单位是字节(图片、音频、视频...[所有一切用字节形式存储的文件]) ★
    字符流:处理单位是字符(处理长文本)
③ 按角色分
    节点流(原始流)  :  没有经过任何处理的流[效率低]
    处理流 :  在原始流的基础上进行了处理[ ①提高效率  ②提供好用的方法]
```

### 16.2.3 4大根类

|        | 字节流       | 字符流 |
| ------ | ------------ | ------ |
| 输入流 | InputStream  | Reader |
| 输出流 | OutputStream | Writer |

### 16.2.4 字节输入流

​	InputStream(抽象类)  -->  第一大子类FileInputStream(处理磁盘上的文件的)

#### (1) 构造器

```java
new FileInputStream(File file); //读取file对象指向的文件
new FileInputStream(String path); //读取path路径指向的文件
```

#### (2) 常用方法方法

```java
int read();   返回的是一个字节的内容(只是采用int[ASCII]值去存储),执行一次读取一个字节
              如果已经没有数据了，返回值是-1(可以采用循环了)
                     循环读取方式：
                        int i=0;
                        while((i=in.read())!=-1){//① in.read()  ② i=值  ③ i!=-1
                            System.out.print((char)i);
                        }
int read(byte[] b); 执行一次，读取多个字节，多个字节存储到b数组中，返回值是读取的字节数
                       文件剩余字节数大于数组的长度，最多就能读取数组长度个字节
                       文件剩余字节数小于数组的长度，读取的字节数就是文件剩余字节数
                   	   如果读到没有数据了，返回值是-1(可以写循环了)
    				 循环读取方式：
    					byte[] b=new byte[10];
                        int len=0;
                        while((len=in.read(b))!=-1){//① read(b) ② 赋值  ③  比较
                             //展示数据
                             System.out.print(new String(b,0,len));//掌握此方式，为以后做铺垫
                        }
int read(byte[] b,int offset,int len);待讲

close();   进行关闭资源

```

