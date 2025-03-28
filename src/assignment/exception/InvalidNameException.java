package assignment.exception;

public class InvalidNameException extends StudentException{
	
	public InvalidNameException(String msg) {
		super(msg);
		System.out.println(msg);
	}

}
