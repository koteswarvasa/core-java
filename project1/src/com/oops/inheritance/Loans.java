package com.oops.inheritance;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Loans {
	static Scanner sc = new Scanner(System.in);

//	"================= Aadhar validation ================"
	public boolean aadharValidation() {
		System.out.println("Enter your Aadhar Number: ");
		String aadhar = sc.nextLine();

		String aadharRegrex = "^[2-9][0-9]{11}$";
		return Pattern.matches(aadharRegrex, aadhar);
	}

//	"================= Pan validation ================"
	public boolean panValidation() {
		System.out.println("Enter your Pan Card Number: ");
		String pan = sc.nextLine();

		String panRegex = "^[A-Z]{5}[0-9]{4}[A-Z]{1}$";
		return Pattern.matches(panRegex, pan);
	}

//	"================= Mobile validation ================"
	public boolean mobileValidation() {
		System.out.println("Enter your Mobile Number: ");
		String mobile = sc.nextLine();

		String mobileRegex = "^[6-9][0-9]{9}$";
		return Pattern.matches(mobileRegex, mobile);
	}

//	"================= Employment Validation ================"
	public boolean employmentValidation() {
		System.out.println("Enter your Employment Type (Salaried/self-Employed)");
		String emp = sc.nextLine().toLowerCase();

		return emp.equals("salaried") || emp.equals("self-employed");
	}

//	"================= Work Experience ================"
	public int workExperience() {
		System.out.println("Enter your Work Experience: ");
		int work = sc.nextInt();

		return work;
	}

//	"================= Existing Loan Check ================"
	public boolean existingLoanCheck() {
		System.out.print("Any Existing Loans? (yes/no): ");
		String ans = sc.next().toLowerCase();

		return ans.equals("no");
	}

	// ================= EMI Burden =================
	public boolean emiBurdenCheck(double salary) {
		System.out.print("Enter Current Monthly EMI: ");
		double emi = sc.nextDouble();
		sc.nextLine();
		return emi <= salary * 0.40;
	}

	// ================= Loan Amount =================
	public double calculateLoanAmount(double salary) {
		return salary * 15;
	}

	// ================= EMI Calculation =================
	public double calculateEMI(double loanAmount, int years) {
		double rate = 10.5 / 12 / 100;
		int months = years * 12;
		return (loanAmount * rate * Math.pow(1 + rate, months)) / (Math.pow(1 + rate, months) - 1);
	}

//	"================= Get Loan ROI Info ================"
	public double getLoanROI() {
		return 10.5;
	}

//	"================= Age validation ================"
	public byte getAge() {
		System.out.println("Enter your Age: ");
		byte age = sc.nextByte();

		return age;
	}

//	"================= Cibil Score Info ================"
	public int getCibilScore() {
		System.out.println("Enter a Cibil Score: ");
		int cibil = sc.nextInt();
		return cibil;
	}

//	"================= Salary Info ================"
	public double getSalaryInfo() {
		System.out.println("Enter Monthly salary Info: ");
		double salary = sc.nextDouble();
		return salary;
	}
}
