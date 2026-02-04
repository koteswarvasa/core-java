
package com.operators;

//Relational or comparison Operators ==, <,<=,>,>=, and !=
//--> will give you the result as boolean expression like true or false
public class RelationalOperators {
	public static void main(String[] args) {
		String s1 = "Srikanth";
		String s2 = "Srikanth";
		String s3 = "srikanth";
		String s4 = new String("Srikanth");
		System.out.println(s1 == s2);// true
		System.out.println(s1 == s3);// false
		System.out.println(s1 == s4);// false
		System.out.println("******************");
		int a = 10;
		int b = 10;
		System.out.println(a == b);// false
		System.out.println(a > b);// false
		System.out.println(a < b);// true
		System.out.println("**************");
		int x = 50;
		int y = 50;
		int z = 100;
		System.out.println(x == y);// true
		System.out.println(x == z);// false
		System.out.println(x >= y);// true
		System.out.println(x <= z);// true
		System.out.println(x != y);// false
	}
}
