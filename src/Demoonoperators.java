//demo for different types of operators
public class Demoonoperators {

	public static void main(String[] args) {
		
		//Arithmetic operators
		int x=10, y=2;
		
		
		
		
		System.out.println("The Addition value:"+(x+y));
		System.out.println("The Subtraction value:"+(x-y));
		System.out.println("The Multiplication value:"+(x*y));
		System.out.println("The Division value:"+(x/y));
		
		//assignment operators(=,+=,*=,-=,/=)
		int z=x;
		System.out.println("The value of z:"+z);//10
		 z+=y;  //z=z+y;
		System.out.println("The value of z:"+z);//12
		
		
		//relational operators(<=,>=,==,!=)
		System.out.println(x==y);
		
		//logical operators(&,^,&&,|,~)
		System.out.println( "The result of AND operation is "+(x&y)); // 2
		
		
		//unary operators (++,--)
		int d=10;
		//post increment
		d++;
		System.out.println("The Post increment value of d is "+d);// 11
		
		//pre increment
		++d;
		System.out.println("The Pre increment value of d is "+d); // 12
		
		d--;
		System.out.println(d); // 11
		
		--d;
		System.out.println(d); // 10
		
		
		//ternary operator(condition?true:false )
		
		int c=12;d=6;
		int max=(c>d?c:d);
		
	    System.out.println(max);
		
		
		
		
		

	}

}
