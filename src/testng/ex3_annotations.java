package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ex3_annotations {
	
	@Test
	public void runningVerifyFullname()
	{
		Reporter.log("running verify full name", true);
	}

	@BeforeMethod
	public void loginToBrowser() 
	{
		Reporter.log("login to browser", true);
	}
	
	@AfterMethod
	public void logoutFromBrowser()
	{
		Reporter.log("logout from browser", true);
	}
	
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("open the browser", true);
	}
	
	@AfterClass
	public void closeBrowser() 
	{
		Reporter.log("close the browser", true);
	}
	
	@Test
	public void runningVerifyFullname2() 
	{
		Reporter.log("running verify full name 2", true);
	}
	
	
}
