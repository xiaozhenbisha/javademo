class UserTest {
	public static void main(String[] args) {
		UserTest ut = new UserTest();

		User user = ut.login(123456, 123456);

		System.out.println(user.getDetails());
	}

	public User login(int username, int password){
		if(username == 123456 && password == 123456){
			User user = new User();
			//ÎªÊôĞÔ¸³Öµ
			user.id = 9527;
			user.username = username;
			user.password = password;
			return user;
		}else{
			return null;
		}
	}

}

class User{

	int id;
	int username;
	int password;

	public String getDetails(){
		return id + ", " + username + "," + password;
	}

}