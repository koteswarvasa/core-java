package com.consolebasedprojects.atm;

import java.util.Scanner;

public class AtmMainDriver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PojoAtm user = new PojoAtm();

		user.setAccountNumber(1234567890L);

		user.setUserName("Koteswar");

		user.setBalance(10000);

		user.setPin(1234);

		AtmProject atm = new AtmProject(user);

		int attempts = 4;

		boolean loginSuccess = false;

		while (attempts > 0) {

			System.out.print("Enter 4-digit PIN: ");

			int enteredPin = sc.nextInt();

			if (enteredPin == user.getPin()) {

				System.out.println("Login Successful");

				loginSuccess = true;

				break;

			} else {

				attempts--;

				if (attempts > 0) {

					System.out.println("Incorrect PIN");

					System.out.println("Attempts Remaining: " + attempts);

				} else {

					System.out.println("You Entered Too Many Times Please Try Again");
				}
			}
		}

		if (loginSuccess) {

			int choice = 0;
			boolean flag = true;

			while (flag) {

				System.out.println("\n............WELCOME.............");

				System.out.println("1.Check Balance");

				System.out.println("2.Withdraw");

				System.out.println("3.Deposit");

				System.out.println("4.Account Details");

				System.out.println("5.Exit");

				System.out.println("Please enter choice: ");

				if (sc.hasNextInt()) {

					choice = sc.nextInt();

				} else {

					System.out.println("Please check your input");

					sc.next();

					continue;
				}

				switch (choice) {

				case 1:

					System.out.println("Balance: " + atm.checkBalance());

					break;

				case 2:

					System.out.print("Enter amount to withdraw: ");

					double withdrawAmount = sc.nextDouble();

					atm.withdraw(withdrawAmount);

					break;

				case 3:

					System.out.print("Enter amount to deposit: ");

					double depositAmount = sc.nextDouble();

					atm.deposit(depositAmount);

					break;

				case 4:

					atm.showDetails();

					break;

				case 5:

					System.out.println("..................Thank You.................");

					flag = false;

					break;

				default:

					System.out.println("Invalid Option");
				}
			}
		}

		sc.close();
	}
}