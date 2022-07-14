class AccountTest{
	public static void main(String[] args) {

		//1. ����һ���û�����
		Customer cust = new Customer("Jane", "Smith");

		//2. ����һ���˻�����
		Account acc = new Account(1000, 2000, 1.23);

		//3. �� cust �� acc ������һ��
		cust.setAccount(acc);

		//4. ��Jane Smith����
		Account jsAcc = cust.getAccount();

		jsAcc.deposit(100);
		jsAcc.withdraw(960);
		jsAcc.withdraw(2000);

		System.out.println("Customer ["+ cust.getLastName() +", "+ cust.getFirstName() +
			"] has a account: id is "+ jsAcc.getId() +
			", annualInterestRate is "+ jsAcc.getAnnualInterestRate() +"��, balance is " + jsAcc.getBalance());
	}


	//����ĳ�û����˻�
	/*public void test(Customer cust){//jane -  ����� - ����
		Account acc = cust.getAccount();
	}*/
}

//�˻���
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

	//ȡ���
	public void withdraw(double amount){
		if(balance < amount){
			System.out.println("���㣬ȡ��ʧ��");
		}else{//balance >= amount
			balance -= amount;//this.balance = this.balance - amount;
			System.out.println("�ɹ�ȡ����" + amount);
		}
	}

	//����
	public void deposit(double amount){
		balance += amount;
		System.out.println("�ɹ�����:" + amount);
	}

}

//�û���
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