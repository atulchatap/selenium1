package action_class;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DropDown {
	
	@Test
	public void DD() throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fireboltt.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
