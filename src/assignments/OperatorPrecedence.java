package assignments;

public class OperatorPrecedence {

	public static void main(String[] args) {
		
		int result1 = 10 + 5 * 2;
		System.out.println(result1);
		int result2 = (10 + 5) * 2;
		System.out.println(result2);
		int result3 = 20 / 4 - 2;
		System.out.println(result3);
		int result4 = 20 / (4 - 2);
		System.out.println(result4);

	}

}
