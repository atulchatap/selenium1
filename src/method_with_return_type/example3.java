package method_with_return_type;

public class example3 {
	
	public static void main(String[] args) {
		
	  example3 e1= new example3();
	String e2=  e1.name1("atulchatap");
		System.out.println(e2);
		
	}
	public String name1(String a1) 
	{
		String s1= a1.toUpperCase();
		return s1;
	}
	

}
