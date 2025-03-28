package assignment.exception;

public class InvalidYearException extends InvalidIdException {
	
	public InvalidYearException(String msg) {
		super(msg);
		System.out.println(msg);
	}

}
