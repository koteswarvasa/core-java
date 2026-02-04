package com.exception_handling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDemo1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection conn= null;
		Statement smt = null;
		ResultSet rs = null;
		
		try {
//	step 1: loading and register the jdbc driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Loading sucessfull !!");

//  step 2: Established the connection to the database
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentd", "root", "root");
		System.out.println("Establised Successfull !!");

//	step 3: Create the statement
		smt = conn.createStatement();
		System.out.println("Creste statement Successfull !!");

//	step 4: Create the Result set
		 rs = smt.executeQuery("select * from students");
		

		System.out.println();
		System.out.println("*******************************");
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int age = rs.getInt("age");
			String grade = rs.getString("grade");
			System.out.println(id + " | " + name + " | " + age + " | " + grade);
		}
		System.out.println("*******************************");
		System.out.println();
		}catch(Exception e){
//			System.out.println("sql Exception");
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
////	step 5: Close the Resources
//		rs.close();
//		smt.close();
//		conn.close();
		System.out.println("Successfully close the all Resources");

	}
}
