/*

*/
class MarrayTest {
	public static void main(String[] args) {

		/*Boy boy = new Boy();
		boy.setName("������");
		boy.setAge(18);

		Girl girl = new Girl();
		girl.setName("������");

		boy.marry(girl);*/

		Girl girl = new Girl();
		girl.setName("������");

		Boy boy = new Boy();
		boy.setName("����");

		girl.marry(boy);

	}
}

class Boy{

	private String name;
	private int age;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}

	public void marry(Girl girl){
		System.out.println(this.getName() + " ˵����ҪȢ " + girl.getName());
	}

	public void shout(Girl girl){
		System.out.println(this.getName() + " ��������ҲҪȢ " + girl.getName());
	}
}

class Girl{

	private String name;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void marry(Boy boy){
		System.out.println(this.getName() + " ˵������޸� " + boy.getName());

		//Girl girl = new Girl();
		boy.shout(this);
	}
}