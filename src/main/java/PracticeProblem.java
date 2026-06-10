/*
 
	Author - Salma Danane
	File Name - Computer Science Culminating; text based guessing game
	Date Created - June 1st, 2026
	Date Last Modified - June 10th, 2026

*/

import java.util.Scanner;
import java.util.Random;

public class Wordy { // this doesnt work

public static void main(String[] args) {

Scanner input = new Scanner(System.in);
Random r = new Random();



		// list of words for the user to guess

String[] words = { 
    "eagle", "apple", "corny", "quirk",
    "party", "gnome", "cruet", "okapi", "birth", "tired", "amuse", "angel", "angle", "class", "digit", "faith", "youth", "zesty", "vogue", "noise", "groan", "feign", "flunk", "fried", "glide", "human", "phone", "react", "right", "salad", "shore", "smart", "stank", "tizzy", "vixen", "youth", "trust", "onion", "taboo", "sweat", "snore", "scout", "bicep", "booze", "blush", "choir", "daisy", "elder", "endow", "flint", "honey", "jelly", "mimic", "plain", "nasal", "scowl", "spool", "taken", "trait", "yield"
}; // list of a mix of unique and common words, this will be the list of words that the user will have to guess

        // my variables


		int maxAttempts = 6; // maximume number of attempts user has at guessing the word
		String playAgain; // string for if user wants to play wordy again -- this is used on starting line [PLACEHOLDER TEXT] and loops over and is continuely used (until they runout of words)
		String gameStart; // to start the game (if user says yes)
		String word2Guess; // word thats in the list that user has to guess
		boolean guessedCorrectly; // used to display victory message or continue game if user has correctly guessed the word
		char wordChar; // characters in the actual word
        char guessChar; // characters in the useres guess (to compare to actual word)
		String guess; // users guess for the word

		

        // Game introduction text
		
System.out.println("");
System.out.println("----- WORDY -----");
System.out.println("Welcome to the Wordy game!");
System.out.println("----- GAME RULES -----");
System.out.println("");

// since there are no graphics used, these symbols "()", "[]", "_", are used to show user if they are right or wrong in their guess

System.out.println("- '[]' means letter is correct and in right place");
System.out.println("- '()' means letter is in word, but in wrong spot");
System.out.println("- '_' means that the letter is not in the word at all");

System.out.println("- Guess the random 5 letter word");
System.out.println("- Only full 5 letter words accepted");
System.out.println("- No symbols, characters, or numbers accepted");
System.out.println("- Have fun!");
System.out.println("");

System.out.print("Would you like to play? Enter 'yes' or 'no': ");

gameStart = input.nextLine().toLowerCase().replace(" ", ""); // taking user input, putting it in lowercase (to compare it to "yes") and getting rid of all of the spaces by replacing them with nothing all in one line

if (!gameStart.equals("yes")) {// if they dont want to play the game doesn't run at all. if they dont input yes, then game it ends
input.close();
return;
}

// actual game code starts here

do { // "do" loop ensures that this loop will run at least once, before another condition happends that decides whether or not the game happends again

word2Guess = words[r.nextInt(words.length)]; // picking a word from the wordlist

guessedCorrectly = false; // boolean for if the player guesses the word right (this will continuesly change througout the game)

System.out.println("");
System.out.println("----- ROUND -----");

for (int attempt = 1; attempt <= maxAttempts; attempt++) {
     // looping for each of the users attemps until they reach the max attempts (6 times)
            // put attempt with all the other variables

System.out.println("Attempt: " + attempt); // displaying users round for their attempt

guess = input.nextLine().toLowerCase().replace(" ", "");;// same function as before, take input, get rid of spaces and put it into lowercase to compare da word


// checking user input to see if its valid
if (!guess.matches("[a-zA-Z]{5}")) {// REGEX function] has been used to see if user input is a five letter word that is apart of the alphabet (from a-z or A-Z) for input validation
System.out.println("Enter 5 letters.");
attempt--;// take away from the attempt so it doesnt count as part of the users guesses || Decrements/subtracts count back to original number before useres invalid guess
continue; // continue/skiping the remaining code and going to the next cycle of my loop
}

// checking if user has guessed the ENTIRE word correctly
if (guess.equals(word2Guess)) {
guessedCorrectly = true; // changing the boolean to TRUE
System.out.println("Correct! You guessed the word!");
break; // breaking the loop
}

// comapring each of the letters to on another to see if user has guessed correctly
for (int i = 0; i < 5; i++) { // looping over for each letter 
guessChar = guess.charAt(i); // the charactor index/colomn of the word they have guessed
wordChar = word2Guess.charAt(i); // the charactors of the actual word



if (guessChar == wordChar) { // if the user gets the letter right and its also in the right index/place of the word
System.out.print("[" +
Character.toUpperCase(guessChar) + "]"); // displaying the users letter guessed w cancatination
}
else if (word2Guess.indexOf(guessChar) != -1) {// if user guesses the correct letter but its in the wrong colomn/index
System.out.print("(" +
Character.toUpperCase(guessChar) + ")");// printing the letter but showing its in the wrong column w camcatination
}
else { // if the letter in the users input is just completetly wrong
System.out.print(" _ "); // prints placement and nothing else // showing user if its wrong
}
}

System.out.println("");

if (attempt < maxAttempts) { // checking to see if user has any more attempts/guesses left
System.out.println("Attempts left: "
+ (maxAttempts - attempt)); // subtracting to show amound of messages left for user
}

System.out.println("");
}

System.out.println("");



if (guessedCorrectly) { // if guessedCorrectly is true (if they guessed right)
System.out.println("----------");
System.out.println("WIN"); // user message if they won
System.out.println("----------");
}
else { // if guessedCorrectly is false (user is wrong)
System.out.println("----------");
System.out.println("GAME OVER!");
System.out.println("The word was: " + word2Guess); // showing user the actual message
System.out.println("----------");
}



System.out.print("Play again? Enter 'yes' or 'no': ");
playAgain = input.nextLine().toLowerCase().replace(" ", "");

} while (playAgain.equals("yes"));  

System.out.println("End of Game"); // end of the game
input.close(); // closing my scanner
}
}
// end of code
