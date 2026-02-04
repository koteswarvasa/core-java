package com.langfundamentals.typeofmethods;


// import java.util.Scanner;

public class TestMDemo3 {
	
	//no return type and with arguments
	//without return any return Type and we give the arguments
	
	void add(int a,int b) {
		System.out.println("Addition of two numbers"+(a+b));
	}
	
	void add() {
		System.out.println("Addition of two numbers");
	}
void main() {
	System.out.println("main method started");
	int x=10;
	int y=20;
	add(x,y);
	
	
}
}
