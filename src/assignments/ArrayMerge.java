package assignments;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class ArrayMerge {

	public static void main(String[] args) {

		int[] arr1 = { 7, 1, 3, 4, 10, 6 };
		int[] arr2 = { 2, 8, 7, 9, 3, 5 };

		int[] mergedArr = new int[arr1.length + arr2.length];

		int i = 0, j = 0, k = 0;

		while (i < arr1.length) {

			mergedArr[k] = arr1[i];
			k++;
			i++;
		}

		while (j < arr2.length) {

			mergedArr[k] = arr2[j];
			k++;
			j++;
		}

		Arrays.sort(mergedArr);
		
//		for (int l = 0; l < mergedArr.length; l++) {
//
//			System.out.print(mergedArr[l] + " ");
//
//		}

        LinkedHashSet<Integer> s = new LinkedHashSet<Integer>();
        
		for (int m = 0; m < mergedArr.length; m++) {
			s.add(mergedArr[m]);	
			}
		
			System.out.print(s);

		// Answer - {1,2,3,4,5,6,7,8,9,10}

	}

}
