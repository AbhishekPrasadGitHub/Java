package assignments;

public class LoginException extends RuntimeException {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

	}

	public LoginException(String msg) {

		super(msg);
		System.out.println("Invalid login credentials entered");

	}

}
