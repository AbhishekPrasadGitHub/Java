package assignments;

import java.util.Scanner;

public class ArrayAssignments {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array elements: ");
		int length = sc.nextInt();
		int[] arrayInt = new int[length];
		System.out.println("Enter the elements of array: ");

		for (int i = 0; i < length; i++) {
			arrayInt[i] = sc.nextInt();
		}

		System.out.println("Enter the target element: ");
		int target = sc.nextInt();
//		System.out.println("Enter the elements you want to search in array: ");
//		int element = sc.nextInt();
//
//		System.out.println("Enter the index by which you want to rotate array: ");
//		int rotateBy = sc.nextInt();
//
//		sumOfElements(arrayInt);
//		maxAndMin(arrayInt);
//		reverseArray(arrayInt);
//		countEvenAndOdd(arrayInt);
//		searchElement(arrayInt, element);
//		frequencyOfElement(arrayInt);
//		secondLargestElement(arrayInt);
//		rotateArray(arrayInt, rotateBy);
		int[] arr = twoSum(arrayInt, target);
		
		for(int a: arr)
			System.out.print(a+" ");
		
		sc.close();
	}

	// 1. Sum of elements
	public static void sumOfElements(int[] numbers) {

		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println("Sum of all elements: " + sum);
	}

	// 2. Maximum & Min
	public static void maxAndMin(int[] numbers) {
		int max = 0;
		int min = 0;
		for (int i = 0; i < numbers.length; i++) {
			min = numbers[0];
			if (numbers[i] > max)
				max = numbers[i];
			if (numbers[i] < min)
				min = numbers[i];
		}
		System.out.println("Maximum: " + max);
		System.out.println("Minimum: " + min);
	}

	// 3. Reverse of an array
	public static void reverseArray(int[] elements) {
		int j = elements.length - 1;
		for (int i = 0; i < elements.length; i++) {
			elements[i] = elements[i] + elements[j];
			elements[j] = elements[i] - elements[j];
			elements[i] = elements[i] - elements[j];
			j--;
			if (i >= j)
				break;

		}
		System.out.println("Array elements post reversal: ");
		for (int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + " ");
		}
	}

	// 4. Count even & odd numbers in array
	public static void countEvenAndOdd(int[] numbers) {
		int countEven = 0;
		int countOdd = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0)
				countEven++;
			else
				countOdd++;
		}
		System.out.println("Count of even numbers: " + countEven);
		System.out.println("Count of even numbers: " + countOdd);
	}

	// 5. Search an element in array
	public static void searchElement(int[] arrayInt, int element) {
		int index = -1;
		for (int i = 0; i < arrayInt.length; i++) {
			if (arrayInt[i] == element) {
				index = i;
				System.out.println("Element " + element + " is at " + index + " index in array");
				break;
			}
		}
		if (index == -1)
			System.out.println("Element " + element + " not found in array");

	}

	// 6. Frequency of Elements
	public static void frequencyOfElement(int[] arrayInt) {
		boolean[] arrayNew = new boolean[arrayInt.length];

		for (int i = 0; i < arrayInt.length; i++) {

			if (arrayNew[i] == true)
				continue;
			int count = 1;
			for (int j = i + 1; j < arrayInt.length; j++) {
				if (arrayInt[i] == arrayInt[j]) {
					arrayNew[j] = true;
					count++;
					// arrayNew[i] = count;
				}
			}
			System.out.print(arrayInt[i] + ":" + count + ",");
		}
	}

	// Second largest element
	public static void secondLargestElement(int[] numbers) {
		int max = 0;
		int secondLargest = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max)
				max = numbers[i];
		}
		for (int i = 0; i < numbers.length; i++) {
			if (max != numbers[i]) {
				if (numbers[i] > secondLargest)
					secondLargest = numbers[i];
			}
		}

//		int difference = max - numbers[0];
//		for (int i = 0; i < numbers.length; i++) {
//			if (max != numbers[i]) {
//				if (max - numbers[i] < difference) {
//					difference = max - numbers[i];
//					secondLargest = numbers[i];
//				}
//			}
//		}
		System.out.println("Second Largest element: " + secondLargest);
	}

	public static void rotateArray(int[] arrayInt, int rotateBy) {

		int n = arrayInt.length, d = rotateBy;
		int[] temp = new int[n - d];
		for (int i = 0; i < n - d; i++) {
			temp[i] = arrayInt[i];
		}
		for (int i = n - d; i < n; i++) {
			arrayInt[i - n + d] = arrayInt[i];
		}
		for (int i = 0; i < n - d; i++) {
			arrayInt[i + d] = temp[i];
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arrayInt[i] + " ");
		}
	}
	
   public static int[] twoSum(int[] nums, int target) {
        
//        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){

            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                     return new int[] {i, j};
                }
            }
            
        }
        return new int[] {};
    }

}
