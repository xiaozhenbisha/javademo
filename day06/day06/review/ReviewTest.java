class ReviewTest {
	public static void main(String[] args) {
		ReviewTest rt = new ReviewTest();

		Number1 num = new Number1();
		num.a = 10;
		num.b = 20;

		rt.add(num);
		System.out.println("num.a=" + num.a + " num.b=" + num.b);
	}

	public void add(Number1 num){//Ïàµ±ÓÚ£ºNumber1 num = new Number1()
		num.a += 1;
		num.b += 2;
	}

	public Number1 get(){
		return new Number1();
	}
}

class Number1{

	int a;
	int b;

}