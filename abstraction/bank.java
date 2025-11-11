package com.avn.tns.abstraction;

public interface bank {
	
	//abstract methods
	void withdraw(int amount);
	void deposit(int amount);
	
	//final variable
	final double bal=1000;
	int MAX_LIMIT=100000;
	int MIN_LIMIT=1000;
	
	//default method
	default void greet() {
		System.out.println("welcome to our bank");
		
	}
	
	//static method
	static void info() {
		System.out.println("UPI payments and credit cards payments are done today");
	}

}
