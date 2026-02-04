package com.oops.inheritance.tasks;

public class PatientDetails {
	private int patient_Id;
	private String patient_Name;
	private int days_Admitted;
	private double daily_Charges;
	private double medicine_Charges;

	public int getPatient_Id() {
		return patient_Id;
	}

	public void setPatient_Id(int patient_Id) {
		this.patient_Id = patient_Id;
	}

	public String getPatient_Name() {
		return patient_Name;
	}

	public void setPatient_Name(String patient_Name) {
		this.patient_Name = patient_Name;
	}

	public int getDays_Admitted() {
		return days_Admitted;
	}

	public void setDays_Admitted(int days_Admitted) {
		this.days_Admitted = days_Admitted;
	}

	public double getDaily_Charges() {
		return daily_Charges;
	}

	public void setDaily_Charges(double daily_Charges) {
		this.daily_Charges = daily_Charges;
	}

	public double getMedicine_Charges() {
		return medicine_Charges;
	}

	public void setMedicine_Charges(double medicine_Charges) {
		this.medicine_Charges = medicine_Charges;
	}
	
	public double calculateBill() {
		return getDays_Admitted()*(getDaily_Charges()+getMedicine_Charges());
		
	}
	
	public double discountBill() {
		if(getDays_Admitted()<5 && getDays_Admitted()>0) {
			return calculateBill();
		}else if(getDays_Admitted()>5 && getDays_Admitted()<=10) {
			return calculateBill()*0.05;
		}else {
			return calculateBill()*0.1;
		}
	}
	
	public double displayBill() {
		return calculateBill()-discountBill();
	}

	@Override
	public String toString() {
		return "Patient Id:       "+getPatient_Id()+"\n"
				+"Patient Name:                "+getPatient_Name()+"\n"
				+"No of Days Patient Admitted: "+getDays_Admitted()+"\n"
				+"Daily charges:  			   "+getDaily_Charges()+"\n"
				+"Daily Medicine Charges: 	   "+getMedicine_Charges()+"\n"
				+"Calculate Bill: 			   "+calculateBill()+"\n"
				+"Discount Bill:			   "+discountBill()+"\n"
				+"Final Bill:				   "+displayBill();
	}
}
