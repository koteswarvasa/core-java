package com.logicalstatements.forloop;

public class PrintsEvenOrOddWithoutUsingIf {
public static void main(String[] args) {
	System.out.println("main method started");
	
	//it prints n number of time ,
//	   it does not show error but it crash the system
//	for(int i=0;i<10;) {
//		System.out.println("test");
//	}
	
	
	//even Numbers
	System.out.println("Even numbers without using if condition");
	for(int i=2;i<10;i+=2) {
		System.out.println(i);
	}
	
	System.out.println();
	System.out.println("Odd numbers without using if condition");
	//Odd Numbers
		for(int i=1;i<10;i+=2) {
			System.out.println(i);
		}
}
}
