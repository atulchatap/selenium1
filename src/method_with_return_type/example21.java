package method_with_return_type;

public class example21{

	public static int ghoti1(int a1, int a2) {
		int b1= a1*a2; 
		return b1;
	}
    public String quantity(String q1) {
		return q1;
    	
	}
	
	public static void main(String[] args) {
		
		int n1=example21.ghoti1(10, 20);
		System.out.println(n1);
		
		example21 ex21 = new example21();
	    String n2=	ex21.quantity("running same class non static method");
		System.out.println(n2);
		
	}
	
}
