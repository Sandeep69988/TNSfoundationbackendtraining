// executor main class
public class carmain {

	public static void main(String[] args) {
	  // class name object name=new constructor();
		
		car c=new car();
		c.speed=160;
		c.model="Honda";
		c.price=1700000;
		
		car c1=new car();
		c1.speed=180;
		c1.model="Tesla";
		c1.price=2000000;
		
		
		car c2=new car();
		c2.speed=200;
		c2.model="BMW";
		c2.price=5000000;
		
		
		c.start();
		c1.start();
		c2.start(); 

	}

}
