package com.tasks;

import java.util.Scanner;

public class MethodResultAsFirstArgument {
	
	static Scanner sc = new Scanner(System.in);
	
	void add1(int a,int b) {
	  int c=a+b;
	  System.out.println("c value: "+c);
	  System.out.println("Enter d value: ");
	  int d= sc.nextInt();
	  add2(c,d);
	  
	}
	
	
	void add2(int a,int b) {
		int d= a+b;
		System.out.println("Addition of two numbers in add2() result e: "+d);
		System.out.println();
		System.out.println("Enter e value: ");
		 int e= sc.nextInt();
		add3(d,e);
	}
	
	void add3(int a,int b) {
		int f=a+b;
		System.out.println("e value: "+f);
	}
	
	
	
	
	
 void main() {
	System.out.println("main method started");
	System.out.println("Enter a value: ");
	int a = sc.nextInt();
	System.out.println("Enter b value: ");
	int b=sc.nextInt();
	add1(a,b);
	
}
}
