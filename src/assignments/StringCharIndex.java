package assignments;

import java.util.ArrayList;

public class StringCharIndex {

	public static void main(String[] args) {

		String str = "aaaammmyyynaaoop";

		ArrayList<Integer> arrList = new ArrayList<Integer>();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a') {
				arrList.add(i);
			}
		}
		System.out.println("First index of a is - " + arrList.get(0));
		System.out.println("Last index of a is - " + arrList.get(arrList.size() - 1));

	}

}
