package POM_DDF_TESTNG_Baseclass_Utilityclass_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fireboult1 {

	@Test
	public void name() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fireboltt.com/");	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='site-nav__link site-nav__link--icon medium-down--hide']")).click();
	}
	
}
