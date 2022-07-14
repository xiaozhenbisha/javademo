/*
¾Å¾Å³Ë·¨±í
1 * 1 = 1
1 * 2 = 2   2 * 2 = 4
1 * 3 = 3   2 * 3 = 6   3 * 3 = 9
¡­¡­
*/
class Print99 {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j + "*" + i + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
}
