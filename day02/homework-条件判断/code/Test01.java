class Test01{
	public static void main(String[] args){
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("������һ��������");
		int num = input.nextInt();
		if(num % 2 == 0){
			System.out.println(num + "��ż��");
		}else{
			System.out.println(num + "������");
		}
	}
}