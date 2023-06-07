package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex4_TestNGKeyword2_Priority1 {

	@Test                  // inbuilt 0 priority
	public void tc1()
	{
		Reporter.log("running tc 1", true);
	}
	@Test(priority=2)         //+ve priority
	public void tc2()
	{
		Reporter.log("running tc 2", true);
	}
	@Test(priority=1)       //+ve priority
	public void tc3() 
	{
		Reporter.log("running tc 3", true);
	}
	@Test(priority=-1)       //-ve priority
	public void tc4()
	{
		Reporter.log("running tc 4", true);
	}
	@Test(priority=1)        //+ve priority
	public void tc5()
	{
		Reporter.log("running tc 5", true);
	}
	@Test                    // inbuilt 0 priority
	public void tc6() 
	{
		Reporter.log("running tc 6", true);
	}
	
	
}
