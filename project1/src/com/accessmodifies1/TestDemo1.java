package com.accessmodifies1;

public class TestDemo1 {
	
	static {
		System.out.println("static block");
	}
	
	
	{
		System.out.println("Instance block");
	}
	
//	private TestDemo1(){
//		System.out.println("no args constructor");
//	}
	
	
	private int a1 = 1;
	private String name1 = "koti";
	
	private void method1() {
		System.out.println("Method 1");
	}
	
public static void main(String[] args) {
	TestDemo1 t1 = new TestDemo1();
	System.out.println(t1.a1);
	System.out.println(t1.name1);
	t1.method1();
}
}
