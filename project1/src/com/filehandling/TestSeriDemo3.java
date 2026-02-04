package com.filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class UserData implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	String username = "koteswar";
	int password = 123456;
	long card_no = 999499499393L;
	int cvv = 67532111;
}
public class TestSeriDemo3 {
	public static void main(String[] args) throws IOException {
		
		UserData ud = new UserData();
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\HAI\\workspaces\\project1\\src\\com\\filehandling\\abcd.seri");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(ud);
		
		oos.close();
	}
}
