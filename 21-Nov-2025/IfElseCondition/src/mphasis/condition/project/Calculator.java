package mphasis.condition.project;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first number");
		int a = scanner.nextInt();

		System.out.println("Enter the second number");
		int b = scanner.nextInt();

		System.out.println("Enter the arithmatic operation : ");

		char op = scanner.next().charAt(0);

		switch (op) {
		case '+': {
			System.out.println(a + b);
			break;
		}
		case '-': {
			System.out.println(a - b);
			break;
		}
		case '*': {
			System.out.println(a * b);
			break;
		}
		case '/': {
			System.out.println(((double) a / b));
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + op);
		}

	}

}
