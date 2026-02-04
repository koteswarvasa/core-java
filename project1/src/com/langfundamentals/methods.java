package com.langfundamentals;

public class methods {
	public static void main(String[] args) {
		System.out.println("main method started..");
		method1();
	}
	
	static void method1() {
		method2();
		System.out.println("Method 1 calling....");
		
		
		
	}																		//this is thread
	
	static void method2() {
		method3();
		System.out.println("Method 2 calling...");
	}
	
	static void method3() {
		System.out.println("Method 3 calling...");
	}
	
	void method4() {
		System.out.println("method 4 calling");
		method1();
	}

}
