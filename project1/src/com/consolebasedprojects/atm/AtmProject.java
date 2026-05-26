

package com.consolebasedprojects.atm;

import java.util.Scanner;

public class AtmProject extends AtmProjectAbstract {

	static Scanner sc = new Scanner(System.in);

	PojoAtm user = new PojoAtm();

	public AtmProject(PojoAtm user) {

		this.user = user;
	}

	@Override
	public void deposit(double amount) {

		if (amount > 0) {

			double balance = user.getBalance();

			balance = amount + balance;

			user.setBalance(balance);

			System.out.println("Deposit Successful");

			System.out.println("Updated Balance: "
					+ user.getBalance());

		} else {

			System.out.println("Invalid Amount");
		}
	}

	@Override
	public void withdraw(double amount) {

		double balance = user.getBalance();

		if (amount > 0 && amount <= balance) {

			balance = balance - amount;

			user.setBalance(balance);

			System.out.println("Withdraw Successful");

			System.out.println("Remaining Balance: "
					+ user.getBalance());

		} else {

			System.out.println("Insufficient Balance");
		}
	}

	@Override
	public Double checkBalance() {

		return user.getBalance();
	}

	public void showDetails() {

		System.out.println("Account Number : "
				+ user.getAccountNumber());

		System.out.println("User Name : "
				+ user.getUserName());

		System.out.println("Balance : "
				+ user.getBalance());
	}

}