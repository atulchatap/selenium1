package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class send_keys__clear {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(4000);
		
		WebElement un = driver.findElement(By.xpath("//input[@type='text']"));    //stored in object un
		
	    un.sendKeys("atul");     //send keys keyword
			
		Thread.sleep(4000);	
		
		un.clear();              //clear keyword
		
		Thread.sleep(4000);
		
		un.sendKeys("atul chatap");      //send keys keyword
		
				
	}
	
	
	
	
}
