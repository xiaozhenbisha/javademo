/*
编写两个类，TriAngle和TestTriAngle，其中TriAngle中声明私有的底边长base和高height，
同时声明公共方法访问私有变量；另一个类中使用这些公共方法，计算三角形的面积。
*/
class TestTriAngle {
	public static void main(String[] args) {
		TriAngle ta = new TriAngle(15.6, 22.22);
		
		System.out.println("三角形的面积为：" + ta.getBase() * ta.getHeight() / 2);
	}
}

class TriAngle{

	private double base;
	private double height;

	public TriAngle(){}

	public TriAngle(double base, double height){
		this.base = base;
		this.height = height;
	}

	public void setBase(double base){
		this.base = base;
	}

	public double getBase(){
		return base;
	}

	public void setHeight(double height){
		this.height = height;
	}

	public double getHeight(){
		return height;
	}

}