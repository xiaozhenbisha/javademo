/*
内存管理：
分配：由 JVM 自动分配内存空间
释放：由 JVM 自动通过垃圾回收机制释放内存

垃圾回收机制 （GC Garbage Collection）: 将内存中的垃圾对象自动的从内存中释放

垃圾对象 ：不再被任何引用指向的对象

	【面试题】
		System.gc():通知垃圾回收机制可以释放内存了，但是 垃圾会回收机制并不会立即的释放内存
					 可以加快垃圾回收机制的运行
*/
class GCTest {
	public static void main(String[] args) {
		Person p = new Person();
		p = null;

		
		
		p = new Person();

		p = new Person();

		Person p2 = new Person();

		p = p2;

	}
}

class Person{

	String name;
	int age;

	public void eat(){
		int a = 0;
		System.out.println("吃饭");
	}

}