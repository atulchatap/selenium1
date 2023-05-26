package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_contains_text {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		
		//driver.findElement(By.xpath("//a[contains(text(),'new')]")).click(); 
		
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		
	}
	
	
	
	
}
