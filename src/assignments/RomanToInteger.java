package assignments;

public class RomanToInteger {

	public static void main(String[] args) {
		

		System.out.println(romanToInt("XXVII"));
		
	}

	public static int romanToInt(String s) {

		char[] arr = s.toCharArray();

		int num = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] == 'I' && arr[i + 1] == 'V') {
				return 4;
			}
			if (arr[i] == 'I' && arr[i + 1] == 'X') {
				return 9;
			}
			if (arr[i] == 'X' && arr[i + 1] == 'L') {
				return 40;
			}
			if (arr[i] == 'X' && arr[i + 1] == 'C') {
				return 90;
			}
			if (arr[i] == 'C' && arr[i + 1] == 'D') {
				return 400;
			}
			if (arr[i] == 'C' && arr[i + 1] == 'M') {
				return 900;
			}
			if (arr[i] == 'I')
				num = num + 1;
			else if (arr[i] == 'V')
				num = num + 5;
			else if (arr[i] == 'X')
				num = num + 10;
			else if (arr[i] == 'L')
				num = num + 50;
			else if (arr[i] == 'C')
				num = num + 100;
			else if (arr[i] == 'D')
				num = num + 500;
			else if (arr[i] == 'M')
				num = num + 1000;

		}
		return num;

	}

}
