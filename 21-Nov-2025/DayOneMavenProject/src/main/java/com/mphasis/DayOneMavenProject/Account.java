package com.mphasis.DayOneMavenProject;

abstract public class Account {

	private long accNo;
	private String holderName;
	private String accType;
	private String ifscCode;
	private String branchName;
	private int pinNumber;

	public Account(long accNo, String holderName, String accType, String ifscCode, String branchName) {
		super();
		this.accNo = accNo;
		this.holderName = holderName;
		this.accType = accType;
		this.ifscCode = ifscCode;
		this.branchName = branchName;
		this.pinNumber = generatePinCode();
	}

	private int generatePinCode() {
		int newPin = (int) Math.round(Math.random() * 10000);
		return newPin;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public int getPinNumber() {
		return pinNumber;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", holderName=" + holderName + ", accType=" + accType + ", ifscCode="
				+ ifscCode + ", branchName=" + branchName + ", pinNumber=" + pinNumber + "]";
	}
	
	public abstract void withdraw(double amount);
	
	public abstract void deposit(double amount);

}
