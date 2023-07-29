package POM_DDF_TESTNG_Baseclass_Utilityclass_;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Baseclass_FB {
	
	public WebDriver driver;
	public void initializebrowser() throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get(Utilityclass_FB.GetPFData("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
	}
	

}
