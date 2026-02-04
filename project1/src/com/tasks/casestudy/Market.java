package com.tasks.casestudy;

import java.util.Scanner;

public class Market {
	static Scanner sc = new Scanner(System.in);
	int totalBill;
	double averagePrice;

	public static void main(String[] args) {

		//int totalBill = 0;
		//double averagePrice = 0;
//		System.out.println("Enter Number of Food items: ");
//		int NumberOffoodItems = sc.nextInt();

		System.out.println("======== Vegetables List =========");
		String foodItemsList = "1.Carrot\n" + "2.BeetRoot\n" + "3.Onions\n" + "4.Potato\n" + "5.Tomato\n"
				+ "6.Cucumber\n" + "4.ladiesFinger";
		System.out.println(foodItemsList);
		System.out.println();

		System.out.println("Enter Vegetable id: ");
		int id = sc.nextInt();

		switch (id) {

		case 1 -> {
			int CarrotpricePerKg = 54;
			System.out.println("Carrot price per kg is: " + CarrotpricePerKg);
			System.out.println("Enter how many kg we want: ");
			//int kg = sc.nextInt();

			//totalBill += (kg * CarrotpricePerKg);
		}
		
		case 2 -> {
		//	int pricePerKg = 54;
	//		System.out.println("Carrot price per kg is: " + beetRootpricePerKg);
			System.out.println("Enter how many kg we want: ");
		//	int kg = sc.nextInt();

			//totalBill += (kg * beetRootpricePerKg);
		}
		}

		sc.close();
	}
}
