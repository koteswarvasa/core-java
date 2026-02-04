package com.operators;

public class LogicalOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 20;

		String s1 = "koti";
		String s2 = new String("koti");
		String s3 = new String("koti");

		System.out.println("==== && info ====");
		System.out.println(true && true);  //true
		System.out.println(true && false);  //false
		System.out.println(false && true);  //false
		System.out.println(false && false);  //false
		
		System.out.println("********************************");
		System.out.println(a != b && s1.equals(s2));// true
		System.out.println(b == c && !s1.equals(s2));// false
		System.out.println(a == c && s1 == s2);// false
		System.out.println(b != c && !s2.equals(s3));// false
		
		System.out.println("==== || info ====");
		System.out.println(true || true || true && false);  //true
		System.out.println(true || false);  //true
		System.out.println(false || true);  //true
		System.out.println(false || false);  //false
		
		System.out.println("********************************");
		System.out.println(a != b || s1.equals(s2));// true
		System.out.println(b == c || !s1.equals(s2));// false
		System.out.println(a == c || !(s1 == s2));// false
		System.out.println(b != c || !s2.equals(s3));// false
		
	}
}
