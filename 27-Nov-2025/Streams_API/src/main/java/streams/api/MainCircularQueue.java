
package streams.api;

import java.util.Scanner;

public class MainCircularQueue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n--- Circular Queue Menu ---");
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1 -> DemoOnCircularQueue.push(scanner);
			case 2 -> DemoOnCircularQueue.pop();
			case 3 -> DemoOnCircularQueue.display();
			case 4 -> System.out.println("Exiting...");
			default -> System.out.println("Invalid choice! Try again.");
			}
		} while (choice != 4);

		scanner.close();
	}
}
