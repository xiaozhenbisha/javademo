# day19_课后练习

# 文件操作

## 第1题

案例：

​	1、使用绝对路径，在D盘下创建一个testIO文件夹，然后在testIO文件夹中创建一个1.txt文件

​	2、使用相对路径，在当前项目下创建一个testIO文件夹，然后在testIO文件夹中创建一个1.txt文件

```java
package com.atguigu.test01;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class Test01 {
	@Test
	public void test01() throws IOException {
		File dir = new File("d:/testIO");
		dir.mkdir();
		
		File file = new File("d:/testIO/1.txt");
		file.createNewFile();
	}
	
	@Test
	public void test02() throws IOException {
		File dir = new File("testIO");
		dir.mkdir();
		
		File file = new File("testIO/1.txt");
		file.createNewFile();
	}
}
```



## 第2题

案例：

​	1、检查D盘的testIO文件夹下是否存在文件a.txt，如果不存在则创建该文件。

​	2、获取D盘的testIO文件夹下的a.txt文件的文件名，文件大小，文件的绝对路径和父路径等信息，并将信息输出在控制台

​	3、判断File file = new File("d:\testIO");是否文件,是文件则输出：xxx是一个文件，是否文件夹,是文件夹则输出：xxx是一个文件夹

​	4、删除D盘的testIO文件夹下的a.txt文件

​	5、删除当前项目下的testIO文件夹下的1.txt文件，然后删除testIO文件夹

```java
package com.atguigu.test02;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class Test02 {
	@Test
	public void test05(){
		File file = new File("d:/testIO/1.txt");
		file.delete();
		
		File dir = new File("d:/testIO");
		dir.delete();
	}
	
	@Test
	public void test04(){
		File file = new File("d:/testIO/a.txt");
		file.delete();
	}
	@Test
	public void test03(){
		File file = new File("d:/testIO");
		if(file.isFile()){
			System.out.println(file+"是一个文件。");
		}else if(file.isDirectory()){
			System.out.println(file + "是一个文件夹");
		}
	}
	@Test
	public void test02(){
		File file = new File("d:/testIO/a.txt");
		System.out.println("文件名：" + file.getName());
		System.out.println("文件大小：" + file.length());
		System.out.println("文件的绝对路径：" + file.getAbsolutePath());
		System.out.println("文件的父目录：" + file.getParent());
	}
	@Test
	public void test01(){
		File file = new File("d:/testIO/a.txt");
		try {
			if(!file.exists()){
				file.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
```



# IO流操作

## 第3题

案例：

​	1、把老师的word笔记文档《第14章 IO流.docx》，复制到当前项目的testIO文件夹下。

​	2、要求使用缓冲流和文件流一起实现

```java
package com.atguigu.test03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) {
		try(
				BufferedInputStream bis = new BufferedInputStream(
						new FileInputStream("D:/尚硅谷/笔记/第14章 IO流.docx"));
				BufferedOutputStream bos = new BufferedOutputStream(
						new FileOutputStream("testIO/第14章 IO流.docx"));
		){
			byte[] data = new byte[1024];
			int len;
			while((len = bis.read(data))!=-1){
				bos.write(data, 0, len);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
```



## 第4题

案例：

​	把今天的作业文件夹day22_homework下的《我想对你说.txt》字符编码为GBK，复制到当前项目的testIO文件夹下的《老师的话.txt》字符编码为UTF-8

```java
package com.atguigu.test04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test04 {
	public static void main(String[] args) {
		try(
			FileInputStream fis = new FileInputStream("d:/atguigu/day22_homework/我想对你说.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			InputStreamReader isr = new InputStreamReader(bis,"GBK");
				
			FileOutputStream fos = new FileOutputStream("testIO/老师的话.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			OutputStreamWriter osw = new OutputStreamWriter(bos, "UTF-8");	
		){
			char[] data = new char[1024];
			int len;
			while((len = isr.read(data))!=-1){
				osw.write(data, 0, len);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

```



## 第5题

案例：

​	把如下这些数据存放到一个data.dat文件中，并且再次读取显示

```java
int a = 10;
char c = 'a';
double d = 2.5;
boolean b = true;
String str = "尚硅谷";
```

```java
package com.atguigu.test05;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class Test05 {
	@Test
	public void test02() throws IOException {
		DataInputStream dis = new DataInputStream(new FileInputStream("data.dat"));
		System.out.println(dis.readInt());
		System.out.println(dis.readChar());
		System.out.println(dis.readDouble());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readUTF());
		dis.close();
	}
	
	@Test
	public void test01() throws IOException {
		int a = 10;
		char c = 'a';
		double d = 2.5;
		boolean b = true;
		String str = "尚硅谷";
		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.dat"));
		dos.writeInt(a);
		dos.writeChar(c);
		dos.writeDouble(d);
		dos.writeBoolean(b);
		dos.writeUTF(str);
		dos.close();
	}
}
```



## 第6题

案例：

​	1、声明一个Message类，包含：发送者、接收者、消息内容、发送时间

​	2、创建一个Message对象，并写到message.dat文件中，并再次读取显示

```java
package com.atguigu.test06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.junit.Test;

public class Test06 {
	@Test
	public void test02() throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("message.dat"));
		Object msg = ois.readObject();
		System.out.println(msg);
		ois.close();
	}
	@Test
	public void test01() throws FileNotFoundException, IOException{
		Message msg = new Message("陈老师", "佟老师", "加工资", System.currentTimeMillis());
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("message.dat"));
		oos.writeObject(msg);
		oos.close();
	}
}
class Message implements Serializable{

	private static final long serialVersionUID = 1L;
	private String fromUser;
	private String toUser;
	private String content;
	private long sendTime;
	public Message(String fromUser, String toUser, String content, long sendTime) {
		super();
		this.fromUser = fromUser;
		this.toUser = toUser;
		this.content = content;
		this.sendTime = sendTime;
	}
	public Message() {
		super();
	}
	public String getFromUser() {
		return fromUser;
	}
	public void setFromUser(String fromUser) {
		this.fromUser = fromUser;
	}
	public String getToUser() {
		return toUser;
	}
	public void setToUser(String toUser) {
		this.toUser = toUser;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public long getSendTime() {
		return sendTime;
	}
	public void setSendTime(long sendTime) {
		this.sendTime = sendTime;
	}
	@Override
	public String toString() {
		return "Message [fromUser=" + fromUser + ", toUser=" + toUser + ", content=" + content + ", sendTime="
				+ sendTime + "]";
	}
}
```



## 第7题

案例：

​	1、使用从键盘输入三句话，用PrintStream打印到一个words.txt文件中

​	2、再用Scanner一行一行读取显示

```java
package com.atguigu.test07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.Test;

public class Test07 {
	@Test
	public void test02() throws FileNotFoundException{
		Scanner input = new Scanner(new File("words.txt"));
		while(input.hasNextLine()){
			System.out.println(input.nextLine());
		}
		input.close();
	}
	
	
	@Test
	public void test01() throws FileNotFoundException{
		Scanner input = new Scanner(System.in);
		PrintStream ps = new PrintStream("words.txt");
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入第" + (i+1) + "句要对老师说的话：");
			String content = input.nextLine();
			ps.println(content);
		}
		input.close();
		ps.close();
	}
}

```



# 递归

## 第8题

案例：获取D盘atguigu文件夹下所有的.java文件

（1）不包含子文件夹

（2）包含子文件夹

```java
package com.atguigu.test08;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

import org.junit.Test;

public class Test08 {
	@Test
	public void test01(){
		File  file = new File("D:/atguigu");
		//不包含子文件夹中的
		File[] listFiles = file.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				
				return pathname.getName().endsWith(".java");
			}
		});
		for (File sub : listFiles) {
			System.out.println(sub);
		}
	}
	
	@Test
	public void test02() {
		File  file = new File("D:/atguigu");
		//包含子文件夹中的
		ArrayList<String> all = listAllSubs(file);
		for (String string : all) {
			System.out.println(string);
		}
	}
	
	public ArrayList<String> listAllSubs(File file){
		ArrayList<String> list = new ArrayList<>();
		if(file.isFile()){
			if(file.getName().endsWith(".java")){
				list.add(file.getPath());
			}
		}else if(file.isDirectory()){
			File[] listFiles = file.listFiles();
			for (File sub : listFiles) {
				list.addAll(listAllSubs(sub));
			}
		}
		return list;
	}
}
```



## 第9题

案例：统计《尚硅谷_JavaSE》文件夹大小

```java
package com.atguigu.test09;

import java.io.File;

import org.junit.Test;

public class Test09 {
	@Test
	public void test01(){
		File file = new File("d:/尚硅谷_JavaSE");
		long size = size(file);
		System.out.println("文件夹总大小：" + size);
	}
	public long size(File file){
		if(file.isFile()){
			return file.length();
		}else if(file.isDirectory()){
			File[] listFiles = file.listFiles();
			long sum = 0;
			for (File sub : listFiles) {
				sum += size(sub);
			}
			return sum;
		}
		return 0;
	}
}

```



## 第10题

案例：复制《尚硅谷_JavaSE》到当前项目的testIO文件夹中

```java
package com.atguigu.test10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class Test10 {
	@Test
	public void test01() throws IOException{
		File src = new File("d:/作业与成绩");
		File dest = new File("testIO");
		copyDir(src, dest);
	}
	
	public void copyDir(File src, File dest) throws IOException{
		if(dest.isFile()){
			throw new RuntimeException(dest +"不是文件夹");
		}
		if(src.isFile()){
			File destFile = new File(dest.getPath()+"/" + src.getName());
			copyFile(src, destFile);
		}else if(src.isDirectory()){
			File destFile = new File(dest.getPath()+"/" + src.getName());
			destFile.mkdir();
			
			File[] listFiles = src.listFiles();
			for (File sub : listFiles) {
				copyDir(sub,destFile);
			}
		}
	}
	
	public void copyFile(File srcFile, File destFile) throws IOException{
		FileInputStream fis = new FileInputStream(srcFile);
		FileOutputStream fos = new FileOutputStream(destFile);
		byte[] data = new byte[1024];
		int len;
		while((len = fis.read(data)) !=-1){
			fos.write(data, 0, len);
		}
		fis.close();
		fos.close();
	}
}

```



## 第11题

案例：删除当前项目的testIO文件夹

```java
package com.atguigu.test11;

import java.io.File;

import org.junit.Test;

public class Test11 {
	@Test
	public void test01(){
		deleteDir(new File("testIO"));
	}
	
	public void deleteDir(File dir){
		if(dir.isDirectory()){
			File[] listFiles = dir.listFiles();
			for (File sub : listFiles) {
				deleteDir(sub);
			}
		}
		
		dir.delete();
	}
}

```



## 第12题

案例：剪切《尚硅谷_JavaSE》到当前项目的testIO文件夹中

```java
package com.atguigu.test12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class Test12 {
	@Test
	public void test01() throws IOException{
		File src = new File("testIO");
		File dest = new File("testIO2");
		cutDir(src, dest);
	}
	
	public void cutDir(File src, File dest) throws IOException{
		if(dest.isFile()){
			throw new RuntimeException(dest +"不是文件夹");
		}
		if(src.isFile()){
			File destFile = new File(dest.getPath()+"/" + src.getName());
			copyFile(src, destFile);
		}else if(src.isDirectory()){
			File destFile = new File(dest.getPath()+"/" + src.getName());
			destFile.mkdir();
			
			File[] listFiles = src.listFiles();
			for (File sub : listFiles) {
				cutDir(sub,destFile);
			}
		}
		src.delete();
	}
	
	public void copyFile(File srcFile, File destFile) throws IOException{
		FileInputStream fis = new FileInputStream(srcFile);
		FileOutputStream fos = new FileOutputStream(destFile);
		byte[] data = new byte[1024];
		int len;
		while((len = fis.read(data)) !=-1){
			fos.write(data, 0, len);
		}
		fis.close();
		fos.close();
	}
}

```

