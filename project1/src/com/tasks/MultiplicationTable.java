package com.tasks;

import java.util.Scanner;

public class MultiplicationTable {
static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Enter a Number: ");
	int n = sc.nextInt();
	
	for(int i=1;i<=10;i++) {
		System.out.println(n+" * "+i+" = "+(n*i));
	}
}
}
