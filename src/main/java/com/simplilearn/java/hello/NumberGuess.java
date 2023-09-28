package com.simplilearn.java.hello;


import java.util.Random;
import java.util.Scanner;

public class NumberGuess {	
	
	public static void boolean checkGuess(int guess , int rand ) {
		  if (guess == rand) {
	           System.out.println("That's right! My secret number was " + rand + "!");
	        } else {
	            System.out.println("Sorry, but I was really thinking of " + rand + ".");
	        }
		
	}

	public static void main(String[] args) {
		Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
                
        System.out.print("I am thinking of a number from 1 to 10. Can you guess? ");
        
        Scanner scanner = new Scanner(System.in);
        int userGuess = scanner.nextInt();
        System.out.println("Your guess: " + userGuess);
        
        NumberGuess.checkGuess(userGuess, randomNumber);
        
        
	}

}


