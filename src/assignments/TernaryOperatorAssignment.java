package assignments;

import java.util.Scanner;

public class TernaryOperatorAssignment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter first integer: ");
//		int num1 = sc.nextInt();
//		System.out.println("Enter second integer: ");
//		int num2 = sc.nextInt();
		System.out.println("Enter score: ");
		int score = sc.nextInt();
		
//		findGreaterNumber(num1, num2);
		gradeScore(score);
	
	}
	
	public static void findGreaterNumber(int a, int b) {
        
		int result = a>b ? a : b ;
		
		if (result == a)
			System.out.println(a+" is greater than "+b);
		else
			System.out.println(b+" is greater than "+a);
		
	}
	
	public static void gradeScore(int score) {
		
		String grade = (score <= 100) ? ((score >= 90) ? "A" : "B")	 : ((score <= 80) ? "C" : "D");
		
		System.out.println(grade);
		
	}

}
