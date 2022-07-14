/*
命令行参数(了解)
*/
class ArrayTest3 {
	public static void main(String[] args) {//args = new String[0]

		for(int i = 0; i < args.length; i++){
			System.out.println("--" + args[i]);
		}

		//将 String 转换成 int
		/*int num = Integer.parseInt(args[0]);
		System.out.println(num);*/
		
	}
}
