package assignments;

import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first integer: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second integer: ");
		int num2 = sc.nextInt();
		System.out.println("Enter third integer: ");
		int num3 = sc.nextInt();
		
		if(num1>num2) {
			if(num2>num3)
			System.out.println("First number is greater than second and "
					+ "second is greater than third");
		}
		else
			System.out.println("First number is not greater than second and "
					+ "second is not greater than third");

	}

}
