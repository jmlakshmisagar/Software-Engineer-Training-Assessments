package com.mphasis.DayOneMavenProject;

public class SavingAccount extends Account {

	private double balance;

	public SavingAccount(long accNo, String holderName, String accType, String ifscCode,
			String branchName, double balance) {
		super(accNo, holderName, accType, ifscCode, branchName);
		this.balance = balance;
	}

	public void withdraw(double amount) {
		if (amount < this.balance) {
			this.balance -= amount;
			System.out.println("Amount Withrawn Succesfully");
		}else {
			System.err.println("Insuffient Funds");
		}
	}

	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("Amount Deposited Succesfully");
	}

	public double checkBalance() {
		return getBalance();
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	// code for chage pin and somthinfg

	@Override
	public String toString() {
		return "SavingAccount [Balance=" + balance + ", AccountNumber=" + getAccNo() + ", Holder Name="
				+ getHolderName() + ", Account Number=" + getAccType() + ", IFSC=" + getIfscCode()
				+ ", Branch Name=" + getBranchName() + ", PIN= " + getPinNumber() + ", Balance="+getBalance()+ "]";
	}

}
