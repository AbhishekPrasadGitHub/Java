package assignments;

import java.util.Arrays;

public class StringAnagramCheck {

	public static void main(String[] args) {

		
	System.out.println("Is anagram - "+anagramCheck("My Name is Abhishek", "Abhishek is my name"));
	
	}

	
	public static boolean anagramCheck(String s1, String s2) {
		
		if(s1.length() != s2.length()) {
			return false;
		}
		
		char[] arr1 = s1.toLowerCase().toCharArray();
		char[] arr2 = s2.toLowerCase().toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
		
	}
	


}
