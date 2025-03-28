package javatraining;

public class ExceptionHandlingExamples {

	public static void main(String[] args) {
		
		int a, b, c, d;
		a = 10;
		b = c = 5;
		try {
		d = a / (b - c);
		} catch (ArithmeticException e) {
			
			System.out.println(e.toString());
		}
		System.out.println("Value of a is "+ a);
		
		int x = a / (b + c);
		System.out.println("Value of d is "+ x);

	}

}
