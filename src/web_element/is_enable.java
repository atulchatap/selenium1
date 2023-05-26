package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_enable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(4000);
		
	boolean	enable = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
	
			System.out.println(enable);
		
			if(enable)
			{
				System.out.println("button is enable");
			}
			else
			{
				System.out.println("button is disble");
			}
			
			
	}
	
}
