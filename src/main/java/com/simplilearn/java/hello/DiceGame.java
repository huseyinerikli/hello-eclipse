package com.simplilearn.java.hello;
import java.util.Random;
public class DiceGame {
		
	public void rollDice() {		 
		Random random = new Random();	    
	    int first = random.nextInt(6) + 1;
	    int second = random.nextInt(6) + 1;        
	    int total = first + second;	
	    
	    System.out.println("HERE COMES THE DICE!");
        System.out.println("Roll #1: " + first);
        System.out.println("Roll #2: " + second);
        System.out.println("The Total is " + total + "!");
	}		
	
	public static void main(String[] args) {
       
		DiceGame res = new DiceGame();
		
		res.rollDice();       
	}
}



