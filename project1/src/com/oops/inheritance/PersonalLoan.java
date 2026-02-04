package com.oops.inheritance;

import java.util.Scanner;

public class PersonalLoan extends Loans{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("=============== Welcome to Koti's Personal Bank loans !! ==============");

		System.out.println();
		PersonalLoan p1 = new PersonalLoan();
		if (p1.aadharValidation() && 
			p1.panValidation() && 
			p1.mobileValidation()) {

			double salary = p1.getSalaryInfo();
			int cibil = p1.getCibilScore();
			byte age = p1.getAge();
			sc.nextLine();

			if (salary >= 25000 && 
				(cibil >= 750 && cibil<=900) && 
				age >= 22 && age <=60 &&
				p1.employmentValidation() &&
		        p1.workExperience() > 2 &&
		        p1.existingLoanCheck() &&
		        p1.emiBurdenCheck(salary)
				) {
				System.out.println("Congratulation you are eligible for Personal Loan !!");
				
				double loanAmount = p1.calculateLoanAmount(salary);
				System.out.println("How many years to Paid Total Loan Amount: ");
				int years = sc.nextInt();
                double emi = p1.calculateEMI(loanAmount, years);
                sc.nextLine();

                System.out.println("======= LOAN APPROVED =======");
                System.out.println("Eligible Loan Amount: Rs" + loanAmount);
                System.out.println("ROI: "+p1.getLoanROI());
                System.out.println("Tenure: "+years+" Years");
                System.out.println("Monthly EMI: Rs " + String.format("%.2f", emi));

			} else {
				System.out.println("Sorry, Your Not Eligible for this Personal Loan !.........");
			}
		} else {
			System.out.println("Sorry, Your Validations will not matching , Please verify the details again !.......");
		}

	}
}
