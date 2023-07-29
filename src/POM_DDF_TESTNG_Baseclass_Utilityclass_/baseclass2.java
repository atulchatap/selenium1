package POM_DDF_TESTNG_Baseclass_Utilityclass_;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass2 {

	WebDriver driver;
	
	public void initializebrowser1()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
}
