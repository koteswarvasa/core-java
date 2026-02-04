package com.filehandling.tasks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentRecord {
	static String filename = "C:\\Users\\HAI\\workspaces\\project1\\src\\com\\filehandling\\tasks\\student.txt";

	public static void writeStudent(int stdId, String stdName) throws IOException {

		try (FileWriter fw = new FileWriter(filename, true)) {

			fw.write(stdId + "," + stdName + "\n");
			System.out.println("Student record saved");

		} catch (IOException e) {
			System.out.println("Error writing file");
		}
	}

	public static void readStudent() {
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			String line;

			while ((line = br.readLine()) != null) {
				String[] s = line.split(",");

				System.out.println("ID: " + s[0] + " | " + "Name: " + s[1]);
			}

		} catch (IOException e) {
			System.out.println("Error reading file");
		}
	}

	public static void main(String[] args) throws IOException {

		File f = new File(filename);

		if (!f.exists()) {
			System.out.println(f.createNewFile());
		}

		Scanner sc = new Scanner(System.in);

		while (true) {
			try {

				System.out.println("**********************************");
				System.out.println("1.Add Student");
				System.out.println("2.get the Student");
				System.out.println("3.Exit");

				System.out.println("Enter your choice: ");
				int choice = sc.nextInt();

				switch (choice) {
				case 1:
					System.out.println("Enter Student Id: ");
					int stdId = sc.nextInt();
					sc.nextLine();

					if (stdId <= 0) {
						throw new IllegalArgumentException("Invalid ID");
					}
					System.out.println("Enter Student Name: ");
					String stdName = sc.nextLine();

					if (stdName.isEmpty()) {
						throw new IllegalArgumentException("Invalid Name");
					}

					writeStudent(stdId, stdName);
					break;

				case 2:
					readStudent();
					break;

				case 3:
					sc.close();
					System.out.println("Program exited");
					return;

				default:
					System.out.println("Invalid choice !!");
				}
			} catch (InputMismatchException e) {
				System.out.println("Please ReCheck and After Enter integer or String related to the field !!");
				sc.next();
			}catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
