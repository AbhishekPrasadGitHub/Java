package assignments;

import java.util.Scanner;

public class ForLoopAssignment {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
//      table(num);
//      printPattern(num);
		printPyramid(num);
//      sumOfEvenNumbers(num);
		sc.close();
	}

	public static void table(int number) {

		System.out.println("Table of the number is: ");
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + "x" + i + "=" + (number * i));
		}

	}

	// print triangle
	public static void printPattern(int rows) {

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	// Print Pyramid
	public static void printPyramid(int rows) {
		// loop for rows
		for (int i = 1; i <= rows; i++) {
			// loop for printing space
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			// loop for printing value
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			// loop for move to next line
			System.out.println();
		}
	}

	// Sum of all even numbers between two numbers
	public static void sumOfEvenNumbers(int number) {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("Sum of all even numbers between 1 and " + number + " is: " + sum);
	}

}
