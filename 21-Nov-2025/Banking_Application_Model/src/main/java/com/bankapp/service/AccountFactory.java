package com.bankapp.service;

import com.bankapp.model.*;

public class AccountFactory {

	public static SavingsAccount createSavings(String accNo, String name, double balance, String pinCode) {
		return new SavingsAccount(accNo, name, balance, pinCode);
	}

	public static CurrentAccount createCurrent(String accNo, String name, double balance, String pinCode,
			double overdraftLimit) {
		return new CurrentAccount(accNo, name, balance, pinCode, overdraftLimit);
	}
}
