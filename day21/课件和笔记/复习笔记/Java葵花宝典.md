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

#### (2) 常用方法

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
int read(byte[] b,int offset,int len);
						从文件开头读取len个字节,从数组的off索引值位置开始存(了解)

close();   进行关闭资源
```

### 16.2.5 字节输出流

#### (1) 构造器

```java
new FileOutputStream(String name);
new FileOutputStream(File file);
	文件是可以不存在的，但是文件所在的目录是必须存在的
	他们在创建流对象时，如果文件是存在的会将内容清空！如果我想追加呢？
new FileOutputStream(String name,boolean append);
new FileOutputStream(File file,boolean append);
	设置追加内容
```

#### (2) 常用方法

```java
write(int i); 将字节写出
write(byte[] b);将数组中所有字节写入   使用几率很小
write(byte[] b,int off,int len);将数组中的数据从off索引位置开始写，写len个
close();  关闭资源

InputStream和OutputStream读写配对情况
int read()     write(int i)
int read(byte[] b)   writer(byte[] b,int off,int len);

```

### 16.2.6 字符输入流

#### (1)构造器

```java
new FileReader(String filename);
new FileReader(File file);
```

#### (2) 常用方法

```java
int read(); 执行一次读取一个字符(采用int值去表示),读到文件末尾在读返回-1
int read(char[] c);执行一次读取多个字符,读取到的字符存放在char数组中，
	返回值是读取的字符数，读到文件末尾在读返回-1
int read(char[] c,int off,int len);执行一次读取len个字符，从数组的off索引位置开始存 (了解)
```

### 16.2.7 字符输出流

#### (1)构造器

```java
new FileWriter(String name);
new FileWriter(String name,boolean append);
new FileWriter(File file);
new FileWriter(File file,boolean append);
```

#### (2) 常用方法

```java
 write(int i)   写一个字符    和  int read()   配合使用
 write(char[] c)  执行一次将char数组中全部数据写出   (了解)
 write(char[] c,int off,int len); 执行一次将char数组中数据从off索引位置开始写，写len个
 write(String str);   将字符串全部内容写入到文件
 write(String str,int off,int len);执行一次将字符串中数据从off索引位置开始写，写len个

close();
flush();//刷新 --> 缓存中的内容应用到文件中
	既然关闭有刷新，为甚还要有刷新呢？
	刷新后，out对象还是可以继续用的！
	关闭后，out对象就不能用了！
flush什么时候用？
	写大量内容的时候,可以多几次刷新，保证内存一直是比较好的状态
```

### 16.2.8 缓冲流

缓冲流,也叫高效流，按照数据类型分类：

- **字节缓冲流**：`BufferedInputStream`，`BufferedOutputStream` 
- **字符缓冲流**：`BufferedReader`，`BufferedWriter`

缓冲流的基本原理，是在创建流对象时，会创建一个内置的默认大小的缓冲区数组，通过缓冲区读写，减少系统IO次数，从而提高读写的效率。

#### (1)字节输入缓冲流

```java
字节输入缓冲流 BufferedInputStream (对InputStream的处理)
构造器
	BufferedInputStream(InputStream in);
	BufferedInputStream(InputStream in,int size);  设置缓冲区大小
方法
	和InputStream中的三个read方法用法一致(提高了一些效率)
```

#### (2)字节输出缓冲流

```java
字节输出缓冲流 BufferedOutputStream (对OutputStream的处理)
构造器
	new BufferedOutputStream(OutputStream out);
	new BufferedOutputStream(OutputStream out,int size);
方法
	和OutputStream方法一致
```

#### (3)字符输入缓冲流

```java
字符输入缓冲流 BufferedReader(对Reader的处理)
构造器
	new BufferedReader(Reader reader)
	new BufferedReader(Reader reader,int size)
方法
	包含Reader中的三个read方法
	String readLine();  执行一次读取一行,读到没有会返回null
```

#### (4)字符输出缓冲流

```java
字符输出缓冲流 BufferedWriter(对Writer的处理)
构造器
	new BufferedWriter(Writer out)
	new BufferedWriter(Writer out,int size)
方法
	包含五个write方法
	newLine();换行
```

### 16.2.9 转换流

#### 字符编码

​	**字符编码`Character Encoding`** : 就是一套自然语言的字符与二进制数之间的对应规则。

​	按照某种规则，将字符存储到计算机中，称为**编码** 

​	反之，将存储在计算机中的二进制数按照某种规则解析显示出来，称为**解码**

#### 字符集

​	**字符集 `Charset`**：也叫编码表。是一个系统支持的所有字符的集合，包括各国家文字、标点符号、图形符号、数字等。

#### 编码引出的问题

​	如果文件的编码格式和程序的编码格式不一致，会导致乱码的产生！如何解决呢？

#### (1) InputStreamReader类

​	转换流`java.io.InputStreamReader`，是Reader的子类，是从字节流到字符流的桥梁。它读取字节，并使用指定的字符集将其解码为字符。它的字符集可以由名称指定，也可以接受平台的默认字符集。 

```java
new InputStreamReader(InputStream in); 单纯的转换(处理不了中文乱码)
new InputStreamReader(InputStream in,String charsetName); 可以处理乱码问题
```

#### (2) OutputStreamWriter类

​	转换流`java.io.OutputStreamWriter` ，是Writer的子类，是从字符流到字节流的桥梁。使用指定的字符集将字符编码为字节。它的字符集可以由名称指定，也可以接受平台的默认字符集。

```java
new OutputStreamWriter(OutputStream out);  单纯的转换
new OutputStreamWriter(OutputStream out,String charsetName);  指定字符集(采用指定字符集创建文件)
```

### 16.2.10 对象流

#### 序列化

​	Java 提供了一种对象**序列化**的机制。用一个字节序列可以表示一个对象，该字节序列包含该`对象的类型`和`对象中存储的属性`等信息。字节序列写出到文件之后，相当于文件中**持久保存**了一个对象的信息。

```
java中的对象如何序列化
    在对象的类型上实现 一个接口Serializable(该接口下没有抽象方法)
    字节序列是不可读的！计算机可读！
    static、transient修饰的内容不会被序列化的
    如果有对象的关联，要求关联的对象也是需要序列化的
```

#### 反序列化

​	反之，该字节序列还可以从文件中读取回来，重构对象，对它进行**反序列化**。`对象的数据`、`对象的类型`和`对象中存储的数据`信息，都可以用来在内存中创建对象

#### (1) ObjectOutputStream类

```java
 构造器：
 	new ObjectOutputStream(OutputStream out)
 方法：
 	包含OutputStream中的三个write方法
 	writeXXX(XXX xxx);
 	writeObject(Object obj);
```

#### (2) ObjectInputStream类

```java
构造器：
	new ObjectInputStream(InputStream in);
方法：
	包括三个read方法
	XXX readXXX();
	readObject();
采用对象流去读的文件，必须是采用对象流写出的文件(不能是一个普通文件)
读的时候和写的时候顺序要保持一致(按照字节序列操作)
```



### 16.2.11 版本兼容

#### (1) 设置版本号的提示功能

![1592620163691](C:\Users\86152\AppData\Roaming\Typora\typora-user-images\1592620163691.png)

#### (2) serialVersionUID的作用

```
序列化的对象存在serialVersionUID的话，版本改变的话，会存在兼容操作，否则会出现异常
```

