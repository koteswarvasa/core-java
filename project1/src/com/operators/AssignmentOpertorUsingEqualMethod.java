
package com.operators;
//.equals method checks for the content of the String whereas == operator checks addresses of the object.
public class AssignmentOpertorUsingEqualMethod {
	public static void main(String[] args) {
		String s1 = "Rahman"; // --> String Literals -> SCP
		String s2 = "Rahman";
		System.out.println(s1 == s2);// true
		System.out.println(s1.equals(s2));// true
		String s3 = new String("Joshna");// String with new Object --> Heap -> 2 object
		String s4 = new String("Joshna");// Heap --> 1 object
		System.out.println(s3 == s4);// false
		String s5 = "Joshna";// 0 object
		String s6 = "josHNA";
		System.out.println(s5.equalsIgnoreCase(s6));// true
	}
}
