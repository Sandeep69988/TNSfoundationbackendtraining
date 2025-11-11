package com.avn.tns.abstraction;

public interface bus {
	
	//abstract method
	void start(int num);
	void stop(int num);
	
	//final variable
	final double pass=15;
	int MAX_LIMIT=60;
	int MIN_LIMIT=15;
	
	//default method
	default void greet() {
		System.out.println("welcome to TGSRTC");
	}
	
	//static method
	static void info() {
		System.out.println("Happy journey");
	}
	
	

}
