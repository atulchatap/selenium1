package POM_DDF_TESTNG_Baseclass_Utilityclass_;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass3 {

	WebDriver driver;
	public void initializebrowser() throws IOException 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Utilityclass3.getpfdata("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
}
