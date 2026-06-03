/*
 
	Author - Salma Danane
	File Name - Computer Science Culminating; text based guessing game
	Date Created - June 1st, 2026
	Date Last Modified - June 10th, 2026

*/

// june 3rd change

import java.util.Scanner;
import java.util.Random;

import java.util.ArrayList;
Import java.util.HashSet;


public class wordyGame {

	public static void main(String[] args[]) { // is this technically a function (string[])

		Scanner input = new Scanner(System.in); // getting user input
		Random r = new Random(); // used to generate a random numeber

		// arraylist of words for the user to guess
		String[] words = {"eagle", "apple", "corny", "quirk", "gnome", "cruet", "okapi", "notch"}; // list of a mix of unique and common words, this will be the list of words that the user will have to guess
  
		// my variables

		int rounds; // number of rounds user wants to play
		int maxAttempts = 6; // maximume number of attempts user has at guessing the word
		int picker; // this will be the number used to pick the word in the words list
		
		String word2Guess = r.nextInt(8); // function to pick the word - there are 8 word in the wordlist so the num has to be 1-7 inclusive

		String userYes; // user input if they want to play the game

		// Game introduction text
		System.out.println("-----WORDY-----");
		System.out.println("Welcome to the Wordy game!");
		System.out.println("-----GAME RULES-----");
		System.out.println("- Guess the random 5 letter word/n- Only full 5 letter words excepted (no less, no more)/n- No symbols, charactors, or numbers accepted/n- Have fun!"); // read proposal for menu
		System.out.println("Would you like to play? Enter 'yes' or 'no' ");
		userYes = input.nextLine(); // getting user input, user should say yes to play the game

		userYes = userYes.toLowerCase(); // convert user input to lowercase to compare it to 'yes'
		userYes = userYes.trim(); // getting rid of un-needed spaces user may have included in word


		// maybe delete this line - if user doesnt want to play just dont run the code instead of asking them to say yes

		while (userYes != "yes") {  
          System.out.println("Invalid Input!");
          System.out.print("");
          userYes = input.nextInt();
      }

	  

	  /*
	For generating word 
	 
	 int index = r.nextInt(7)    // to generate a random number from 1-7 (?)
	 String wordtoguess = words[index]     // arraylist then index of it
	 
	  */

	 /* 
	 for not repeating

	 use a hashset to make sure not to repeat the number, if number repeats then break the loop - like if all 8 of generated numbers are eqavalen then  break
	 
	 */





}
} 
