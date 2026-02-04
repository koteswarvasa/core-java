package com.logicalstatements.whileloop;

import java.util.Scanner;

public class ArmstrongNumber {
	static Scanner sc = new Scanner(System.in);
	
	static boolean armstrongNumber(int num) {
//		int temp = num;
//		int val=0;
//		int sum=0;
//		while(num!=0) {
//			val=num%10;
//			sum+=val*val*val;
//			num/=10;
//		}
		
		int sum=0;
		int rev=0;
		int temp=num;
		int digitsCount = Integer.toString(num).length(); 
		
		while(num!=0) {
			rev=num%10;
			sum=(int)(sum+Math.pow(rev,digitsCount));
			num/=10;
		}
		
		if(sum==temp) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		while(true) {
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		
		if(armstrongNumber(num)) {
			System.out.println("Given number is a Armstrong Number !..");
		}else {
			System.out.println("Given number is not a Armstrong Number !..");
		}
			
	}
}
}
