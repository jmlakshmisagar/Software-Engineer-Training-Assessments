package searching.and.sorting;

public class InsertionSorting {

	public static void main(String[] args) {
		int arr[] = { 78, 58, 41, 45, 84, 62, 64, 84, 6, 468, 32, 165, 48, 4, 654, 84, 6, 465, 468, 1654, 8 };
		int n = arr.length;

		System.out.println("Before sorting.....");
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();

		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}

		System.out.println("After sorting...");
		for (int i : arr)
			System.out.print(i + " ");
	}

}
