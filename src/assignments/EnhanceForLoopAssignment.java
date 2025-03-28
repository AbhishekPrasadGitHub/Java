package assignments;

import java.util.Scanner;

public class EnhanceForLoopAssignment {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		int length = sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[] numbers = new int[length];
		for (int i = 0; i < length; i++) {
			numbers[i] = sc.nextInt();
		}
		// int[] numbers = { 4, 2, 10, 7, 90, 9, 5 };
		printArrayNumbers(numbers);
		findLargestNumber(numbers);
		sumOfArrayElements(numbers);
		sc.close();
	}

	public static void printArrayNumbers(int[] numbers) {
		System.out.println("Array elements: ");
		for (int a : numbers) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

	public static void findLargestNumber(int[] numbers) {
		int max = numbers[0];
		for (int a : numbers) {
			if (a > max) {
				max = a;
			}
		}
		System.out.println("Largest number in array is: " + max);
	}

	public static void sumOfArrayElements(int[] numbers) {
		int sum = 0;
		for (int a : numbers) {
			sum = sum + a;
		}
		System.out.println("Sum of all array element is: " + sum);

	}

}