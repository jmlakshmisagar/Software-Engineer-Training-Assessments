package mphasis.condition.project;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		int result = 0;

		while (num != 0) {
			int temp = num % 10;
			result = result * 10 + temp ;
			num /= 10;
		}

		System.out.println(result);
		
	}

}

