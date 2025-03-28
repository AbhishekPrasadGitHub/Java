package javatraining;

public class ComparisonOperatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value1 = 9;
		int value2 = 7;

		if (value1 == value2)
			System.out.println("Value1 is equal to value2");
		value1 = value1 - value2;

		if (value1 != value2)
			System.out.println("Value 1 not equal to value2");
		else if (value1 > value2)
			System.out.println("Value 1 is greater than value2");

		if (value1 < value2)
			System.out.println("Value 1 is less than value2");

	}

}
