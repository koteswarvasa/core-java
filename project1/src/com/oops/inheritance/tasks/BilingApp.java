package com.oops.inheritance.tasks;

public class BilingApp {
public static void main(String[] args) {
	PatientDetails pd1 = new PatientDetails();
	
	
	pd1.setPatient_Id(1);
	pd1.setPatient_Name("Praveen");
	pd1.setDaily_Charges(2000);
	pd1.setDays_Admitted(7);
	pd1.setMedicine_Charges(3000);
	
	System.out.println(pd1.toString());
}
}
