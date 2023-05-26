package method_with_return_type;

public class example2 {

	public String name1(String ac) {
		 
		String s1= ac.toUpperCase();
		
		return s1;
	}
	public static int name1(int num0, int num9) {
		
		int s2= num0+num9;
		
		return s2;
	}
	public static void main(String[] args) {
		
		example2 ex1= new example2();
		String s1= ex1.name1("atul");
		System.out.println(s1);
		
	}
	
	
	
}
