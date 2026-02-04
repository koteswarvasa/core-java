package com.tasks;

import java.util.Scanner;

public class NumberIsEvenOrOdd {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number: ");
	int num = sc.nextInt();
//	if(num%2==0) 
//		System.out.println("Given is Even");
//	else
//		System.out.println("Given is Odd");
	
	String result = num%2==0?"Given Number is Even":"Given Number is Odd";
	System.out.println(result);
	sc.close();
}
}
