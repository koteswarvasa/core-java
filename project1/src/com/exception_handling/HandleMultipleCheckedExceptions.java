package com.exception_handling;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HandleMultipleCheckedExceptions {
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException{
		
		
		File f = new File("./xyz.txt");
		
		if(!f.exists()) {
			System.out.println(f.createNewFile());
		}
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentd","root","root");
	
		Statement smt = conn.createStatement();
		
		ResultSet rs = smt.executeQuery("select * from student");
		
		rs.close();
		
		
		
		
		
		
	}
}
