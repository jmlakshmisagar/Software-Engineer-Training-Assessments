package searching.and.sorting;

public class SelectionSorting {
	public static void main(String[] args) {
		int arr[] = { 78, 58, 41, 45, 84, 62, 64, 84, 6, 468, 32, 165, 48, 4, 654, 84, 6, 465, 468, 1654, 8 };
		int n = arr.length;

		System.out.println("Before sorting.....");
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();

		for (int i = 0; i < n - 1; i++) {
			int mini = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[mini]) {
					mini = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[mini];
			arr[mini] = temp;
		}

		System.out.println("After sorting...");
		for (int i : arr)
			System.out.print(i + " ");

	}
}
