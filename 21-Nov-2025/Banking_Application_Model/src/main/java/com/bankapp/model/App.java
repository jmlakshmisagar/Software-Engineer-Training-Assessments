package com.bankapp.model;

import com.bankapp.menu.AccountCreationMenu;
import com.bankapp.menu.SavingsAccountMenu;
import com.bankapp.menu.CurrentAccountMenu;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		AccountCreationMenu creationMenu = new AccountCreationMenu();

		Account account = null;

		while (true) {
			System.out.println("\n========== MAIN MENU ==========");
			System.out.println("1. Create Account");
			System.out.println("2. Savings Account Menu");
			System.out.println("3. Current Account Menu");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				account = creationMenu.createAccount();
				System.out.println("Account Created Successfully.");
				break;

			case 2:
				if (account instanceof SavingsAccount) {
					SavingsAccountMenu sm = new SavingsAccountMenu();
					sm.showSavingsMenu((SavingsAccount) account);
				} else {
					System.out.println("No Savings Account exists. Create one first.");
				}
				break;

			case 3:
				if (account instanceof CurrentAccount) {
					CurrentAccountMenu cm = new CurrentAccountMenu();
					cm.showCurrentMenu((CurrentAccount) account);
				} else {
					System.out.println("No Current Account exists. Create one first.");
				}
				break;

			case 4:
				System.out.println("Exiting application...");
				System.exit(0);

			default:
				System.out.println("Invalid choice. Try again.");
			}
		}
	}
}
