package com.langfundamentalsnotes;

public class Day22DataTypes02 {
	public static void main(String[] args) {
		/*
		 
   ------------------------------------------------------------------
   		 DATA TYPES 02:
   		 	1)Premitive data types
		 	2)Object Dat types
		 		==>user-defined data types
		 		==>pre-defined data types
		 			->wrapper object data types
		 			->Normal or regular data types
		 			
		 			
		 	for Numbers difault value is 0
		 	for Floating point default value is 0.0
		 	for character default value is ( ) ==>space
		 	for boolean default value is false.
		 	
		 	
		 	By default any number from RHS is consider as int only..
		 	byte b=128;
		 	The range of byte is -128 to 127.
		 	1 byte = 8 bits = -128 to 127
		 	8-bit memory 
		 	using 2 s complement
		 	
		 	2^7 2^6 2^5 2^4 2^3 2^2 2^1 2^0
		 	    64  32  16  8   4   2   1
		 	
		 	64+32+16+8+4+2+1==>127
		 	2^7  is MSB (Most significant bit)
		 				+0
		 				-1
		 	Byte:			
		 		==>If we give morethan byte value,we will get below error
	  			==>compile time error:Type mismatch:cannot convert from int to byte
    			==>Type Casting:Converting the data from one data type to another type is clled Type casting.
		 	
		 		byte b=127  ok
		 		byte b1=(byte) 128 ==>-128  //Explicit Type casting :int to byte
		 	
		 	
		 	Short:
		 		//short = 2 bytes = 16 bits
				// 2^15 ===> range -32768 to 32767
				//If we give morethan short value,we will get below error
				//compile time error:Type mismatch:cannot convert from int to short
		 	
		 	int:
		 		//int = 4 bytes = 32 bits
				//2^31 ==> range -2147483648 to 2147483647
				//If we give morethan int value,we will get below error
				//the literal (num) out of range
	
			long:
				//long = 8 bytes = 64 bits;
				//2^63 ==>range -2^63 to 2^63-1  -922337203684775808  to  922337203684775807
				//l or L is caseinsensitve
		 	
		 	
		 	By default any floating number from RHS is consider as double only.
		 	
		 	
		 */
	}
}
