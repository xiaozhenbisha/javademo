class Test02{
	public static void main(String[] args){
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("������һ���ַ���");
		char c = input.next().charAt(0);
		if(c >= '0' && c <= '9'){
			System.out.println(c + "������.");
		}else if(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z'){
			System.out.println(c + "����ĸ.");
		}else{
			System.out.println(c + "�����ַ���ĸ�������ַ�.");
		}
	}
}