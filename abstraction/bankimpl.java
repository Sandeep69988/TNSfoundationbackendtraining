package com.avn.tns.abstraction;

public class bankimpl implements bank{

	@Override
	public void withdraw(int amount) {
         if(amount>=MIN_LIMIT) {
        	 double balance=bal-amount;
        	 System.out.println("the money after withdraw is "+balance);
         }else {
        	 System.err.println("insufficient balance");
         }
	}

	@Override
	public void deposit(int amount) {
		 if(amount<=MAX_LIMIT) {
        	 double balance=bal+amount;
        	 System.out.println("the money after deposit is "+balance);
         }	else {
        	 System.err.println("maximum amount reached for the day");
         }
	}
	
	

}
