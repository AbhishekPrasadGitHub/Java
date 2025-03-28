package assignments;

public class Rectangle {

	public static void main(String[] args) {

		System.out.println(calculateArea(5, 4));
		System.out.println(calculateParameter(5, 4));

	}

	public static int calculateArea(int length, int width) {

		return length * width;
	}

	public static int calculateParameter(int length, int width) {

		return (length + width) * 2;
	}

}
