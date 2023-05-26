package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pr5_maxi_mini {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(4000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.manage().window().minimize();
		
	}
	
	
	
	
}
