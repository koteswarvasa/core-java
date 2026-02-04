package com.langfundamentals.typeofmethods;

import java.util.Scanner;

public class TestMDemo4 {
	// no return type and with argumets

	// WAP to display the student details
	// to take the inputs from the console by using the Scanner class
	// to display the each information in each methods

	static Scanner sc = new Scanner(System.in);

	void stuId(int id) {
		System.out.println("Student Id: " + id);
	}

	void stuName(String fName, String lName) {
		System.out.println("Student Name: " + fName + "." + lName);
	}

	void stuPhone(long pNumber) {
		System.out.println("Student Phone Number: " + pNumber);
	}

	void stuHeight(double height) {
		System.out.println("Student Height: " + height);
	}

	void stuWeight(double weight) {
		System.out.println("Student Weight: " + weight);
	}

	void stuMarriedStatus(boolean mStatus) {
		System.out.println("Student Married Status: " + mStatus);
	}
	
	void stuGender(char gender) {
		System.out.println("Student Gender: "+gender);
	}

	void main() {
		System.out.println("main method started");

		System.out.println("Enter a Id: ");
		int id = sc.nextInt();

		System.out.println("Enter a FirstName: ");
		sc.nextLine();
		String fName = sc.nextLine();

		System.out.println("Enter a LastName: ");
		String lName = sc.next();

		System.out.println("Enter a PhoneNumber: ");
		long pNumber = sc.nextLong();

		System.out.println("Enter a getHeight: ");
		double height = sc.nextDouble();

		System.out.println("Enter a getweight: ");
		double weight = sc.nextDouble();

		System.out.println("Enter a MarriageStatus: ");
		boolean mStatus = sc.nextBoolean();

		System.out.println("Enter a Gender: ");
		char gender = sc.next().charAt(0);

		
		System.out.println("======Student Details======");
		stuId(id);
		stuName(lName,fName);
		stuPhone(pNumber);
		stuHeight(height);
		stuWeight(weight);
		stuMarriedStatus(mStatus);
		stuGender(gender);
		
		

	}

}
