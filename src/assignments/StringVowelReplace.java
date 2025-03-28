package assignments;

public class StringVowelReplace {

	public static void main(String[] args) {

		String str = "I am attending an Interview";

		String str2 = str.toLowerCase();

		char[] arr = new char[str2.length()];
		arr = str2.toCharArray();

		// a, e, i, o, u

		for (int i = 0; i < str2.length(); i++) {

			if (str2.charAt(i) == 'a' || str2.charAt(i) == 'e' || str2.charAt(i) == 'i' || str2.charAt(i) == '0'
					|| str2.charAt(i) == 'u')
				arr[i] = 'x';
		}

		System.out.println(arr);
	}

}
