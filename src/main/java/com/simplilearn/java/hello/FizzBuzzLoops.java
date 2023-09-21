package com.simplilearn.java.hello;

public class FizzBuzzLoops {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1; i<=100; i++) {
			if ((i %3 == 0)&&(i %5 !=0)){
				System.out.println("Fizz");
			}
			else if ((i %3 != 0)&&(i %5 ==0)){
				System.out.println("Buzz");
			}
			
			else if ((i %3 == 0)&&(i %5 ==0)){
			//else if (i %15 == 0){
				System.out.println("FizzBuzz");
			}
			else {
				System.out.println(i);
			}
			
				
		}
				
	}

}
