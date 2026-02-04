package com.consolebasedprojects;

import java.util.Scanner;

public class NaukariQuestionary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tell me your Full name: ");
		String name = sc.nextLine();

		System.out.println("what is your Degree..?");
		String degree = sc.nextLine();

		if (degree.equals("btech")) {
			// System.out.println("Ok,your btech is degree matching for job requirements
			// !..");

			System.out.println("What is your branch..?");
			String branch = sc.nextLine();

			if (branch.equals("CSE") || branch.equals("IT") || branch.equals("ECE")) {
				// System.out.println("Ok,we moving to ask futher questions");

				System.out.println("Which year passout..?");
				int yearPassout = sc.nextInt();
				
				if (yearPassout == 2024 || yearPassout == 2025) {
					// System.out.println("Good,your passout is matched!..");

					System.out.println("What was your CGPA in Btech..?");
					float cgpa = sc.nextFloat();
					sc.nextLine();

					if (cgpa > 7.0 && cgpa < 10.0) {
						// System.out.println("Good,your are eligible for this job!..Ok,moving to
						// futher");
						System.out.println("what is your skill..?");
						String skills = sc.nextLine();

						if (skills.equals("java") || skills.equals("sql")) {
							// System.out.println("your skills are matched for this job!..");

							System.out.println("you are Fresher or Experience..?");
							String status = sc.nextLine();

							if (status.equals("Fresher")){
								// System.out.println("Ok ,we are eligible, move to futher!..");

								System.out.println("Are you willing to relocate..?");
								boolean reallocateStatus = sc.nextBoolean();

								if (reallocateStatus) {
									System.out.println("Are you available for full-time work immediately..?");
									boolean avaliableStatus = sc.nextBoolean();

									if (avaliableStatus) {
										System.out.println("How much you Expected the Salary..?");
										double salary = sc.nextDouble();

										if (salary < 600000) {
											System.out
													.println("Ok,good to say that "+name+" we are seleting for the 2 round!...");
										} else {
											System.out.println("Sorry,we are not able give that much amount!...");
										}
									}

								} else {
									System.out.println("Sorry,we are not looking not reallocating!...");
								}

							} else {
								System.out.println("Sorry,we are not looking Experienced!..");
							}
						} else {
							System.out.println("Sorry,your skills are not matched for this job!..");
						}

					} else {
						System.out.println("You are not eligible for this job");
					}

				} else {
					System.out.println("Sorry,Your passout is not matched for this job!...");
				}
			} else {
				System.out.println("Sorry,we are not looking for this branch!..");
			}

		} else {
			System.out.println("Sorry,we are not selected !..");
		}

		System.out.println("");
		sc.close();
	}
}
