package com.langfundamentals.typeofmethods;

public class TestMDemo2 {
	
  // No return Type and No parameters
	//Syntax:  <no return Type> method_name(){}
	
	void add() {
		int a=20;
		int b=30;
		System.out.println("Addition of two numbers: "+(a+b));
	}
	void sub() {
		int a=20;
		int b=30;
		System.out.println("Subtraction of two numbers: "+(a-b));
	}
	void mul() {
		int a=20;
		int b=30;
		System.out.println("Multiplication of two numbers: "+a*b);
	}
	void div() {
		int a=20;
		int b=30;
		System.out.println("Division of two numbers: "+a/b);
	}
	void mod() {
		int a=20;
		int b=30;
		System.out.println("Modulos of two numbers: "+a%b);
	}
	
 void main() {
	System.out.println("Main method started!...");
	add();
	sub();
	mul();
	div();
	mod();
	
	System.out.println("main method ended");
}
}
