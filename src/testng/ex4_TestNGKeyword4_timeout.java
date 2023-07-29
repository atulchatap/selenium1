package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex4_TestNGKeyword4_timeout {

	@Test(timeOut=5000)
	public void m1() throws InterruptedException 
	{
		Thread.sleep(3000);
		Reporter.log("running test case method m1", true);
	}
	@Test(timeOut=3000)
	public void m2() throws InterruptedException 
	{
		Thread.sleep(4000);
		Reporter.log("running test case method m2", true);
	}
	
	
}
