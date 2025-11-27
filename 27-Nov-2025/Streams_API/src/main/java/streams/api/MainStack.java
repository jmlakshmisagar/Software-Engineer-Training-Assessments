
package streams.api;

import java.util.Scanner;

public class MainStack {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n--- Stack Menu ---");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				MyStack.push(scanner);
				break;
			case 2:
				MyStack.pop();
				break;
			case 3:
				MyStack.display();
				break;
			case 4:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice! Try again.");
			}
		} while (choice != 4);

		scanner.close();
	}
}
