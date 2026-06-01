/*
 
	Author - Salma Danane
	File Name - Computer Science Culminating; text based guessing game
	Date Created - June 1st, 2026
	Date Last Modified - June 10th, 2026

*/

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


public class PracticeProblem {

	public static void main(String[] args[]) { // is this technically a function (string[])

		Scanner input = new Scanner(System.in); // input
		Random r = new Random(); // used to generate a ran numeber

		// arraylist of words for the user to guess
		String[] words = {"eagle", "apple", "corny", "quirk", "gnome", "cruet", "okapi"}; // list of a mix of unique and common words, this will be the list of words that the user will have to guess
  
		// my variables

		int rounds; // number of rounds user wants to play
		int maxAttempts = 6; // maximume number of attempts user has at guessing the word
		int picker; // this will be the number used to pick the word in the words list
		

		String word2Guess = // function to pick the word

		// Game introduction text
		System.out.println("-----WORDY-----");
		System.out.println("Welcome to the Wordy game!");
		System.out.println("-----GAME RULES-----");
		System.out.println("- Guess the random 5 letter word/n- Only full 5 letter words excepted (no less, no more)/n- No symbols, charactors, or numbers accepted/n- Have fun!")
		System.out.println("How many rounds would you like to play?");


		
	//  start w a if statment - if they want to play run the program, if no ask them again if they want to play
	// like in problem set unit 4


	   


}
