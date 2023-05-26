package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_displayed {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		 Thread.sleep(4000);
		
		boolean result= driver.findElement(By.xpath("//i[@aria-label='Instagram']")).isDisplayed();
		
		System.out.println(result);
		
		if(result)
		{
		System.out.println("logo is displaying");
		}
		else
		{
			System.out.println("logo is not displaying");
		}
	
		
		
		
		
	}
	
	

}
