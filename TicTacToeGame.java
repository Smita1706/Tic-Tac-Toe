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
	public static void main(String [] args){
		UC1();
	}
}
