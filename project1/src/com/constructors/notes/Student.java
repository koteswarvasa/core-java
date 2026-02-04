package com.constructors.notes;

public class Student {
	int id;
	String name;
	int age;
	
	
	// no-args constructor will be used we can give the values 
	//  instead of default values given by the JVM
	Student(){
		System.out.println("no-args Constructor....");
		id=101;
		name="koti";
		age=22;
	}
	
	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}
public static void main(String[] args) {
	System.out.println("main method started");
	
	
	//when we creating an object the default constructor 
	//will give default values 
	
	//when we creating an object, in a class contains
	//any constructor like no-args constructor it indicates the no-ags constructor
	Student s1 = new Student();
	s1.id=102;
	s1.name="venkat";
	s1.age=21;
	s1.display();
	
	System.out.println();
	Student s2 = new Student();
	s2.display();
	
	System.out.println("main method ended");
}
}
