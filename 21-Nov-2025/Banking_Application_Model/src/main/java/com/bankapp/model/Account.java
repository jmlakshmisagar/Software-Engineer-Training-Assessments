package com.bankapp.model;

public abstract class Account {
	protected String accountNumber;
	protected String accountHolderName;
	protected double balance;
	protected int pin;
	public String locationPincode;

	public Account(String accountNumber, String holder, double balance, String pinCode) {
		this.accountNumber = accountNumber;
		this.accountHolderName = holder;
		this.balance = balance;
		this.locationPincode = pinCode;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
