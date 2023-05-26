package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_contains_attribute {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//a[contains(@class,'selected _51sy')]")).click();
	
	    //driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 ')]")).click();
		
		driver.findElement(By.xpath("//a[contains(@class,'selected _51sy')]")).click();
		
		
	}
	
	
	
	
	
}
