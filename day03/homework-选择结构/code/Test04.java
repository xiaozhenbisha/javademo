class Test04{
	public static void main(String[] args){
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("�������·ݣ�");
		int month = input.nextInt();
		
		System.out.print("���������ڣ�");
		int day = input.nextInt();
		
		if((month==1 && day>=20)  || (month==2 && day<=18)){
			System.out.println("����"+month+"��"+day+"����ˮƿ��");
		}
	}
}