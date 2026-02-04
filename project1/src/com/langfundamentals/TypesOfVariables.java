package com.langfundamentals;

public class TypesOfVariables {
	
	//static + primitive
	static int A1=10;
	
	//static + Object
	static String S1 = "java";
	
	//instance + primitive
	int a2=20;
	
	//instance + Object
	String s2="sql";
	
public static void main(String[] args) {
	TypesOfVariables tv1 = new TypesOfVariables();
	
	//static data will be access by Directly or classname or object
	//static variable name sholud Capital
	System.out.println(A1);
	System.out.println(S1);
	System.out.println(TypesOfVariables.A1);
	System.out.println(TypesOfVariables.S1);
	System.out.println(tv1.A1);
	System.out.println(tv1.S1);
	
	//instance data will be access by the creating an object 
	System.out.println(tv1.a2);
	System.out.println(tv1.s2);
	
	
	
	

}
}
