package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex4_TestNGKeyword4_Depends_upon {

	
	@Test
	public void login() 
	{
		Reporter.log("----running tc1---", true);
	}
	
	@Test(dependsOnMethods="login")
	public void logout() 
	{
		Reporter.log("----running tc2---", true);
	}
	
	@Test(dependsOnMethods= {"login","logout"})
	public void logout2() 
	{
		Reporter.log("----running tc2---", true);
	}
	
	
	
}
