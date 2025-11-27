package searching.and.sorting;

public class BSearch {

	public static void main(String[] args) {
		int arr[] = { 4, 6, 6, 8, 32, 41, 45, 48, 58, 62, 64, 78, 84, 84, 84, 165, 468, 465, 468, 654, 1654 };

		int i = 0, j = arr.length - 1, mid, key = 1654;

		while (i <= j) {
			mid = (i + j) / 2;
			if (arr[mid] == key) {
				System.out.println("found" + (mid + 1));
				break;
			} else {
				if (arr[mid] < key) {
					i = mid + 1;
				} else {
					j = mid - 1;
				}
			}
		}

		if (i > j) {
			System.out.println("not found");
		}
	}

}
