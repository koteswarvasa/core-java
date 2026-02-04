package com.langfundamentalsnotes;

public class Day10JVMintro4 {
	static int countryId=91;
	static String countryName="India";
	
	int cusId;
	String cusName;
	
	void display() {
		System.out.println("******************");
		System.out.println("Country id:"+countryId);
		System.out.println("Country Name:"+countryName);
		System.out.println("Customer Id:"+cusId);
		System.out.println("Customer Name:"+cusName);
		System.out.println();
		
	}
	public static void main(String[] args) {
		Day10JVMintro4 cus1=new Day10JVMintro4();
		cus1.cusId=101;
		cus1.cusName="Surya";
		cus1.display();
		
		Day10JVMintro4 cus2=new Day10JVMintro4();
		cus2.cusName="Lucky";
		cus2.cusId=102;
		cus2.display();
		
		countryId=92;
		countryName="Hindhusthan";
		
		Day10JVMintro4 cus3=new Day10JVMintro4();
		cus3.cusName="prasanna";
		cus3.cusId=1005;
		cus3.display();
		
		Day10JVMintro4 cus4=new Day10JVMintro4();
		cus4.cusName="Ajay";
		cus4.cusId=106;
		cus4.display();
		
	
		
		
		/*
		  
		thread:
			light weight execution process inside stack.
			
		 
		 Method:
		 	-Method is a block of code to reduce the duplication.
		 	-Code reusability.
	-----------------------------------------------------------------------
		 
		 JVM INTRO:
		 	2)Memory Management (or) Run time data
		 		-Method area
		 		-Heap Area
		 		-Stack area
		 		-Pc register
		 		-Native method stack Area
		 		
		----------------------------------------------------------------------------
		 		
		 
		 */
	}
}
