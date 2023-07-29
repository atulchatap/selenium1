package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracticeCROSSBrowser {

	@Parameters("browsername")
	@Test
	public void browser(String browsername) throws InterruptedException 
	{
		WebDriver driver = null;
		if(browsername.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(browsername.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		
		else if(browsername.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
	}
	
}
