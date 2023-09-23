package com.simplilearn.java.hello;

public class TemperatureCalculator {
	
	private double calculateToCelcius (double degreesFahrenheit){
		double degreesCelcius = (5/9.0) * (degreesFahrenheit - 32);
		return degreesCelcius;
	}

	public static void main(String[] args)throws Throwable {
		TemperatureCalculator calc= new TemperatureCalculator();
		
		System.out.println("From 0F to " + calc.calculateToCelcius(0)+ "C");
		System.out.println("From 212F to " + calc.calculateToCelcius(212)+ "C");

		}

}
