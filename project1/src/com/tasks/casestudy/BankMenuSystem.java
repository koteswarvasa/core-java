package com.tasks.casestudy;

import java.util.Scanner;

public class BankMenuSystem {
	static Scanner sc = new Scanner(System.in);
	static double balance =5000;

	public static void checkBalance() {
		System.out.println("Current Balance: "+balance);
	}
	
	public static void depositMoney() {
		System.out.println("Enter Deposit Money: ");
		double depositM = sc.nextDouble();
		
		balance+=depositM;
		
		System.out.println("Updated Amount after Deposit Money: "+balance);
		
	}
	
	public static void withdrawMoney() { 
		System.out.println("Enter How much amount to withdrawl: ");
		double withdrawM = sc.nextDouble();
		
		if(balance<withdrawM) {
			System.out.println("Insufficient Balance !.....");
		}else {
			balance -= withdrawM;
			System.out.println("Updated Amount after Withdrawl money: "+balance);
		}
	}
	
	
     public static void main(String[] args) {
        while(true) {
		System.out.println("======== Bank Menu System ========");
		String s = "1.Check Balance\n" + "2.Deposit Money\n" + "3.WithDraw Money\n" + "4.Exit";

		System.out.println(s);

		System.out.println();
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		
		if(choice ==0) {
			System.out.println("Exiting...");
			break;
		}
		
		switch(choice) {
		case 1 -> checkBalance();
		case 2 -> depositMoney();
		case 3 -> withdrawMoney();
		case 4 -> System.out.println("Thank-you and Terminate");
		default -> System.out.println("Invalid Choice");
		}
		System.out.println();
	}
	}
}
