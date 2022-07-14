class FamilyAccount {
	public static void main(String[] args) {
		int balance = 10000; //生活起始基本金
		String details = "收支\t账户金额\t收支金额\t说    明\n";//明细表表头


		boolean loopFlag = true; //用于控制循环的标记

		do{

			System.out.println("\n-----------------家庭收支记账软件-----------------\n");
			System.out.println("                   1 收支明细");
			System.out.println("                   2 登记收入");
			System.out.println("                   3 登记支出");
			System.out.println("                   4 退    出");
			System.out.println();
			System.out.print("                   请选择(1-4)：");
			
			//跨类调用方法
			char key = Utility.readMenuSelection();

			switch(key){
				case '1':
					//收支明细
					System.out.println("-----------------当前收支明细记录-----------------");
					System.out.println(details);
					System.out.println("--------------------------------------------------");
					break;
				case '2':
					//登记收入
					System.out.print("本次收入金额：");
					int amount1 = Utility.readNumber();

					System.out.print("本次收入说明：");
					String info1 = Utility.readString();

					balance += amount1; //balance = balance + amount1;
					details += "收入\t" + balance + "\t\t" + amount1 + "\t\t" + info1 + "\n";
					
					System.out.println("---------------------登记完成---------------------");
					break;
				case '3':
					//登记支出
					System.out.print("本次支出金额：");
					int amount2 = Utility.readNumber();

					System.out.print("本次支出说明：");
					String info2 = Utility.readString();

					balance -= amount2;
					details += "支出\t" + balance + "\t\t" + amount2 + "\t\t" + info2 + "\n";
					
					System.out.println("---------------------登记完成---------------------");
					break;
				case '4':
					//退出
					System.out.print("确认是否退出(Y/N)：");
					char yn = Utility.readConfirmSelection();
					if(yn == 'Y'){
						loopFlag = false;
					}
					break;
			}
		
		}while(loopFlag);

	}
}
