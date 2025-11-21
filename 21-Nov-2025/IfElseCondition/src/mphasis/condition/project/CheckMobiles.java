package mphasis.condition.project;

import java.util.Scanner;

public class CheckMobiles {

	public void Checker(String mobileNumber) {
		if (mobileNumber.matches("^[6-9]\\d{9}$")) {
			System.out.println("Valid Mobile Number");
		} else {
			System.out.println("Invalid Mobile Number");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String mobilenumber = scanner.nextLine();

		CheckMobiles checkMobiles = new CheckMobiles();

		checkMobiles.Checker(mobilenumber);

	}

}
