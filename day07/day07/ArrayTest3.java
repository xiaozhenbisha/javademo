/*
����ı�����

��ͨ for ѭ����

��ǿ for ѭ����

	for(������������Ԫ�ص��������� ������ : ������������){
	
	}

��ͨ for ѭ������ǿ for ѭ��������
��ǿ for ѭ�����ó��ı�������Ԫ�ص�ֵ

*/
class ArrayTest3 {
	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5};

		/*for(int i = 0; i < arr.length; i++){
			int a = arr[i];
			System.out.println(a);
		}

		System.out.println("-------------------------------------");

		for(int a : arr){
			System.out.println(a);
		}

		System.out.println("-------------------------------------");

		Person[] persons = new Person[3];

		persons[0] = new Person();
		persons[1] = new Person("����", 18);
		persons[2] = new Person("����", 20);

		for(Person p : persons){
			System.out.println(p.say());
		}*/

		//�����ж�������Ԫ�ص�ֵΪ 2�����޸�Ϊ 100
		/*for(int i = 0; i < arr.length; i++){
			if(arr[i] == 2){
				arr[i] = 100;
			}
		}*/
		
		for(int a : arr){
			if(a == 2){
				a = 100;
			}
		}

		//��������
		for(int a : arr){
			System.out.println(a);
		}
	}
}

class Person{

	private String name;
	private int age;

	public Person(){}

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String say(){
		return name + "," + age;
	}

}