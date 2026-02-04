package com.langfundamentalsnotes;

public class Day07JvmIntroduction {
	public static void main(String[] args) {
		/*
	-------------------------------------------------------------------------
		 
		 JVM INTRODUCTION:
		 	Source code-->High level language-->English language
		 	Os-cant understand sourse code
		 	OS understands Native code
		 	
		 	source code--->Native code
		 		2 steps
		 			1}compilation -Covert  source code to Byte code
		 			2)Execution   -Convert Byte cod to Native code
		 
		 				souurce code
		 					| (java compiler)
		 				Byte code
		 					|  (JVM)
		 				Native Code
		 					|
		 				OS -->Output
		 				
		 
		 	JDK-Java develepment kit
		 		-->JDK is a free & opensource software to install in our system
		 		   to compile and execute java aoplications or programs.
		 		   
		 		-->JDK=JRE+JVM
		 		
		 		-->JDK=JRE+Devtools(javac,java,jdb)
		 		
		 		
		 	JRE-Java run time environment
		 		-->JVM+Library classes
		 		-->JRE supports library classes to execute java applications.
		 		
		 		
		 	JVM-Java virtual machine
		 		-->Major part of Execution done by JVM
		 		-->Convert Byte code to Native Code.
		 
		 -----------------------------------------------------------------------------
		 	
		 	JVM devided into 5 module
		 			1)Class loader subsystem
		 				==>Loading
		 					-->Bootstrap class loader 
		 					-->Extension class loader  
		 					-->Application class loader
		 				==>Linking
		 					-->veify
		 					-->prepare
		 					-->Resolve
		 				==>Initialization
		 				
		 			2)Memory management (or) Run time data
		 				==>Method Area
		 				==>Heap Area
		 				==>Static Area
		 				==>Pc registers
		 				==>Native method static Area
		 				
		 			3)Execution Engine
		 				==>Interpreter
		 				==>JIT
		 				==>Garbage Collection
		 				
		 			4)JNI(Java Native Interface)
		 			
		 			5)Native method libraries
		 			
		---------------------------------------------------------------------------------------
		 */
	}

}
