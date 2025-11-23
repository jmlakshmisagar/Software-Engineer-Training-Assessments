package Dynamic_Array;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DynamicArray array = new DynamicArray();

		while (true) {
			System.out.println("\n=== Dynamic Array Menu ===");
			System.out.println("1. Add Element");
			System.out.println("2. Get Element");
			System.out.println("3. Remove Element");
			System.out.println("4. Display Array");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");

			int choice = sc.nextInt();

			switch (choice) {

			case 1 -> {
				System.out.print("Enter element: ");
				array.add(sc.nextInt());
				System.out.println("✔ Element added.");
			}

			case 2 -> {
				System.out.print("Enter index: ");
				try {
					System.out.println("Element: " + array.get(sc.nextInt()));
				} catch (Exception e) {
					System.out.println("❌ " + e.getMessage());
				}
			}

			case 3 -> {
				System.out.print("Enter index to remove: ");
				try {
					array.remove(sc.nextInt());
					System.out.println("✔ Element removed.");
				} catch (Exception e) {
					System.out.println("❌ " + e.getMessage());
				}
			}

			case 4 -> {
				System.out.println("Array: " + array);
			}

			case 5 -> {
				System.out.println("Exiting...");
				return;
			}

			default -> System.out.println("❌ Invalid choice.");
			}
		}
	}
}
