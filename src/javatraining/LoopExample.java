package javatraining;

public class LoopExample {

	public static void main(String[] args) {

		int[] side = { 2, 4, 5, 6 };

		int[] area = new int[side.length];

		System.out.println("Area of sides using convention 'for' loop: ");

		for (int i = 0; i < side.length; i++) {
			area[i] = side[i] * side[i];
			System.out.println(area[i]);
		}
		System.out.println();
		System.out.println("Area of sides using enhanced 'for' loop: ");

		int[] areaWithEnhancedLoop = new int[side.length];

		int i = 0;
		for (int oneSideAtATime : side) {
			areaWithEnhancedLoop[i] = oneSideAtATime * oneSideAtATime;
			System.out.println(areaWithEnhancedLoop[i]);
			i = i + 1;
		}

	}

}
