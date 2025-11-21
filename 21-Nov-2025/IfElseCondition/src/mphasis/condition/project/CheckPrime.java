package mphasis.condition.project;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");

		int a = scanner.nextInt();

		int c = 0;

		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				c++;
			}
			break;
		}

		System.out.println(c != 0 ? "Not - Prime" : "Prime");
	}

}
