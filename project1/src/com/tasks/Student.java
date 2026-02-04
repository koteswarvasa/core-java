package com.tasks;

public class Student {
    String name;
    int rollNo;
    int marks;
    
    
    public Student(String name, int rollNo, int marks) {
    	System.out.println("parameterized Constructor");
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
    
    Student(Student s,int marks){
    	System.out.println("copy Constructor");
    	this.name = s.name;
		this.rollNo =s. rollNo;
		this.marks=marks;
    }



	void display() {
    	System.out.println("************************");
    	System.out.println("Student Name : "+name);
    	System.out.println("Studet rollNo : "+rollNo);
    	System.out.println("Studsent marks : "+marks);
    }
    public static void main(String[] args) {
		Student s1 = new Student("koti",1,80);
		s1.display();
		System.out.println();
		
		Student s2 = new Student(s1,50);
		s2.display();
	}
}
