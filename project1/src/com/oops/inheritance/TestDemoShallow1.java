package com.oops.inheritance;


class Student implements Cloneable{
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	int sid;
	String sname;
	Address address;
	
	
	public Student(int sid, String sname, Address address) {
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}
	
	
	
}


class Address{
	String city;

	public Address(String city) {
		this.city = city;
	}
	
	
}


public class TestDemoShallow1{
	
	
public static void main(String[] args) throws CloneNotSupportedException{
	
	Address add = new Address("Hyderabad");
	
	Student s1 = new Student(1,"koti",add);
	System.out.println("***************************");
	System.out.println(s1.sid);
	System.out.println(s1.sname);
	System.out.println(s1.address.city);
	System.out.println("***************************");
	
	
	Student s2 = (Student) s1.clone();
	System.out.println(s2.sid);
	System.out.println(s2.sname);
	System.out.println(s2.address.city);
	System.out.println("***************************");
	
	s2.sid=2;
	s2.sname="krishna";
	s2.address.city="bangalore";
	System.out.println(s2.sid);
	System.out.println(s2.sname);
	System.out.println(s2.address.city);
	System.out.println(s1.address.city);
	System.out.println("***************************");
	
	
	
	
}
}
