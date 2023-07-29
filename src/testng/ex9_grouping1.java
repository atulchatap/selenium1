package testng;

import org.checkerframework.checker.units.qual.Temperature;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex9_grouping1 {

	@Test(groups="login")
	public void m1() 
	{
		Reporter.log("running m1", true);
	}
	@Test(groups="setting")
	public void m2()
	{
		Reporter.log("running m2", true);
	}
	
	@Test(groups="login")
	public void m3() 
	{
		Reporter.log("running m3", true);
	}
	@Test(groups="username")
	public void m4()
	{
		Reporter.log("running m4", true);
	}
	
	
	
	
}
