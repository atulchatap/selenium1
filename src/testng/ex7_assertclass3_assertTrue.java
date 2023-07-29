package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ex7_assertclass3_assertTrue {

	@Test
	public void tc1() 
	{
		 boolean actresult = false;
		
		//Assert.assertTrue(actresult);
		Assert.assertTrue(actresult, "failed:both results are diffrent");
	}
	
}
