/*
 
	Author - Salma Danane
	File Name - Computer Science Culminating; text based guessing game
	Date Created - June 1st, 2026
	Date Last Modified - June 10th, 2026

*/

/*    SELF NOTES
NEW
SHORTEN ALL COMMENTS 

think abt graphics (if code is finished on tues) - if i use graphics -> get rid of all talking introduction text

either use dictornary or make a super long list of all words i want to use (place at end of code)
connect AND sinc

put everything in order

use input validation for yes/no (if user wants to play the game)

*/

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList; 



public class Wordy {

	public static void main(String[] args[]) { 

		Scanner input = new Scanner(System.in); // getting user input
		Random r = new Random(); // used to generate a random numeber

		// arraylist of words for the user to guess // add more words and put this at end of code/ dont put at end of code

		String[] words = {"eagle", "apple", "corny", "quirk", "party", "gnome", "cruet", "okapi", "birth"}; // list of a mix of unique and common words, this will be the list of words that the user will have to guess
  
		// my variables

		int rounds; // number of rounds user wants to play
		int maxAttempts = 6; // maximume number of attempts user has at guessing the word
		// int picker; // this will be the number used to pick the word in the words list // dont do dis function
		String playAgain; // string for if user wants to play wordle again -- this is used on starting line [PLACEHOLDER TEXT] and loops over and is continuely used (until they runout of words)
		
		String word2Guess = r.nextInt(7); // function to pick the word - there are 7 word in the wordlist so the num has to be 1-7 inclusive

		String userYes; // user input if they want to play the game  // nono no
		String guess; // users guess for the word

		// Game introduction text
		System.out.println("-----WORDY-----");
		System.out.println("Welcome to the Wordy game!");
		System.out.println("-----GAME RULES-----");
		System.out.println("- Guess the random 5 letter word/n- Only full 5 letter words accepted (no less, no more)/n- No symbols, charactors, or numbers accepted/n- Have fun!"); //  display this only if user says yes to wanting to play the game
		System.out.println("Would you like to play? Enter 'yes' or 'no' ");

        String gameStart = input.nextLine().trim().toLowerCase(); // accepting user input, converting it to lowercase, and getting rid of whitespace all in one line 

		/* if checking user input to start the game
		    
		if (!gameStart.matches("[a-zA-Z]")) { // if user input isnt a letter in the alphabet 
        System.out.println("Invalid input");
		System.out.println("Would you like to play? Enter 'yes' or 'no' ");
		gameStart = input.nextLine().trim().toLowerCase();  
		}
        */


		// end the game  // put this at end of code
        if (!gameStart.equals("yes")) { // if they dont want to play the game doesn't run at all. if they dont input yes, then game it ends
            input.close(); 
            return;        
        }


		boolean feen = 3 > 67; // false boolean to start the game / dont do this

         // actual game code starts here

		while (feen == true) { // this doesnt work

			word2Guess = words[r.nextInt(words.length)]; // picking a word from the wordlist // this doesnt work - go back to random number function

            boolean userCorrect = false; // boolean for if the player guesses the word right (this will continuesly change througout the game)
            System.out.println("----- WORDY ROUND ONE -----"); // user message

            for (int attempt = 1; attempt <= maxAttempts; attempt++) { // looping for each of the users attemps until they reach the max attempts (67)

                System.out.print("Attempt " + attempt + ": "); // displaying users round for their attempt
                guess = input.nextLine().trim().toLowerCase(); // same function as before, take input, get rid of spaces and put it into lowercase to compare da word

			
                // checking user input to see if its valid
				if (!guess.matches("[a-zA-Z]{5}")) { // [REGEX function google]  has to be a five letter word that is apart of the alphabet (from a-z or A-Z) // easier to use than charisletter() function or 2 if statments to see if its 5 letters, and to see if its a valid text input
                    System.out.println("Must enter 5 letters.");
                    attempt--; // take away from the attempt so it doesnt count as part of the users guesses || Decrements/subtracts count back to original number before useres invalid guess

			     // checking if user has guessed the ENTIRE word correctly
                if (guess.equals(word2Guess)) {
                    guessedCorrectly = true; // changing the boolean to TRUE
                    System.out.println("Correct! You guessed the word!");
                    break; // get out da loop
                }

				// comapring each of the letters to on another to see if user has guessed correctly // worlde function
				for (int i = 0; i < 5; i++) { 
                    char guessChar = guess.charAt(i); // the charactor index/colomn of the word they have guessed
                    char charGuessWord = word2Guess.charAt(i); 
				
                    
                }




		}

	 
		
















	  /* this is wrong

      picking a random word useing the int function:

	  int randomIndex = r.nextInt(words.length); // dont do this its the same thing




	For generating word 
	 
	 int index = r.nextInt(7)    // to generate a random number from 1-7 (?)
	 String wordtoguess = words[index]     // arraylist then index of it
	 
	  */

	 /* 
	 for not repeatinh
	 
	 */

	 /* perhaps do dis? if you dont want to play wordle just turn of the tab, or dont ask user input to play the game

	 	// maybe delete this line - if user doesnt want to play just dont run the code instead of asking them to say yes
        for accepting user input to make them play the wordle
		while (userYes != "yes") {  
          System.out.println("Invalid Input!");
          System.out.print("");
          userYes = input.nextInt();

      } */

	   


}
} 
}

