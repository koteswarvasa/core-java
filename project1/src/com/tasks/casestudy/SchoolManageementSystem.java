package com.tasks.casestudy;

public class SchoolManageementSystem {

	String id;
	String name;
	String section;

	SchoolManageementSystem(String id, String name, String section) {
		this.id = id;
		this.name = name;
		this.section = section;
	}

	public SchoolManageementSystem(SchoolManageementSystem sms1) {
		id=sms1.id;
		name=sms1.name;
		section=sms1.section;
	}

	void show() {
		System.out.println("****************************");
		System.out.println("Student Id : " + id);
		System.out.println("Student Name : " + name);
		System.out.println("Student Section : " + section);
	}

	public static void main(String[] args) {
		System.out.println("Before update the section !!.....");
		SchoolManageementSystem sms1= new SchoolManageementSystem("5A8","Koteswar","Cse-A");
		sms1.show();
		System.out.println();
		
		String newSection = "Cse-B";
		System.out.println("After update the section !!.....");
		SchoolManageementSystem copy = new SchoolManageementSystem(sms1);
		copy.section=newSection;
		copy.show();
		
	}
}
