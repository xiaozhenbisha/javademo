/*
��x,y,z�е����ֵ
*/
class Test8{
	public static void main(String[] args){
		int x = 3;
		int y = 4;
		int z = 1;
		int max = x>=y ? x : y;
		max = max >= z ? max : z;
		System.out.println(x + "," + y + "," + z + "�е����ֵ�ǣ�" + max);
	}
}