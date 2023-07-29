package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class practice1 {

	@Test(groups="medicines")
	public void tc1() 
	{
		Reporter.log("---running tc1-medicines-", true);
	}
	
	@Test(groups="policy")
	public void tc2() 
	{
		Reporter.log("---running tc2-policy-", true);
	}
	
	@Test(groups="doctor")
	public void tc3() 
	{
		Reporter.log("---running tc3-doctor-", true);
	}
	
	@Test(groups="petient")
	public void tc4() 
	{
		Reporter.log("---running tc4-petient-", true);
	}
	
	@Test(groups="accounts")
	public void tc5() 
	{
		Reporter.log("---running tc5-accounts-", true);
	}
	
}
