package com.consolebasedprojects;

import java.util.Scanner;

public class TicTocToe {
	static Scanner sc = new Scanner(System.in);
	static char[][] ch = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
	static char player = 'X';

	public static void displayBoard() {
		System.out.println("-------------");
		for (char[] c1 : ch) {
			System.out.print("| ");
			for (char c2 : c1) {
				System.out.print(c2 + " | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}

	public static boolean isWin() {
		for (int i = 0; i < ch.length; i++) {
			// for rows
			if (ch[i][0] == player && ch[i][1] == player && ch[i][2] == player) {
				return true;
			}

			// for cols
			if (ch[0][i] == player && ch[1][i] == player && ch[2][i] == player) {
				return true;
			}
		}

		if (ch[0][0] == player && ch[1][1] == player && ch[2][2] == player) {
			return true;
		}

		if (ch[0][2] == player && ch[1][1] == player && ch[2][0] == player) {
			return true;
		}

		return false;
	}

	public static boolean isDraw() {
		for (char[] c1 : ch) {
			for(char c2 : c1) {
				if(c2==' ') {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		boolean flag = true;
		while (flag) {
			displayBoard();
			System.out.println("Enter a row: ");
			int row = sc.nextInt();
			System.out.println("Enter a col: ");
			int col = sc.nextInt();

			if (row < 0 || row > 2 || col < 0 || col > 2 || ch[row][col] != ' ') {
				System.out.println("Invald move !!!!");
				System.out.println("Try again, please enter row and col value again !!");
				continue;
			}

			ch[row][col] = player;

			if (isWin()) {
				displayBoard();
				System.out.println(player + "  Win the game !!");
				break;
			}

			if (isDraw()) {
				displayBoard();
				System.out.println("Draw the game !! !!");
				break;
			}
			player = player == 'X' ? 'O' : 'X';
		}
	}
}
