package com.langfundamentals;

public class Employee {
	void hello() {
		System.out.println("hello Mowas...");
	}
	
	public static void main(String[] args) {
		System.out.println("main method is started..");
		
		Employee e1=new Employee();
		//System.out.println(e1);  //Address of object  @65b3120a
		//System.out.println(e1.hashCode());
		//int a=0x65b3120a
		
		Employee e2=new Employee();
		//System.out.println(e2);   //@6f539caf
		
		
		Employee e3=new Employee();
		//System.out.println(e3);   //@79fc0f2f
		
		e1=null;
		System.gc();
		System.out.println(e1);
		System.out.println(e2);     //AGC  automatic garbage collector
		System.out.println(e3);             //nullifying
		
		new Employee().hello();		//Anonymous objects
		
		
		
	}

}
