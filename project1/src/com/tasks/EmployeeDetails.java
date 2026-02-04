package com.tasks;

public class EmployeeDetails {
	Integer empNo = 1;
	String eName = "abcd";
	Integer salary = 5000;
	String hireDate = "12-01-2002";
	Integer experience = 2;

	Integer annualSalary = 12 * salary;
	Double annualBonus = annualSalary * 0.1;
	Double annualEarning = annualSalary + annualBonus;

	{
		System.out.println("Employee number: " + empNo);
		System.out.println("Employee Name: " + eName);
		System.out.println("HireDate: " + hireDate);
		System.out.println("Experience: " + experience);
		System.out.println("Annual Salary: " + annualSalary);
		System.out.println("Annual Bonus: " + annualBonus);
		System.out.println("Annual Earning: " + annualEarning);

	}

	void main() {

	}
}
