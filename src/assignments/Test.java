package assignments;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 58, 3, 4, 19, 2, 12, 23};
		int[] sortedArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];

				}
			sortedArr[i] = arr[i];
			}
			sortedArr[arr.length - 1] = arr[arr.length-1];
		}
		for(int i = 0; i < sortedArr.length; i++)
		System.out.print(sortedArr[i]+" ");

	}

}
