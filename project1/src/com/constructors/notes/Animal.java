package com.constructors.notes;

public class Animal {
	
	// super() - it is used for the calling one constructor  
	//            from another Constructor from Parent class.
	
	String name = "chimtu bhai";
	int a;
	int b;

	Animal(){
		System.out.println("no-args constructor from Animal ");
	}
	
	Animal(int a,int b){
		System.out.println("parameterized Constructor from Animal ");
		this.a=a;
		this.b=b;
		System.out.println(a+b);
		
	}
	
	public static void main(String[] args) {
		System.out.println("main method started from Animal !!");
	}
}

class Dog extends Animal {
	Dog(){
		super(2,4);
		System.out.println("no args Costructor from Dog");
	}
	
	Dog(double a,double b){
		//super();
		System.out.println("parameterized constructor from Dog ");
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		System.out.println("main method started from Dog");
		Dog d = new Dog(5.6,3.6);

	}
}