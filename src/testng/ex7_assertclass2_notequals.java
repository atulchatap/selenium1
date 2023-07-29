package testng;

import org.testng.Assert;
import org.testng.annotations.Test;


public class ex7_assertclass2_notequals {

	@Test
	public void tc1()
	{
		String actresult = "hello";
		String expresult = "hello";
		
		Assert.assertNotEquals(actresult, expresult,"failed");
				
				
	}
	
	
	
}
