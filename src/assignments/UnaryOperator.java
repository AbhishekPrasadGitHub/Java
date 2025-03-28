package assignments;

import java.util.Scanner;

public class UnaryOperator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first integer: ");
		int num1 = sc.nextInt();	
		
		int result= num1--;
		System.out.println(result);

	}

}
