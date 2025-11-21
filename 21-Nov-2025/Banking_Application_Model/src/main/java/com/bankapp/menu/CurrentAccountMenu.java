package com.bankapp.menu;

import com.bankapp.model.CurrentAccount;
import com.bankapp.service.CurrentAccountService;
import java.util.Scanner;

public class CurrentAccountMenu {

	public void showCurrentMenu(CurrentAccount account) {
		CurrentAccountService service = new CurrentAccountService();
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("\n===== CURRENT ACCOUNT MENU =====");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance + Overdraft");
			System.out.println("4. Change PIN");
			System.out.println("5. Generate PIN");
			System.out.println("6. Show Account Details");
			System.out.println("7. Exit to Main Menu");
			System.out.print("Enter choice: ");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.print("Enter amount: ");
				service.deposit(account, sc.nextDouble());
				break;

			case 2:
				System.out.print("Enter amount: ");
				service.withdraw(account, sc.nextDouble());
				break;

			case 3:
				service.checkBalance(account);
				break;

			case 4:
				System.out.print("Enter new PIN: ");
				service.changePin(account, sc.nextInt());
				break;

			case 5:
				service.generatePin(account);
				break;

			case 6:
				service.showDetails(account);
				break;

			case 7:
				run = false;
				break;

			default:
				System.out.println("Invalid choice.");
			}
		}
	}
}
