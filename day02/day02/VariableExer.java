/*
声明Variable类，main方法中使用double类型声明var1和var2变量，
然后用var2保存var1与var2之商。
 声明字符串变量str，用str串接的形式表示上述计算并打印输出结果。
*/
class VariableExer {
	public static void main(String[] args) {
		//double var1 = 15.6;
		//double var2 = 5.6;
		double var1 = 15.6, var2 = 5.6;

		var2 = var1 / var2;

		//String str = "var1 / var2=" + var2;
		//System.out.println(str);

		System.out.println("var1 / var2=" + var2);
	}
}
