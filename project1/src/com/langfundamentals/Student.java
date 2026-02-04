package com.langfundamentals;

public class Student {
	void hello() {
		System.out.println("Hello Guys,Good evening...");
	}
	public static void main(String[] args) {
		Student st=new Student();//object create for instance methood
		
		System.out.println("Main method started...");
		welcome();
		st.hello();
	}
	static void welcome() {
		System.out.println("Welcome to java world...");
	}

}
