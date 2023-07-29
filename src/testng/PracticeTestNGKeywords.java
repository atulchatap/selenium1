package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticeTestNGKeywords {
	
	@Test(invocationCount=4,priority=2)
	public void tc1() 
	{
		Reporter.log("running tc1", true);
	}

	@Test(timeOut=5000, priority=1)
	public void tc2() throws InterruptedException 
	{
		Thread.sleep(6000);
		Reporter.log("running tc2", true);
	}
	
	@Test(enabled=false)
	public void tc3() 
	{
		Reporter.log("running tc3", true);
	}
	
	@Test(dependsOnMethods="tc2")
	public void tc4() 
	{
		Reporter.log("running tc4", true);
	}
	
	
}
