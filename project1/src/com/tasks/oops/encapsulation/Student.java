package com.tasks.oops.encapsulation;

public class Student {

	private int studentId;
	private String name;
	private double total_fee;
	private double paid_fee;
	private double remaining_fee;

	public Student(int studentId, String name, double total_fee) {
		this.studentId = studentId;
		this.name = name;
		this.total_fee = total_fee;
		this.remaining_fee = total_fee;
	}

	public void payFee(double fee) {
		if (fee > total_fee || fee <= 0) {
			System.out.println("Invalid pay fee amount!...");
			return;
		} else {
			System.out.println("Pay amount Successfully!...");
			paid_fee += fee;
			remaining_fee -= fee;
		}
	}

	public double getRemainingFee() {
		return remaining_fee;
	}

	public void displayFeeStatus() {
		System.out.println("**********************************************");
		System.out.println("Student Id: " + studentId);
		System.out.println("Student name: " + name);
		System.out.println("Total_fee: " + total_fee);
		System.out.println("paid amount: " + paid_fee);
		System.out.println("Remaining Fee to be Paid: " + getRemainingFee());
		System.out.println("*********************************************");

	}

	@Override
	public String toString() {
		return "****************************************************\n" 
				+ "Student Id: " + studentId + "\n"
				+ "Student name: " + name + "\n" 
				+ "Total_fee: " + total_fee + "\n" 
				+ "paid amount: " + paid_fee + "\n"
				+ "Remaining Fee to be Paid: " 
				+ getRemainingFee() + "\n"
				+ "****************************************************";
	}

}
