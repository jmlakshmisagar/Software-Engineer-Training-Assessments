package com.bankapp.service;

import com.bankapp.model.SavingsAccount;
import com.bankapp.util.PinGenerator;

public class SavingsAccountService {

	public void deposit(SavingsAccount acc, double amount) {
		acc.setBalance(acc.getBalance() + amount);
		System.out.println("Deposit successful.");
	}

	public void withdraw(SavingsAccount acc, double amount) {
		if (acc.getBalance() >= amount) {
			acc.setBalance(acc.getBalance() - amount);
			System.out.println("Withdrawal successful.");
		} else {
			System.out.println("Insufficient balance.");
		}
	}

	public void checkBalance(SavingsAccount acc) {
		System.out.println("Balance: " + acc.getBalance());
	}

	public void changePin(SavingsAccount acc, int newPin) {
		acc.setPin(newPin);
		System.out.println("PIN updated.");
	}

	public void generatePin(SavingsAccount acc) {
		int newPin = PinGenerator.generatePin(acc.locationPincode);
		acc.setPin(newPin);
		System.out.println("Generated PIN: " + newPin);
	}

	public void showDetails(SavingsAccount acc) {
		System.out.println("\n===== ACCOUNT DETAILS =====");
		System.out.println("Account Number : " + acc.getAccountNumber());
		System.out.println("Holder Name    : " + acc.getAccountHolderName());
		System.out.println("Balance        : " + acc.getBalance());
		System.out.println("PIN            : " + acc.getPin());
		System.out.println("Location PIN   : " + acc.locationPincode);
	}
}
