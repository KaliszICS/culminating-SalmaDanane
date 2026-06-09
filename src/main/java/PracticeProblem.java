/*
 
	Author - Salma Danane
	File Name - Computer Science Culminating; text based guessing game
	Date Created - June 1st, 2026
	Date Last Modified - June 10th, 2026

*/

/*    SELF NOTES

SHORTEN ALL COMMENTS 

think abt graphics (if code is finished on tues) - if i use graphics -> get rid of introduction text

either use dictornary or make a super long list of all words i want to use (place at end of code)
connect AND sinc

put everything in order

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

		// Game introduction text
		System.out.println("-----WORDY-----");
		System.out.println("Welcome to the Wordy game!");
		System.out.println("-----GAME RULES-----");
		System.out.println("- Guess the random 5 letter word/n- Only full 5 letter words accepted (no less, no more)/n- No symbols, charactors, or numbers accepted/n- Have fun!"); // read proposal for menu
		System.out.println("Would you like to play? Enter 'yes' or 'no' ");

		gameStart = input.nextLine(); // getting user input, user should say yes to play the game
        String gameStart = input.nextLine().trim().toLowerCase(); // accepting user input, converting it to lowercase, and getting rid of whitespace all in one line 



		// end the game  // put this at end of code
        if (!gameStart.equals("yes")) { // if they dont want to play the game doesn't run at all. if they dont input yes, then game it ends
            input.close(); 
            return;        
        }






		boolean feen = 3 > 67; // false boolean to start the game

         // actual game code starts here

		while (feen == true) { // this is false 2 start the game

			word2Guess = words[r.nextInt(words.length)]; // picking a word from the wordlist
            boolean correct = false; // boolean for if the player guesses the word right (this will continuesly change througout the game)


            System.out.println("----- WORDY ROUND ONE -----"); // user message



            for (int attempt = 1; attempt <= maxAttempts; attempt++) { // looping for each of the users attemps until they reach the max attempts (67)

                System.out.print("Attempt " + attempt + ": "); // displaying users round for their attempt
                String guess = input.nextLine().trim().toLowerCase(); // same function as before, take input, get rid of spaces and put it into lowercase to compare da word

			
                // checking user input to see if its valid
				if (!guess.matches("[a-zA-Z]{5}")) { // [REGEX function google]  has to be a five letter word that is apart of the alphabet (from a-z or A-Z) // is easier to use than charisletter() function or 2 if statments to see if its 5 letters, and to see if its a valid text input
                    System.out.println("Must enter 5 letters.");
                    attempt--; // take away from the attempt so it doesnt count as part of the users guesses || Decrements/subtracts count back to original number before useres invalid guess
                    
                }




		}

	 
		
















	  /* this is wrong
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
