package assignments;

import java.util.HashMap;

public class StringCharacterCount {

	public static void main(String[] args) {

		String str = "Selenium";

		characterCount(str);

		boolean[] arr = new boolean[str.length()];

		for (int i = 0; i < str.length(); i++) {

			if (arr[i]) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					arr[j] = true;
					count++;
				}
			}
			System.out.println(str.charAt(i) + " - " + count);

		}

	}

	public static void characterCount(String str) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		char[] charArr = str.toLowerCase().toCharArray();

		for (char e : charArr) {

			if (!String.valueOf(e).isBlank()) {
				if (map.containsKey(e)) {
					map.put(e, map.get(e) + 1);
				} else {
					map.put(e, 1);
				}
			}
		}
		System.out.println(map);

	}

}
