/*
位运算符：  ~    |    &   ^      <<    >>   >>>    注意：没有无符号 <<<

(了解) 一个数在计算机中的二进制表现形式，该数称为机器数
	    机器数最高位为符号位，0表示正数，1表示负数

	    正数的原码、反码、补码三码合一

	    负数的原码：
			符号位不变，其真值的绝对值

	    负数的反码：
			原码的取反

	     负数的补码：
			反码 + 1

	      在计算机中都是以 补码 的形式存储的

*/
class VariableTest2 {
	public static void main(String[] args) {
		int a = 12;
		int b = 5;

		System.out.println(~a); //-13
		System.out.println(a | b);
		System.out.println(a & b);
		System.out.println(a ^ b);

		System.out.println(12 << 2);
		System.out.println(12 >> 2);
		System.out.println(12 >>> 2);

		System.out.println(-12 >> 2);
		System.out.println(-12 >>> 2);
	}
}
