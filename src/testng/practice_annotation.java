package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class practice_annotation {

	@Test
	public void tc1()
	{
		Reporter.log(" ---login the facebook--- ", true);
	}
	@BeforeClass
	public void open_browser()
	{
		Reporter.log("----open the browser----", true);
	}
	@AfterClass
	public void close_browser()
	{
		Reporter.log("---close the browser---", true);
	}
	@BeforeMethod
	public void open_tab()
	{
		Reporter.log("--open new tab---", true);
	}
	@AfterMethod
	public void close_tab()
	{
		Reporter.log("---close the tab---", true);
	}
	
	
	
	
	
	
	
	
	
}
