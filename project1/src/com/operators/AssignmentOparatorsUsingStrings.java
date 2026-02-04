
package com.operators;
//== operator meant for checking the addresses of the Objects if it is object data types.
public class AssignmentOparatorsUsingStrings {
	public static void main(String[] args) {
		AssignmentOparatorsUsingStrings t = new AssignmentOparatorsUsingStrings();
		System.out.println(t);
		System.out.println(t.hashCode());
		String s1 = "Srikanth";// String Literals --> SCP --> 1 object
		String s2 = "Srikanth";// String Literals --> SCP --> 0 object
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		String s3 = "Java";// String Literals --> 1 object
		String s4 = new String("Java");// String Object --> Heap memory --> 1 object in Heap
		System.out.println(s1 == s2);// true
		System.out.println(s3 == s4);// false
		String s5 = new String("Vcube");// Heap --> 2 objects
		String s6 = new String("Vcube");// Heap --> 1 object
		System.out.println(s5 == s6);// false
		System.out.println(System.identityHashCode(s5));
		System.out.println(System.identityHashCode(s6));
	}
}



