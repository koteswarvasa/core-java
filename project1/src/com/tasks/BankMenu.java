package com.tasks;

import java.util.Scanner;

public class BankMenu {
	static Scanner sc = new Scanner(System.in);
	static double balance=5000;

	public static void checkBalance() {
		System.out.println("Balance : " + balance);
	}

	public static void depositeMoney() {
		System.out.println("Enter Deposite Money: ");
		double depositeM = sc.nextDouble();
		if (depositeM >= 0 && depositeM <= 20000) {
			balance += depositeM;
			System.out.println("Deposite Successfull !!....");
			System.out.println("Remaining Balance: " + balance);
		}else {
			System.out.println("Deposite Unsuccessfull !! limit Exceed...");
		}
	}

	public static void withdrawMoney() {
		System.out.println("Enter Deposite Money: ");
		double withdrawM = sc.nextDouble();
		if (withdrawM >= 0 && withdrawM <= balance) {
			balance -= withdrawM;
			System.out.println("Withdraw Successfull !!....");
			System.out.println("Remaining Balance: " + balance);
		}else {
			System.out.println("Not Suffcient Balance and Withdrawl Unsuccessfull !....");
		}
	}

	public static void main(String[] args) {
		String s;

		do {
			System.out.println("===== Bank Menu ====");
			System.out.println("1.Check Balance");
			System.out.println("2.Deposite Money");
			System.out.println("3.Withdraw Money");
			System.out.println("4.Exit");

			System.out.println("Enter your Choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1 -> checkBalance();
		            
			case 2 -> depositeMoney();
			case 3 -> withdrawMoney();
			case 4 -> System.out.println("Exit !!...");
			default -> System.out.println("Invalid Choice !!...");
			}
			System.out.println();
			System.out.println("do you want continue press yes or else press no");
			s = sc.next();
		} while (s.equals("yes"));
	}
}
