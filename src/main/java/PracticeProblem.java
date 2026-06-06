/*
 
	Author - Salma Danane
	File Name - Computer Science Culminating; text based guessing game
	Date Created - June 1st, 2026
	Date Last Modified - June 10th, 2026

*/

/*    SELF NOTES

shorten all comments slama ans 
import dictonary option
think abt graphics - if i use graphics -> get rid of introduction text

either use dictornary or make a super long list of all words i want to use (place at end of code)

*/

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

b

public class PracticeProblem {

	public static void main(String[] args[]) { 

		Scanner input = new Scanner(System.in); // getting user input
		Random r = new Random(); // used to generate a random numeber

		// arraylist of words for the user to guess
		String[] words = {"eagle", "apple", "corny", "quirk", "gnome", "cruet", "okapi"}; // list of a mix of unique and common words, this will be the list of words that the user will have to guess
  
		// my variables

		int rounds; // number of rounds user wants to play
		int maxAttempts = 6; // maximume number of attempts user has at guessing the word
		int picker; // this will be the number used to pick the word in the words list
		String playAgain; // string for if user wants to play wordle again -- this is used on starting line [PLACEHOLDER TEXT] and loops over and is continuely used (until they runout of words)
		
		String word2Guess = r.nextInt(7); // function to pick the word - there are 7 word in the wordlist so the num has to be 1-7 inclusive

		String userYes; // user input if they want to play the game

		// Game introduction text
		System.out.println("-----WORDY-----");
		System.out.println("Welcome to the Wordy game!");
		System.out.println("-----GAME RULES-----");
		System.out.println("- Guess the random 5 letter word/n- Only full 5 letter words excepted (no less, no more)/n- No symbols, charactors, or numbers accepted/n- Have fun!"); // read proposal for menu
		System.out.println("Would you like to play? Enter 'yes' or 'no' ");

		gameStart = input.nextLine(); // getting user input, user should say yes to play the game
        String gameStart = input.nextLine().trim().toLowerCase(); // accepting user input, converting it to lowercase, and getting rid of whitespace all in one line 

		// end the game
        if (!gameStart.equals("yes")) { // if they dont want to play the game doesn't run at all.
            input.close(); // closing scanner and ending game
            return;        // game over
        }

	

	  

	  /*
	For generating word 
	 
	 int index = r.nextInt(7)    // to generate a random number from 1-7 (?)
	 String wordtoguess = words[index]     // arraylist then index of it
	 
	  */

	 /* 
	 for not repeatinh
	 
	 */

	 /*
	 	// maybe delete this line - if user doesnt want to play just dont run the code instead of asking them to say yes
        for accepting user input to make them play the wordle
		while (userYes != "yes") {  
          System.out.println("Invalid Input!");
          System.out.print("");
          userYes = input.nextInt();

      } */

	   


}
} 
