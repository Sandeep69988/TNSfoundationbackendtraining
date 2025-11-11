package com.avn.tns.abstraction;

public class busmain {

	public static void main(String[] args) {
       
		busimpl ob=new busimpl();
		ob.greet();
		bus.info();
		ob.start(60);
		ob.stop(1);
		
	}

}
