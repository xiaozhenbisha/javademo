/*
��д�����࣬TriAngle��TestTriAngle������TriAngle������˽�еĵױ߳�base�͸�height��
ͬʱ����������������˽�б�������һ������ʹ����Щ�������������������ε������
*/
class TestTriAngle {
	public static void main(String[] args) {
		TriAngle ta = new TriAngle(15.6, 22.22);
		
		System.out.println("�����ε����Ϊ��" + ta.getBase() * ta.getHeight() / 2);
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