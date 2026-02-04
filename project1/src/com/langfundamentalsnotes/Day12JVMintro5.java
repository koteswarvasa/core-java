package com.langfundamentalsnotes;

public class Day12JVMintro5 {
	void read() {
		System.out.println("read method called...");
	}
	
	void singing() {
		System.out.println("singing method is called..");
	}
	
	static void write() {
		System.out.println("write method called...");
	}
	

	public static void main(String[] args) {
		Day12JVMintro5 obj=new Day12JVMintro5();
		
		System.out.println("main method is called...");
		write();
		obj.read();
		obj.singing();
		
		System.out.println(Thread.currentThread());
		
		/*
		 
  -----------------------------------------------------------------------------------------
   			
   			JVM INTRO 05:
   				1)Class loader sub system
   					-Loading
   						-Bootstrap  class loader
   						-Extension class loader
   						-Application class loader
   					-Linking
   						-Verifier
   						-Prepare
   						-resolve
   					-Initialization
   					
   				2)Memory managemnet (or) Run time data
   					-Method Area  -while static data
   					-Heap Area    -Instance data
   					-Stack Area	  -When method execute place
   					-Pc register  
   					-Native method stack area
   					
   				3)Execution Engine
   				4)JNI
   				5)Native method libraries
   				
   				
   				Static methods:
   					-Whenever the functinalities are genaric then make it is static.
   					-For static method we no need to create objects.
   					-And those methods calls directly.
   					-static methods are call directly or by class or by object reference.
   					
   				Instance methods:
   					-Whenever the functionalities are specific to objects then make it as non static or instance.
   					-Instance method must need to create objects.
   					-those methods are available when create objects.
   					-Instance method we can not create directly.but we can call by using object by reference
   					
   					
   					
   					==>Instance inside static methods ok...
   					==>static inside instance methods not ok....
		 
		 */
	}
}
