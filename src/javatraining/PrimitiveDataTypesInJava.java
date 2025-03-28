package javatraining;

public class PrimitiveDataTypesInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		byte localNumber; //8 bit integer
//		short taxAmount;  //16 bit integer
//		int monthlySalary; // 32 bit integer
//		long annualSalary; // 64 bit integer

		// localNumber = 127;

		double result = addTwoDecimals(54.2, 89.3);
		System.out.println(result);

		char EmpLevel = 'A'; // 16 bit unicode characters
		EmpLevel = '\u0000';

	}

	public static double addTwoDecimals(double decimalNumber1, double decimalNumber2) {
		return (decimalNumber1 * decimalNumber2);

	}

}
