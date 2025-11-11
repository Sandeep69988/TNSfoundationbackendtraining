package com.avn.tns.abstraction;

public  class busimpl implements bus {
	
	
	
	

	@Override
	public void start(int num) {
		// TODO Auto-generated method stub

		if(num>=MAX_LIMIT) {
			double passengers=pass+num;
			System.out.println("total no of passengers after boarding"+passengers);
		}else {
			System.err.println("Maximum capacity exceeded");
			
		}
		
	}

	@Override
	public void stop(int num) {
		// TODO Auto-generated method stub
		if(num>=MIN_LIMIT) {
			double passengers=pass-num;
			System.out.println("total no of passengers after leaving"+passengers);
		}else {
			System.err.println("Minimum  capacity not reached to run a bus");
			
		}
		
	}

}
