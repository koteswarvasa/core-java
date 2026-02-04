package com.langfundamentals;

public class Literals02_StringLiterals {
public static void main(String[] args) {
	
	//1.String Literals are stored heap memory inside
	// the String Constant Pool(SCP)
	//2.if the String Literals are same it store in the same reference
	String s1="java";
	String s2="java";
	
	//Create in Heap memory
	String s3 = new String();
	String s4 = new String("java");
	
	// '==' check address of the variable  SCP 
	System.out.println(s1==s2);
	
	System.out.println(s3==s4);
	
	
	
}
}
