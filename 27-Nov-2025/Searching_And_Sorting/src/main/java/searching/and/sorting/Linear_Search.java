package searching.and.sorting;

import java.util.Scanner;

public class Linear_Search {

	public static void main(String[] args) {
		int arr[] = { 78, 58, 41, 45, 84, 62, 64, 84, 6, 468, 32, 165, 48, 4, 654, 84, 6, 465, 468, 1654, 8 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the search element : ");

		int key = scanner.nextInt();
		int i = 0;
		for (; i < arr.length; ++i) {
			if (arr[i] == key) {
				System.out.println("Element found at : " + (i + 1));
				break;
			}
		}
		if (i == arr.length) {
			System.out.println("not found");
		}
	}

}
