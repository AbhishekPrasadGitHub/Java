package assignments;

import java.util.Scanner;

public class StudentScore {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student's score: ");
		int score = sc.nextInt();

		examResult(score);

	}

	public static void examResult(int score) {

		System.out.print("Student scored: ");
		if (score >= 40 && score <= 75)
			System.out.print("Pass");
		else if (score > 75)
			System.out.print("Distinction");
		else
			System.out.print("Fail");
	}

}
