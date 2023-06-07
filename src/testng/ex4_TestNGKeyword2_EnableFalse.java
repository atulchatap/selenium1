package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex4_TestNGKeyword2_EnableFalse  {
	
	@Test
	public void openBrowser() 
	{
		Reporter.log("open the browser", true);
	}

	@Test
	public void enterPassword() 
	{
		Reporter.log("enter the password", true);
	}
	
	@Test(enabled=false)
	public void clicklogin() 
	{
		Reporter.log("click on login button", true);
	}
	
	
	
}
