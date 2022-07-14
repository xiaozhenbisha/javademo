class PassObject {
	public static void main(String[] args) {

		PassObject po = new PassObject();
		//po.printAreas(new Circle(), 5);

		Circle c = new Circle();
		int t = 5;

		po.printAreas(c, t);

	}

	public void printAreas(Circle c, int times){//相当于：Circle c = new Circle();
		System.out.println("Raidus\t\tArea");

		int i = 1;
		for(; i <= times; i++){
			c.radius = i;

			System.out.println(c.radius + "\t\t" + c.findArea());
		}

		c.radius = i;

		System.out.println(" now radius is :" + c.radius);
	}
}

class Circle{
	
	double radius;

	//计算圆的面积
	public double findArea(){
		return Math.PI * radius * radius;
	}

}