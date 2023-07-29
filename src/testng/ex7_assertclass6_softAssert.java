package testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ex7_assertclass6_softAssert {

	@Test
	public void tc1() 
	{
		SoftAssert soft = new SoftAssert();
		
		String actresult = "hello";
		String expresult = "hii";
		soft.assertEquals(actresult, expresult);
		
		boolean actresult1 = true;
		soft.assertFalse(actresult1);
		
		soft.assertAll();
	}
	
	
}
