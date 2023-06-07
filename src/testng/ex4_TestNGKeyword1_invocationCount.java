package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex4_TestNGKeyword1_invocationCount  {
	
	@Test(invocationCount=4)
	public void openBrowser() 
	{
		Reporter.log("open the browser", true);
	}

}
