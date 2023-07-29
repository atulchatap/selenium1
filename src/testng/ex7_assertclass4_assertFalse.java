package testng;

import org.testng.Assert;
import org.testng.annotations.Test;


public class ex7_assertclass4_assertFalse {

	@Test
	public void name() 
	{
		boolean actresult = true;
		Assert.assertFalse(actresult, "failed:both result are same");
	}
	
	
	
	
}
