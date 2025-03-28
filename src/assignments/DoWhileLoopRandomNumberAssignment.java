package assignments;

import java.util.Random;
import java.util.Scanner;

public class DoWhileLoopRandomNumberAssignment {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int randomNumber;
		int number;
		do {

			randomNumber = random.nextInt(100);
			System.out.println("Guess the number: ");
			number = sc.nextInt();
			System.out.println("System generated number is: " + randomNumber);
			if (number == randomNumber) {
				System.out.println("Number Matched");
			} else
				System.out.println("Number not matched");
		} while (number != randomNumber);
		sc.close();

	}

}
