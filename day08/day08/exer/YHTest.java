/*
ʹ�ö�ά�����ӡһ�� 10 ���������.
1
1 1
1 2 1
1 3 3  1
1 4 6  4  1
1 5 10 10 5 1
 ....
  
����ʾ��
 1. ��һ���� 1 ��Ԫ��, �� n ���� n ��Ԫ��
 2. ÿһ�еĵ�һ��Ԫ�غ����һ��Ԫ�ض��� 1
 3. �ӵ����п�ʼ, ���ڷǵ�һ��Ԫ�غ����һ��Ԫ�ص�Ԫ��. 
     yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];

*/
class YHTest {
	public static void main(String[] args) {
		//1. ����һ����ά����
		int[][] yh = new int[10][]; //{{0}, {0,0}, {0,0,0}, {0,0,0,0}, {0,0,0,0,0}}

		/*yh[0] = new int[1];
		yh[1] = new int[2];*/

		//2. ��ʼ����ά�����е�һά����
		for(int i = 0; i < yh.length; i++){
			yh[i] = new int[i+1];
		}

		//3. Ϊ��ά�����е�һά����ÿ��Ԫ�ظ�ֵ
		for(int i = 0; i < yh.length; i++){
			yh[i][0] = 1;
			yh[i][i] = 1;

			for(int j = 0; j < yh[i].length; j++){
				//������ǰ��Ҫ��ֵԪ�ص�λ��
				if(i > 1 && j > 0 && j < i){
					yh[i][j] = yh[i-1][j] + yh[i-1][j-1];
				}
			}
		}

	
		//������ά����
		for(int[] as : yh){
			for(int a : as){
				System.out.print(a + "\t");
			}

			System.out.println();
		}
	}
}
