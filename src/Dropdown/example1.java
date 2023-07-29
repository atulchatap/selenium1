package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class example1 {
	
	@Test
	public void dropdown1() 
	{
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(cr);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//label[text()='From']")).sendKeys("nagpur");
		driver.findElement(By.xpath("//label[text()='To']")).sendKeys("pune");
		driver.findElement(By.xpath("//text[text()='Date']")).click();
		
		//while()
		{
			
		}
		
		
		
		
	}
	
	

}
