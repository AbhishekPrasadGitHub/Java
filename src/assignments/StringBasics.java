package assignments;

import java.util.Scanner;

public class StringBasics {

	public static void main(String[] args) {

//		String tool, lang;
//		tool = "Selenium";
//		lang = "SELENiUM";
//		String name = "Abhishek Prasad";
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the string");
		
		String input = sc.nextLine();
		
		System.out.println("String: "+input);
		
		

	//	stringPalindromeCheck("daabbaad");
//		int check = palindromeCheck("dadadad");
//		if(check == 1)
//			System.out.println("Palindrome");
//		else if(check == 0)
//			System.out.println("Not Palindrome");

		// Basics
//		System.out.println("Name length: "+tool.length());
//		System.out.println(tool+lang);
//		System.out.println(tool.concat(lang));
//		
//		//String Methods
//		System.out.println(tool.toUpperCase());
//		System.out.println(tool.toLowerCase());
//		System.out.println(name.substring(9));
//		System.out.println(name.replace('a', 'e'));

//		//String Comparison
//		System.out.println(tool.equals(lang));
//		System.out.println(tool.equalsIgnoreCase(lang));
//		System.out.println(name.startsWith("Abhi"));
//		System.out.println(name.endsWith("sad"));
//		System.out.println(name.indexOf('P'));

		// String tool = "Playwright";

	}

//	public static void stringPalindromeCheck(String abc) {
//
//		int count = 0;
//		for (int i = 0; i < abc.length() - 1; i++) {
//
//			if (abc.charAt(i) == abc.charAt(abc.length() - 1 - i)) {
//				count++;
//				continue;
//			}
//		}
//		System.out.println(count);
//		if (count == abc.length() - 1)
//			System.out.println("Palindrome");
//		else
//			System.out.println("Not Palindrome");
//
//	}
	
	//another way
	
	public static int palindromeCheck(String abc) {
		
		int leftIndex = 0;
		int rightIndex = abc.length()-1;
		
		while(leftIndex < rightIndex) {
			
			if(abc.charAt(leftIndex) != abc.charAt(rightIndex)) {
				 return 0;
			}
			leftIndex++;
			rightIndex--;
		}
		return 1;

	}	
		
	}

