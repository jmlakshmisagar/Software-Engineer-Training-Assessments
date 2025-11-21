package com.mphasis.DayOneMavenProject;

public class BankingApplication {

	public static void main(String[] args) {
		
		 SavingAccount savingAccount = new SavingAccount(987654, "LX", "Saving", "12312", "CTS",1000);
		 
		 System.out.println(savingAccount);
		 
		 savingAccount.deposit(5000);
		 
		 System.out.println(savingAccount);

	}

}
