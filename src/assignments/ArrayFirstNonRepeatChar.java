package assignments;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ArrayFirstNonRepeatChar {

	public static void main(String[] args) {

		String str = "interview";

//		 char ch = 'a';

		Map<Character, Integer> charCountMap = new LinkedHashMap<>();

		for (char ch : str.toCharArray()) {

			charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
		}

		char firstNonRepeatedChar = '\0';
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if (entry.getValue() == 1) {
				firstNonRepeatedChar = entry.getKey();
				break;
			}
		}

		if (firstNonRepeatedChar != '\0') {
			System.out.println("First non-repeated character: " + firstNonRepeatedChar);
		} else {
			System.out.println("No non-repeated character found.");
		}

//		for (int i = 0; i < str.length(); i++) {
//
//			boolean found = false;
//
//			for (int j = 0; j < str.length(); j++) {
//				if (i != j && str.charAt(i) == str.charAt(j)) {
//					found = true;
//					break;
//				}
//			}
//
//			if (found == false) {
//				System.out.println(str.charAt(i));
//				break;
//			}
//		}

	}

}
