package com.constructors.notes;

public class Student1 {
	
	int id;
    String name;
    double sal;
    
    Student1(String name,double sal){
    	this.name=name;
    	this.sal=sal;
    }
    
    void show() {
    	System.out.println(id);
    	System.out.println(name);
    	System.out.println(sal);
    }
	
public static void main(String[] args) {
	Student1 s= new Student1("abcd",500);
	s.show();
	
	// it show error: The constructor Student1() is undefined
	//---it is not call the default constructor
	//     because in your class we have the parameterized constructor 
	//     that's why it show error
//	Student1 s1= new Student1();
//	s1.show();
	
}
}
