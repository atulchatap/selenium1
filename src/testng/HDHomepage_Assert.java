package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HDHomepage_Assert {

	@Test
	public void VerifyHDHomepageText() 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.open-emr.org/demo/");
		String exptext = "Features";
		
		String acttext = driver.findElement(By.xpath("//a[text()='Features']")).getText();
	    System.out.println(acttext);
		Assert.assertEquals(acttext, exptext,"Failed: both the results are not same");
		
	    //Assert.assertNotEquals(acttext, exptext);
	    
	}
	
	
	
}
