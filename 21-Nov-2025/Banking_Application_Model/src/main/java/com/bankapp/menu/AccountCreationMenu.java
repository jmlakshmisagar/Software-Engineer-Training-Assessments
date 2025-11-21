package com.bankapp.menu;

import com.bankapp.model.*;
import com.bankapp.service.AccountFactory;
import java.util.Scanner;

public class AccountCreationMenu {

	public Account createAccount() {

		Scanner sc = new Scanner(System.in);

		System.out.println("\n===== CREATE ACCOUNT =====");
		System.out.print("Enter Account Number: ");
		String accNo = sc.nextLine();

		System.out.print("Enter Account Holder Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Initial Balance: ");
		double balance = sc.nextDouble();

		System.out.print("Enter Location Pincode: ");
		String pinCode = sc.next();

		System.out.println("\nChoose Account Type:");
		System.out.println("1. Savings");
		System.out.println("2. Current");
		System.out.print("Enter choice: ");
		int choice = sc.nextInt();

		if (choice == 1) {
			return AccountFactory.createSavings(accNo, name, balance, pinCode);
		} else {
			System.out.print("Enter Overdraft Limit: ");
			double limit = sc.nextDouble();

			return AccountFactory.createCurrent(accNo, name, balance, pinCode, limit);
		}
	}
}
