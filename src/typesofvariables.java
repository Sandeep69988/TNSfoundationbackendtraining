// demo for Types of variables
public class typesofvariables {

	//instance variable 
	String name;
    int Id;
    int year;
    
	
	//static variable
    static String college = "AVN University";
	
	void studentinfo() {
		 System.out.println("Student Named " + name+ " is from "+ year+ " Batch  with the roll number of "+Id+" from the college "+college);
		
	}
	
	
	void  print() {
		//local variable
		String localVar="This is a local variable data";
		System.out.println("localvariable:"+localVar);
	}
	
	
}
