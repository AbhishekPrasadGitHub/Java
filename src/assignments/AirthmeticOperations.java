package assignments;

import java.util.Scanner;

public class AirthmeticOperations {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		
		calculationCheck(num1, num2);

	}

	public static void calculationCheck(int number1, int number2) {
		
	//	number1++;

		System.out.println("Additon of " + number1 + " and " + number2 + " is: " + (number1 + number2));
		System.out.println("Substraction of " + number2 + " from " + number1 + " is: " + (number1 - number2));
		System.out.println("Multiplication of " + number1 + " and " + number2 + " is: " + (number1 * number2));
		System.out.println("Division of " + number1 + " by " + number2 + " is: " + (number1 / number2));
		System.out.println("Modulus of " + number1 + " with " + number2 + " is: " + (number1 % number2));

	}

}
