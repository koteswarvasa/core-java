package com.logicalstatements.forloop;

public class PrintsTheNumbersSequenceAndReverse {
public static void main(String[] args) {
	
	System.out.println("Prints from 0 to 100");
	for(int i=0;i<=100;i++) {
		System.out.print(i+" ");
	}
	System.out.println();
	
	System.out.println("Prints from 100 to 0");
	
	for(int i=100;i>=0;i--) {
		System.out.print(i+" ");
	}
}
}
