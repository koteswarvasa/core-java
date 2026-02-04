package com.langfundamentalsnotes;

public class Day09JVMintro3 {
	
		//Instance variables
			int jersyNum;
			String name;
		
		
		//Static variables
			static int countryid;
			static String countryName;

	public static void main(String[] args) {
		
		countryid=91;
		countryName="india";
		
		//Accecssing static data
		System.out.println("Country id:"+countryid);//0
		System.out.println("Country name:"+countryName);//null
		
		
		//create object1 for class
		Day09JVMintro3 obj=new Day09JVMintro3();
		
		obj.jersyNum =18;
		obj.name="King Kohli";
		
		//Accessing instance data
		System.out.println("jersy Num:"+obj.jersyNum);    //we can not instance data in static context directly
		System.out.println("Cricketer Name:"+obj.name);					//if you try error occured4
		System.out.println(" ");
		
		
		
		//object 2
		Day09JVMintro3 obj2=new Day09JVMintro3();
		
		obj2.name="Dhoni";
		obj2.jersyNum=07;
		
		System.out.println("Country id:"+countryid);
		System.out.println("Country name:"+countryName);
		System.out.println("jersy Num:"+obj2.jersyNum); 
		System.out.println("Cricketer Name:"+obj2.name);	
		System.out.println(" ");
		
		
		//object 3
		Day09JVMintro3 obj3=new Day09JVMintro3();
		
		countryid=92;
		countryName="Bharath";
		
		obj3.name="Rohit";
		obj3.jersyNum=45;
		
		System.out.println("Country id:"+countryid);
		System.out.println("Country name:"+countryName);
		System.out.println("jersy Num:"+obj3.jersyNum); 
		System.out.println("Cricketer Name:"+obj3.name);
		System.out.println();
		
		
		//object 4
		Day09JVMintro3 obj4=new Day09JVMintro3();
	
		
		obj4.name="K L Rahul";
		obj4.jersyNum=01;
		
		System.out.println("Country id:"+countryid);
		System.out.println("Country name:"+countryName);
		System.out.println("jersy Num:"+obj4.jersyNum); 
		System.out.println("Cricketer Name:"+obj4.name);
		System.err.println();
		
		
		
		//object 5
		Day09JVMintro3 obj5=new Day09JVMintro3();
		
		obj5.jersyNum =10;
		obj5.name="Lucky";
		
		countryid=911;
		countryName="India";
		
		System.out.println("Country id:"+countryid);
		System.out.println("Country Name:"+countryName);
		System.out.println("Jersy num:"+obj5.jersyNum);
		System.out.println("Cricketer Name:"+obj5.name);
		
		
		
		
			
		/*
		----------------------------------------------------------------------------------------
		 
		 
		 
		 JVM INTRO 03:
		 		In JVM
		 		
		 		1)Class loader sub system
		 			==>Loading
			 			-Bootstrap class loader
			 			-Execution class loader
			 			-Application class loader
			 		==>Linking
			 			-Byte code verifier
			 			-Prepare
			 			-resolve
			 		==>Initilization 
			 			default value produce to static data 
			 		
			 		
		 		2)Memory management  or Run time data
		 			-Method Area
		 				whenever the class is loading all static data is loading to Method area
		 			-Heap Area
		 				whenever object is creating all instance data is loading in Heap Area
		 			-Static Area
		 			
		 		3)Execution engine
		 		4)JNI
		 		5)Native method Libraries
		 		
		 		
		 		STATIC VS INSTANCE
		 			static==> Whenever the data is not changing from object to object
		 					  then we should make sure that data is static.
		 			
		 			Instance==> Whenever the data is changing from object to object
		 						then we should make sure that data is instance.
		 	
		------------------------------------------------------------------------------------------
		 
		 */
		
	

	}

}
