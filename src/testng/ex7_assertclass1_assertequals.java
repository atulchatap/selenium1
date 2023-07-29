package testng;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;


public class ex7_assertclass1_assertequals {

	@Test
	public void tc1() 
	{
		 String actresult = "hii";
		 String expresult = "hello";
		 
		 Assert.assertEquals(actresult, expresult, "failed:both results are diffrent");   //classname.methodname();
		 
		 
	}
	
	
	
	
	
	
	
	
}
