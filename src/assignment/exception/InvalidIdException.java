package assignment.exception;

public class InvalidIdException extends StudentException{
	
	public InvalidIdException(String msg) {
		super(msg);
		System.out.println(msg);
	}

}
