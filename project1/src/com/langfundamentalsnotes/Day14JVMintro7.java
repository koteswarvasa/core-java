package com.langfundamentalsnotes;

public class Day14JVMintro7 {
	static void method1() {
		System.out.println("Hello method 1..");  //static method
	}
	
	static {
		System.out.println("Hello sirii..");    //static Block -->first execute..!
	} 
	
	void method2() {
		System.out.println("Hello methood 2...");
	}
	
	native void method3();
		
	
	
	public static void main(String[] args) {
		System.out.println("main method started...");
		Day14JVMintro7  obj=new Day14JVMintro7();
		method1();
		obj.method2();
		
		
		
		/*
		 
		------------------------------------------------------------------------------------
			JVM INTRO 07:
				1)class loader subsystem
				2)Memory management
					-method area   --sttaic
					-Heap area    --instance 
					-stack area   --methods
					-pc registers  --
					-nativ stack method area--another language 
		 		3)Execution engine
		 			-Interpreter
		 			-JIT compiler (Just in time)
		 			-Garbage collection  //view Employee class  
		 			
		 			
		 			Interpreter:
		 				-Executes Byte code line by line (slower)
		 			
		 			JIT ompiler(just in time):
		 				-Convert Byte code into native code with better performance.
		 				-repeating code
		 				
		 			Gc (garbage collector):
		 				-Automatically manages memory by cleaning unused objects.
		 				-prevents memory leakage.
		 				-Optimal memory storage.
		 				
		 				
		 			EXAMPLE is Employee class in com.langfundamentls...
		 			
		 			==>***Object is root of evry class***
		 			
		 		------------------------------------------------------------------------------
		 */
	}
}
