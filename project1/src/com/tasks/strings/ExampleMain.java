package com.tasks.strings;

 interface Example1 {
	 
	 int koti();
	 
	 default void show() {
		System.out.println("show");
	}
	
	 static void display() {
		System.out.println("display");
	}
	
	 static void showing() {
		System.out.println("showing");
	}
	
	 default void displaying() {
		System.out.println("displaying");
	}
}

interface Example5 extends Example1 {
	
	 default int koti() {
		 return 8;
	 }
	
	 default void show() {
		System.out.println("show5");
	}
	
	 static void display() {
		System.out.println("display5");
	}
	
	 default void showing() {
		System.out.println("showing5");
	}
	
	 default void displaying() {
		System.out.println("displaying5");
	}
}

public class ExampleMain implements Example5{
	public static void main(String[] args) {
		
		ExampleMain em = new ExampleMain();
		em.show();
		em.showing();
		em.displaying();
		
		Example1.display();
		Example5.display();
		
	}

	@Override
	public int koti() {
		return 1;
	}
}

