package streams.api;

import java.util.Scanner;

public class MainQueue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n--- Queue Menu ---");
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1 -> QueueArray.push(scanner);
			case 2 -> QueueArray.pop();
			case 3 -> QueueArray.display();
			case 4 -> System.out.println("Exiting...");
			default -> System.out.println("Invalid choice! Try again.");
			}
		} while (choice != 4);

		scanner.close();
	}
}
