package com.avn.tns.abstraction;

public class bankmain {

	public static void main(String[] args) {
          
		bank ob=new bankimpl();
		ob.greet();
		bank.info();
		ob.deposit(90000);
		ob.withdraw(500);
		
		
	}

}
