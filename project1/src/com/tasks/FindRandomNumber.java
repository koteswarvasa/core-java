package com.tasks;

import java.util.Random;
import java.util.Scanner;

public class FindRandomNumber {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Random rd = new Random();
		int random = rd.nextInt(1111,9999);
		
		System.out.println(random);

		
		for(int i=3;i>=1;) {
			System.out.println("Enter a Random Number: ");
			int a = sc.nextInt();
			int n=--i;
		if(a==random) {
			 System.out.println("Congratulation !...");
			 break;
		}else if(i==0){
			System.out.println("exit");
			break;
		}else {
			System.out.println("we have "+n+" attempts left try again!");
		}
		}
	}
}
