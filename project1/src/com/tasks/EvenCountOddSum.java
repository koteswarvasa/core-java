package com.tasks;

import java.util.Scanner;

public class EvenCountOddSum {
	static Scanner sc =new Scanner(System.in);
public static void main(String[] args) {
	int count=0;
	int sum=0;
	
	for(int i=0;i<10;i++) {
		if(i%2==0) {
			count++;
		}else {
			sum+=i;
		}
	}
	
	System.out.println("Even count : "+count);
	System.out.println("Odd Sum : "+sum);
}
}
