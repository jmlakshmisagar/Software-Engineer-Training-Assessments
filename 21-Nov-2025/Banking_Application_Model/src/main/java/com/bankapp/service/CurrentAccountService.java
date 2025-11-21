package com.bankapp.service;

import com.bankapp.model.CurrentAccount;
import com.bankapp.util.PinGenerator;

public class CurrentAccountService {

	public void deposit(CurrentAccount acc, double amount) {
		acc.setBalance(acc.getBalance() + amount);
		System.out.println("Deposit successful.");
	}

	public void withdraw(CurrentAccount acc, double amount) {
		double totalLimit = acc.getBalance() + acc.getOverdraftLimit();

		if (totalLimit >= amount) {
			acc.setBalance(acc.getBalance() - amount);
			System.out.println("Withdrawal successful.");
		} else {
			System.out.println("Overdraft limit exceeded.");
		}
	}

	public void checkBalance(CurrentAccount acc) {
		System.out.println("Balance: " + acc.getBalance());
		System.out.println("Overdraft Limit: " + acc.getOverdraftLimit());
	}

	public void changePin(CurrentAccount acc, int newPin) {
		acc.setPin(newPin);
		System.out.println("PIN updated.");
	}

	public void generatePin(CurrentAccount acc) {
		int newPin = PinGenerator.generatePin(acc.locationPincode);
		acc.setPin(newPin);
		System.out.println("Generated PIN: " + newPin);
	}

	public void showDetails(CurrentAccount acc) {
		System.out.println("\n===== ACCOUNT DETAILS =====");
		System.out.println("Account Number : " + acc.getAccountNumber());
		System.out.println("Holder Name    : " + acc.getAccountHolderName());
		System.out.println("Balance        : " + acc.getBalance());
		System.out.println("PIN            : " + acc.getPin());
		System.out.println("Location PIN   : " + acc.locationPincode);
		System.out.println("Overdraft Limit: " + acc.getOverdraftLimit());
	}
}
