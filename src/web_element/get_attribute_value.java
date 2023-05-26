package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_attribute_value {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(4000);
		
	    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("atul");
		
		Thread.sleep(4000);
	    
	  String un=  driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-'][1]")).getAttribute("value");
	 
	  System.out.println(un);
	  
	}
	
	
	
	
	
}
