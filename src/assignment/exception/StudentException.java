package assignment.exception;

public class StudentException extends Exception {
	
	public StudentException(String msg) {
		super(msg);
		System.out.println(msg);
	}

}
