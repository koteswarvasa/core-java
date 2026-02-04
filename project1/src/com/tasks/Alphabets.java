package com.tasks;

public class Alphabets {
public static void main(String[] args) {
	
	System.out.println("UpperCase Alphabets(A to Z): ");
	for(char c=65;c<=90;c++) {
		System.out.print(c+" ");
	}
	System.out.println();
	
	System.out.println("LowerCase Alphabets(a to z): ");
	System.out.println();
	for(char c=97;c<=122;c++) {
		System.out.print(c+" ");
	}
	System.out.println();
	
	System.out.println("Alphabets with Numbers: ");
	int i=1;
	for(char c=65;c<=90;c++) {{
		System.out.println(c+" "+i++);
	}
	}
	
}
}
