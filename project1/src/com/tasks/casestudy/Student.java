package com.tasks.casestudy;

public class Student {
	int rollNumber;
	String name;
	String course;

	//no-args COnstructor
	Student() {
		System.out.println("no args Constructor !.....");
		rollNumber=0;
		name="Unknown";
		course="Unknown";
	}

	//2-args Constructor 
	Student(int rollNumber, String name) {
		System.out.println("2-args Constructor !.....");
		this.rollNumber=rollNumber;
		this.name=name;
	}

   //3-args Constructor
	Student(int rollNumber, String name, String course) {
		System.out.println("3-args Constructor !.....");
		this.rollNumber = rollNumber;
		this.name = name;
		this.course = course;
	}

	//show Method to display the all object data members 
	void show() {
		System.out.println("*************************");
		System.out.println("Student Roll Number : " + rollNumber);
		System.out.println("Student Name : " + name);
		System.out.println("Student Course : " + course);
	}

	public static void main(String[] args) {
		//creating the object
		Student s1 = new Student();
		//calling the instance method
		s1.show();
		System.out.println();
		
		Student s2 = new Student(1,"venkat");
		s2.show();
		System.out.println();
		
		Student s3 = new Student(2,"koti","java");
		s3.show();

	}
}
