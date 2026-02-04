package com.tasks;

import java.util.Scanner;

public class NeonNumber {
	static Scanner sc = new Scanner(System.in);
	
	static boolean isNeonNumber(int num) {
		int square=num*num;
		int r=0;
		int sum =0;
		while(square!=0) {
			r=square%10;
			square/=10;
			sum+=r;
		}
		if(sum==num) {
			return true;
		}
		return false;
	}
public static void main(String[] args) {
	String s = "";
	do {
	System.out.println("Enter a Number: ");
	int n = sc.nextInt();
	
	if(isNeonNumber(n)) {
		System.out.println("Given number is Neon Number");
	}else {
		System.out.println("Given number is not a Neon Number");
	}
	
	System.out.println("do you want to continue the process ,if we want please enter 'y' or 'n' !!...");
	s=sc.next();
	}while(s.equalsIgnoreCase("y"));
}
}
