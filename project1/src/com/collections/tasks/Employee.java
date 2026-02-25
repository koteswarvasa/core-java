package com.collections.tasks;

public class Employee implements Comparable<Employee>{
	private int empId;
	private String empName;
	private int age;
	private double salary;
	
	
	public Employee() {} 
	
	public Employee(int empId,String empName,int age,double salary) {
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
	}
	
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee e) {
		
//		By using the if-else
		
//		if(this.empId<e.empId) {
//			return -1;
//		}else if(this.empId>e.empId) {
//			return 1;
//		}else {
//			return 0;
//		}
		
//		By USing the Interger Method like 
		return Integer.compare(this.empId, e.empId);
//		return this.empId-e.empId;
	}
	
	
	
	
}
