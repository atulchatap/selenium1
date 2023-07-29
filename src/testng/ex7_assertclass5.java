package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ex7_assertclass5 {

	//@Test
	public void tc1()
	{
		String actresult = "hello";
		String expresult = "hello";
		Assert.assertEquals(actresult, expresult);
		
		boolean result = false;
		Assert.assertTrue(result);
	}
	@Test
	public void a1()
	{
		String actual = "atul";
		String expected = "atul";
		
		Assert.assertEquals(actual, expected);
		
		boolean result1 = false;
		Assert.assertTrue(result1);
	}
	
	
	
	
	
	
}
