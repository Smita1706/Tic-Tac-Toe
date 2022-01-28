package com.bridgelabz.TicTacToeGame;

import java.util.Scanner;
public class TicTacToeGame {

	public static void UC1() {
		int i;
		char board[]=new char[10];
		for(i = 1 ; i < board.length ; i++) {
			board[i] = ' ';
		}
	}

	public static void UC2() {
		char User;
		char Computer = ' ';
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the letter X or O :");
		User = s.next().charAt(0);
		if(User == 'X') 
			Computer ='O';
		else if(User == 'O')
			Computer ='X';
		else
			System.out.println("Please enter the letter only X or O");
		System.out.println("Computers input is " + Computer);
	}

	public static void main(String [] args){
		UC1();
		UC2();
	}
}
