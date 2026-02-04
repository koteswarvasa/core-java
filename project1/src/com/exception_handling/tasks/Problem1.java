package com.exception_handling.tasks;

public class Problem1 {
	@SuppressWarnings("finally")
	public static void main(String[] args) {
		try {
			try {
				throw new Exception("Inner Exception");
			}finally{
				System.out.println("inner Finally");
				throw new RuntimeException("Finally Exception");
			}
		}catch(Exception e) {
			System.out.println("Caught: "+e.getMessage());
		}
	}
}
