/*
�ڴ����
���䣺�� JVM �Զ������ڴ�ռ�
�ͷţ��� JVM �Զ�ͨ���������ջ����ͷ��ڴ�

�������ջ��� ��GC Garbage Collection��: ���ڴ��е����������Զ��Ĵ��ڴ����ͷ�

�������� �����ٱ��κ�����ָ��Ķ���

	�������⡿
		System.gc():֪ͨ�������ջ��ƿ����ͷ��ڴ��ˣ����� ��������ջ��Ʋ������������ͷ��ڴ�
					 ���Լӿ��������ջ��Ƶ�����
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
		System.out.println("�Է�");
	}

}