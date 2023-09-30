package com.simplilearn.java.hello;

public class Sandwiches {
	
	public boolean hasSameBread(String [] sand1, String [] sand2) {
		
		return sand1[0].equals(sand2[0]) && 
				sand1[sand1.length-1].equals(sand2[sand2.length-1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] sandwich1 = {"white bread", "lettuce", "whdcdcite bread"};
		String [] sandwich2 = {"white bread", "tomato", "white bread"};

	//	String [] sandwich1 = {"brown  bread", "chicken", "brown  bread"};
	//	String [] sandwich2 = {"white bread", "chicken", "white bread"};

	//	String [] sandwich1 = {"toast", "cheese", "toast"};
	//	String [] sandwich2 = {"brown bread", "cheese", "toast"};

		Sandwiches res = new Sandwiches();
		
		boolean result =  res.hasSameBread(sandwich1, sandwich2);
				
		System.out.println(result);
	}

}
