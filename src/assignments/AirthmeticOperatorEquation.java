package assignments;

import java.util.Scanner;

public class AirthmeticOperatorEquation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter third number: ");
		int num3 = sc.nextInt();
		System.out.println("Enter fourth number: ");
		int num4 = sc.nextInt();
		
		equationCheck(num1, num2, num3, num4);

	}
	
	public static void equationCheck(int a, int b, int c, int d) {
		
		int result = (a + b) * c / d % 5;
		System.out.println("Result of equation is: "+result);
		
	}

}
