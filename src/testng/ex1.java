package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex1 {

	@Test
	public void m1() 
	{
		//System.out.println("hello");
		
		Reporter.log("test case pass", true);
	}
	@Test
	public void m2() 
	{
		//System.out.println("test case pass 2");
	
		Reporter.log("test case pass2", false);
	}
	
	
	
}
