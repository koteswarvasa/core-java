package com.filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestSeriDemo4 {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	
	FileInputStream fis = new FileInputStream("C:\\Users\\HAI\\workspaces\\project1\\src\\com\\filehandling\\abcd.seri");
	
	ObjectInputStream ois = new ObjectInputStream(fis);
	
	UserData ud = (UserData)ois.readObject();
	
	System.out.println(ud.username);
	System.out.println(ud.password);
	System.out.println(ud.card_no);
	System.out.println(ud.cvv);
	
	ois.close();
	
	
}
}
