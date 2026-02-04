package com.tasks;

public class HomeLoan {
	String borrowName;
	double loanAmount;
	int years;
	double totalRepay;
	
	static {
		System.out.println("----- Home Loan Department Activated -----");
		System.out.println();
		
	}
	
	void calclateRepayment(){
		
		totalRepay=loanAmount+(0.08*loanAmount*years);
		System.out.println("Total Repay After tax:"+totalRepay);
				
	}
	
	void showDetails() {
		System.out.println("****** User Details *****");
		System.out.println("Borrower Name:"+borrowName);
		System.out.println("Loan Amount:"+loanAmount);
		System.out.println("Years:"+years);
		System.out.println("Total amount after tax is:"+totalRepay);
		System.out.println();
	}
	
	
	 void main() {
		HomeLoan h1=new HomeLoan();
		
		h1.borrowName="Lucky";
		h1.loanAmount=5000;
		h1.years=10;
		
		h1.calclateRepayment();
		h1.showDetails();
		
		HomeLoan h2=new HomeLoan();
		
		//object 2
		
		h2.borrowName="Lucky";
		h2.loanAmount=5000;
		h2.years=10;
		
		h2.calclateRepayment();
		h2.showDetails();
		
		
	}

}
