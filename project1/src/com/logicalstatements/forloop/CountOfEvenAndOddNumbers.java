package com.logicalstatements.forloop;

import java.util.Scanner;

public class CountOfEvenAndOddNumbers {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a range ");
	int n = sc.nextInt();
	int evenCount =0;
	int oddCount=0;
	
	for(int i=0;i<=n;i++) {
		if(i%2==0) {
			evenCount++;
		}else {
			oddCount++;
		}
	}
	
	System.out.println("Even Numbers range upto "+n+" are: "+evenCount);
	System.out.println("Odd Numbers range upto "+n+" are: "+oddCount);
	
	sc.close();
}
}
