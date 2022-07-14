
class IfExer4 {
	public static void main(String[] args) {
		boolean b = false;

		int a = 10;
		
		//false
		if(b)  //如果写成if(b=false)能编译通过吗？如果能，结果是？
			System.out.println("a");
		else if(b)
			System.out.println("b");
		else if(!b)
			System.out.println("c");
		else
			 System.out.println("d");

	}
}
