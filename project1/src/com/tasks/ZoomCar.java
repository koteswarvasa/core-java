package com.tasks;

import java.util.Scanner;

public class ZoomCar {

	static Scanner sc = new Scanner(System.in);
	
	String getName(String name) {
		return name;
	}

	int rentCar(int rent) {
		return rent;
	}

	int baseRental(int baseN,int r) {
		return baseN*r;
	}

	int fixedInsurence(int fixedI) {
		return fixedI;
	}

	void main() {
		System.out.println("Welcome to the ZoomCar Rentals ....");
		
		System.out.println("Enter a company name: ");
		String name=sc.nextLine();
		
		System.out.println("Enter a rent: ");
		int rent=sc.nextInt();
		int r=rentCar(rent);
		
		System.out.println("Enter a base Retal: ");
		int baseN=sc.nextInt();
		
		System.out.println("Enter a fixed Insurence: ");
		int fixedI=sc.nextInt();
		
		double totalCost = baseRental(baseN,r) + fixedInsurence(fixedI);
		
		System.out.println("======= Details =======");

		System.out.println("Name of the Company : " + getName(name));
		System.out.println("Rent of the Car: "+rentCar(rent));
		System.out.println("Base Rental Car: "+baseRental(baseN, r));
		System.out.println("Fixed Insurence: "+fixedInsurence(fixedI));
		System.out.println("Total Cost for the Rent Car : " + totalCost);

	}
}
