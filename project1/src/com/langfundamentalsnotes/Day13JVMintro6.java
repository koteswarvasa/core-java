package com.langfundamentalsnotes;

public class Day13JVMintro6 {
	
	static Day13JVMintro6 obj=new Day13JVMintro6();
	
	//Instance Block
	{
		System.out.println("Hello Instance Block...");
		//Day13JVMintro6 obj=new Day13JVMintro6();
		
	}
	
	{
		System.out.println("Hello Instance 2 Block...");
	}
	
	//Static Block
	static {
		System.out.println("Hello static Block...");
		//Day13JVMintro6 obj=new Day13JVMintro6();
	}
	
	static {
		System.out.println("Helllo static 2 Block..");
	}
	
	public static void main(String[] args) {
		//Day13JVMintro6 obj=new Day13JVMintro6();
		System.out.println("main method started...");
		
		/*
		 
	---------------------------------------------------------------------------------------
	
		JVM INTRO 06:
		
			Variable:
				-variable is contain to store data.
				
			Method-
				-Method is a behaviour to execute functionality.
				-It is block of code to maintain blocks.
				-Method must need to call for exection.
				
			Block:
				-A block is a Block of code But no need to call.
					==>Static blocks
						-It will execute directly no need to call.
						Ex:static{
							------
							-------
							}
					==>Instance Blocks
							-Instance Block called when object is created.
							
				STeps to execute Java program:
					step-1:
						-First JVM will check there is main method or not.
						-If yes it will check there any static blocks or static variables.
						-If yes static variables and static block will exrcute in order wise FIFO.
						
			
			
		 
		 */
	}
}
