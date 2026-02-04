package com.tasks;

import java.util.Scanner;

public class Bank {
	static String BRANCH_NAME = "Royapeta";
	static long IFSC = 887586683;

	int accountNumber(int aNumber) {
		return aNumber;
	}

	String accountHolderName(String aHName) {
		return aHName;
	}

	double deposit(double depositAmount) {
		return depositAmount;
	}

	static double savingAmount() {
		return 5000;
	}

	void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number: ");
		int aNumber = sc.nextInt();
		int aN = accountNumber(aNumber);
		sc.nextLine();

		System.out.println("Enter Account Holder Name:");
		String aHName = sc.nextLine();
		String aHN = accountHolderName(aHName);

		System.out.println("Enter deposite amount");
		double depositAmount = sc.nextDouble();
		double d = deposit(depositAmount);

		double s = savingAmount();

		double totalAmount = d + s;

		System.out.println();

		System.out.println("====== Account Details ========");
		System.out.println("Branch Name: " + BRANCH_NAME);
		System.out.println("IFSC Number: " + IFSC);
		System.out.println("Account Number: " + aN);
		System.out.println("Account Holder Name: " + aHN);
		System.out.println("Saving Amount: " + s);
		System.out.println("Deposit Amount: " + d);
		System.out.println("Total Amount: " + totalAmount);

		sc.close();

	}
}
