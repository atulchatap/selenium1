package method_with_return_type;

public class example1 {

	public static int add(int a, int b) {
		
		int c= a+b;
		return c;
		}
	
	public int mult(int d, int e) {
		
		int f=d*e;
		return f;
		}
	
	public static void main(String[] args) {
		
		int num1= add(10, 20);
		System.out.println(num1);
		          //or                       //same class static method
		System.out.println(add(5, 8));
		
		System.out.println("----------");
		
		example1 ex1= new example1();
		int num2= ex1.mult(5, 10);       //same class nonstatic method
	    System.out.println(num2);
	    
	    System.out.println("---diffrent class method---");
	    
	   int cal=  example2.name1(50, 60);
	   System.out.println(cal);            //diffrent class static method
	           //or
	   System.out.println(example2.name1(55, 65));  
	    
	   System.out.println("------------");
	   
	   example2 ex2= new example2();
	   String nam=   ex2.name1("running diff class string nonstatic method");
	         
	   System.out.println(nam);           //diff class string nonstatic method
	   
	}
	
	
	
}
