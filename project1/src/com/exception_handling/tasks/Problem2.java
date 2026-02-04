package com.exception_handling.tasks;

public class Problem2 {
	
	 static void level2() throws Exception {
		 throw new Exception("From level2");
		}
	 
	static void level1() {
		try {
			level2();
		}catch(Exception e) {
			System.out.println("Handlled in level1");
		}finally {
			System.out.println("level1 finally");
		}
	}
	public static void main(String[] args) {
		level1();
	}
}
