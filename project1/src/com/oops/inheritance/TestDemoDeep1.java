package com.oops.inheritance;


class Employee{
	int eid;
	String ename;
	Address1 address;
	
	
	public Employee(int eid, String ename, Address1 address) {
		this.eid = eid;
		this.ename = ename;
		this.address = address;
	}
	
	public Employee(Employee emp) {
		this.eid = emp.eid;
		this.ename = emp.ename;
		this.address = new Address1(emp.address.city);
	}
	
	
}

class Address1{
	String city;
	
	public Address1(String city) {
		this.city=city;
	}
}
public class TestDemoDeep1 {

public static void main(String[] args) {
	
	Address1 add = new Address1("Hyderabad");
	
	Employee emp1 = new Employee(1,"koti",add);
	System.out.println("***************************");
	System.out.println(emp1.eid);
	System.out.println(emp1.ename);
	System.out.println(emp1.address.city);
	System.out.println("***************************");
	
	Employee emp2 = new Employee(emp1);
	System.out.println(emp2.eid);
	System.out.println(emp2.ename);
	System.out.println(emp2.address.city);
	System.out.println("***************************");
	

	Employee emp3 = new Employee(emp1);
	emp3.eid=2;
	emp3.ename="krishna";
	emp3.address.city="Bangalore";
	
	System.out.println(emp3.eid);
	System.out.println(emp3.ename);
	System.out.println(emp3.address.city);
	System.out.println(emp1.address.city);
	System.out.println("***************************");
	
}
}
