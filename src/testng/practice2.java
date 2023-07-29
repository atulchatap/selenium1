package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class practice2 {

	@Test(groups="medicines")
	public void tc6() 
	{
		Reporter.log("---running tc6-medicines-", true);
	}
	
	@Test(groups="doctor")
	public void tc7() 
	{
		Reporter.log("---running tc7-doctor-", true);
	}
	
	@Test(groups="petient")
	public void tc8() 
	{
		Reporter.log("---running tc8-petient-", true);
	}
	
	@Test(groups="policy")
	public void tc9() 
	{
		Reporter.log("---running tc9-policy-", true);
	}
	
	@Test(priority=1,groups="accounts")
	public void tc10() 
	{
		Reporter.log("---running tc10-accounts-", true);
	}

	
}
