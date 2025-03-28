package assignments;

public class QuickSort {

	public static void quickSort(int[] arr, int low, int high) {

		if (low < high) {

			int pidex = partition(arr, low, high);

			quickSort(arr, low, pidex - 1);
			quickSort(arr, pidex + 1, high);

		}

	}

	public static int partition(int[] arr, int low, int high) {

		int i = low - 1;
		int pivot = arr[high];

		for (int j = low; j < high; j++) {

			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}

		}
		i++;
		int temp = arr[i];
		arr[i] = pivot ;
		arr[high] = temp;
		return i;

	}

	public static void main(String[] args) {

		int[] arr = { 6, 5, 8, 2, 3, 4 };

		int n = arr.length;

		quickSort(arr, 0, n - 1);
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
