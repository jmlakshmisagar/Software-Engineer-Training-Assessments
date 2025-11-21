package com.bankapp.model;

public class CurrentAccount extends Account {
	private double overdraftLimit;

	public CurrentAccount(String accNo, String name, double bal, String pinCode, double overdraftLimit) {
		super(accNo, name, bal, pinCode);
		this.overdraftLimit = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}
}
