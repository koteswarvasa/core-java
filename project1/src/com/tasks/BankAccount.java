package com.tasks;

public class BankAccount {
	// Constructor Chaining

	long accountNumber;
	String holderName;
	double balance;

	BankAccount(long accountNumber) {
	  this.accountNumber = accountNumber;
	}

	BankAccount(long accountNumber, String holderName) {
		this(accountNumber);
		this.holderName=holderName;

	}

	BankAccount(long accountNumber, String holderName, double balance) {
		this(accountNumber, holderName);
		this.balance = balance;
	}

	void show() {
		System.out.println("**************************************");
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Account Holder Name : " + holderName);
		System.out.println("Account Balance : " + balance);
	}

	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount(96533392211L, "Koteswar", 5000);
		ba1.show();
	}

}
