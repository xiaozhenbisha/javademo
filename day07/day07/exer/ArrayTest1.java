/*
练习一
创建一个char类型的26个元素的数组，分别 放置'A'-'Z‘。
使用for循环访问所有元素并打印出来。
提示：char类型数据运算 'A'+1 -> 'B'，'0'+1 -> '1‘
练习二
创建一个char类型的36个元素的数组，前26个元素放置'A'-'Z‘,   
后10个元素放置'0'-'9‘。
使用for循环访问所有元素并打印出来。

*/
class ArrayTest1 {
	public static void main(String[] args) {
		char[] letters = new char[36];

		/*letters[0] = (char)('A' + 0);
		letters[1] = (char)('A' + 1);
		letters[2] = (char)('A' + 2);*/

		for(int i = 0; i < letters.length; i++){
			if(i < 26){
				letters[i] = (char)('A' + i);
			}else{
				letters[i] = (char)('0' + i - 26);			
			}
		}

		//数组的遍历
		for(int i = 0; i < letters.length; i++){
			System.out.println(letters[i]);
		}
	}
}
