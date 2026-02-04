package com.tasks.casestudy;

import java.util.Scanner;

public class Login_System {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int attempts=3;
		int count =0;
		do {
			System.out.println("Enter a password: ");
			String password = sc.next();
			count++;
			
			if(password.equals("java123")) {
				System.out.println("Access Granted");
				break;
			}else if(count==3) {
				System.out.println("Account Locked");
				break;
			}else {
				System.out.println("we have "+--attempts+" login attempts");
			}
			
		}while(count!=3);
	}
}
