class AccountTest{
	public static void main(String[] args) {

		//1. 创建一个用户对象
		Customer cust = new Customer("Jane", "Smith");

		//2. 创建一个账户对象
		Account acc = new Account(1000, 2000, 1.23);

		//3. 将 cust 与 acc 关联到一起
		cust.setAccount(acc);

		//4. 对Jane Smith操作
		Account jsAcc = cust.getAccount();

		jsAcc.deposit(100);
		jsAcc.withdraw(960);
		jsAcc.withdraw(2000);

		System.out.println("Customer ["+ cust.getLastName() +", "+ cust.getFirstName() +
			"] has a account: id is "+ jsAcc.getId() +
			", annualInterestRate is "+ jsAcc.getAnnualInterestRate() +"％, balance is " + jsAcc.getBalance());
	}


	//操作某用户的账户
	/*public void test(Customer cust){//jane -  李成兰 - 龙港
		Account acc = cust.getAccount();
	}*/
}

//账户类
class Account{

	private int id;
	private double balance;
	private double annualInterestRate;

	public Account(){}

	public Account(int id, double balance, double annualInterestRate){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	public int getId(){
		return id;
	}

	public double getBalance(){
		return balance;
	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}

	public void setId(int id){
		this.id = id;
	}

	public void setBalance(double balance){
		this.balance = balance;
	}

	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}

	//取款方法
	public void withdraw(double amount){
		if(balance < amount){
			System.out.println("余额不足，取款失败");
		}else{//balance >= amount
			balance -= amount;//this.balance = this.balance - amount;
			System.out.println("成功取出：" + amount);
		}
	}

	//存款方法
	public void deposit(double amount){
		balance += amount;
		System.out.println("成功存入:" + amount);
	}

}

//用户类
class Customer{

	private String firstName;
	private String lastName;
	private Account account;

	public Customer(){}

	public Customer(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Customer(String firstName, String lastName, Account account){
		this(firstName, lastName);
		this.account = account;
	}

	public String getFirstName(){
		return firstName;
	}

	public String getLastName(){
		return lastName;
	}

	public Account getAccount(){
		return account;
	}

	public void setAccount(Account account){
		this.account = account;
	}


}