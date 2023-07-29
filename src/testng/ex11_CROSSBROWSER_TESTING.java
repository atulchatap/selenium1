package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ex11_CROSSBROWSER_TESTING {

	@Parameters("browsername")
	@Test
	public void name(String browsername) throws InterruptedException
	{
		WebDriver driver= null;
		
		if(browsername.equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		
		else if(browsername.equals("edge"))
		{
			driver= new EdgeDriver();
		}
		
		else if(browsername.equals("firefox"))
		{
			driver= new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.quit();
		
		
	}
	
}
