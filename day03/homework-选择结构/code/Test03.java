class Test03{
	public static void main(String[] args){
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("�������ܼ۸�");
		double discount = 1;
		double totalPrice = input.nextDouble();
		if(totalPrice>=500){
			discount = 0.5;
		}else if(totalPrice>=400){
			discount = 0.6;
		}else if(totalPrice>=300){
			discount = 0.7;
		}else if(discount>=200){
			discount = 0.8;
		}else if(discount >= 0){
			discount = 1;
		}else{
			System.out.println("��������");
		}
		System.out.println("�ܼۣ�" + totalPrice);
		System.out.println("�ۿۣ�" + discount);
		System.out.println("�ۿۺ��ܼۣ�" + totalPrice*discount);
	}
}