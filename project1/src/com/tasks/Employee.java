package com.tasks;

public class Employee {
	String empName="KING";
	double salary=5000;
	int cgst=10;
	int pf=7;
	int da=8;
	
	void grossSalaryMonthly(){
		System.out.println("Gross Salary Monthly:"+salary);
		
	}
	
	void netSalaryMonthly() {
		System.out.println("======= salary Monthly =======");
		double cgstAmt=(salary*0.10);
		double pfAmt=(salary*0.07);
		double daAmt=(salary*0.08);
		double netSal=salary-cgstAmt-pfAmt+daAmt;
		System.out.println("Cgst amount:"+cgstAmt);
		System.out.println("pf amount:"+pfAmt);
		System.out.println("da amount:"+daAmt);
		System.out.println("Net Salary Monthly:"+netSal);
		
	}
	
	void grossSalaryYearly() {
		System.out.println("Gross Salary Yearly:"+salary*12);
	}
	
	void netSalaryyearly() {
		System.out.println("======= salary Yearly =======");
		double yearSal=salary*12;
		double cgstAmt=(yearSal*0.10);
		double pfAmt=(yearSal*0.07);
		double daAmt=(yearSal*0.08);
		double netSal=yearSal-cgstAmt-pfAmt+daAmt;
		System.out.println("Cgst amount:"+cgstAmt);
		System.out.println("pf amount:"+pfAmt);
		System.out.println("da amount:"+daAmt);
		System.out.println("Net Salary Yearly:"+netSal);
		
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.netSalaryMonthly();
		e1.grossSalaryMonthly();
		System.out.println();
		
		e1.netSalaryyearly();
		e1.grossSalaryYearly();
	}

}
