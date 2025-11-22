package Day_Two_Mphasis;

import java.util.Arrays;

public class DynamicArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 88, 56, 1, 23, 0 };
		System.out.println(Arrays.toString(arr));
		String string = Arrays.toString(arr);

		System.out.println(string);
		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 2) {
				System.out.println("Present");
			} else {
				System.out.println("Not Present");
			}
		}

		System.out.println(Arrays.binarySearch(arr, 88));
		
		arr = Arrays.copyOf(arr, 15);
		
		for (int i : arr) {
			System.out.println(i);
		}
		
		System.out.println();
		Arrays.fill(arr, 80);
		for (int i : arr) {
			System.out.println(i);
		}
		
	}

}
