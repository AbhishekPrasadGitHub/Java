package assignments;

import java.util.ArrayList;
import java.util.List;

public class ListReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> arr = new ArrayList<>();

		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);

		System.out.println("List before reversing " + arr);

		reverseList(arr);

	}

	public static void reverseList(List<Integer> arr) {

		int j = arr.size() - 1;

		for (int i = 0; i < arr.size(); i++) {

			if (i < j) {

				int temp = arr.get(j);
				arr.set(j, arr.get(i));
				arr.set(i, temp);
			}
			j--;

		}

		System.out.println("List after reversing " + arr);
	}

}
