class ReviewTest {
	public static void main(String[] args) {

		User user = new User(1001, "admin", "123456");

		System.out.println(user.getDetails());

	}
}

class User{

	private int uid;
	private String username;
	private String password;

	public User(){}

	public User(int uid, String username){
		this.uid = uid;
		this.username = username;
	}

	public User(int uid, String username, String password){
		//this.uid = uid;
		//this.username = username;
		this(uid, username);
		this.password = password;
	}

	public void setUid(int uid){
		this.uid = uid;
	}

	public int getUid(){
		return uid;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	public String getDetails(){
		return uid + "," + username + "," + password;
	}

}