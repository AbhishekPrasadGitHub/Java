package assignment.exception;

public class InvalidNumberException extends InvalidIdException{
	
	public InvalidNumberException(String msg) {
		super(msg);
		System.out.println(msg);
	}

}
