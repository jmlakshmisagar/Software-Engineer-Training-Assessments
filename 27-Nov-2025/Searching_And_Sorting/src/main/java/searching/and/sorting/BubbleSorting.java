package searching.and.sorting;

public class BubbleSorting {
	public static void main(String[] args) {
		int arr[] = { 78, 58, 41, 45, 84, 62, 64, 84, 6, 468, 32, 165, 48, 4, 654, 84, 6, 465, 468, 1654, 8 };
		int n = arr.length ;
		System.out.println("Before sorting.....");
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}  
		}

		for (int i = 0; i < n - 1; i++) { 
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println("After sorting...");
		for (int i : arr)
			System.out.print(i + " ");
	}
}
