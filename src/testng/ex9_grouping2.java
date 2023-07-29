package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex9_grouping2{

	@Test(groups="setting")
	public void n1() 
	{
		Reporter.log("running n1", true);
	}
	@Test(groups="login")
	public void n2()
	{
		Reporter.log("running n2", true);
	}
	
	@Test(groups="username")
	public void n3() 
	{
		Reporter.log("running n3", true);
	}
	@Test(groups="username")
	public void n4()
	{
		Reporter.log("running n4", true);
	}
	
}
