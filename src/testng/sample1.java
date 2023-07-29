package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample1 {

	@Test
	public void m1() 
	{
		Reporter.log("---running method m1----", true);
	}
	
	@Test
	public void m2() 
	{
		Reporter.log("---running method m2----", true);
	}
	
	@Test
	public void m3() 
	{
		Reporter.log("---running method m3----", true);
	}
	
}
