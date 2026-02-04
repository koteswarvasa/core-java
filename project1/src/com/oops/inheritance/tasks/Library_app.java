package com.oops.inheritance.tasks;

public class Library_app {
public static void main(String[] args) {
	
	Student_Member sm1 = new Student_Member("koti",5);
	System.out.println("Student Borrowed Books price: "+sm1.calculateFee());
	
	Premium_Member pm1 = new Premium_Member("laxman",5);
	System.out.println("Premium Student Borrowed Books price: "+pm1.calculateFee());
}
}
