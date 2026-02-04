package com.tasks.arrays;

public class SwapWithoutUsingThirdVariable {
public static void main(String[] args) {
	int a=10,b=5;
	
	System.out.println("********************************");
	System.out.println("Before swaping: ");
	System.out.println("a value: "+a);
	System.out.println("b value: "+b);
	
	
//	a=a+b;
//	b=a-b;
//	a=a-b;
	
	a=a^b;
	b=a^b;
	a=a^b;
	
	System.out.println();
	System.out.println("********************************");
	System.out.println("After swaping: ");
	System.out.println("a value: "+a);
	System.out.println("b value: "+b);
	
}
}
