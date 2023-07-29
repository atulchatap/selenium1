package POM_DDF_TESTNG_Baseclass_Utilityclass_;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	WebDriver driver;
	public void Initializebrowser() throws IOException 
	{
		
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(UtilityClass.GetPFdata("URL"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
}
