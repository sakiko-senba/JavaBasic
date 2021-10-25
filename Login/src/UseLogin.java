
public class UseLogin {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.userId = "user1";
		user1.password = "0123";
		user1.missCnt = 0;
		
		while(true) {
			user1.login();
		}
		
	}

}
