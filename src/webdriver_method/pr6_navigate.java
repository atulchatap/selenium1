package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pr6_navigate {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
	
		driver.navigate().to("https://www.whatsapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
		
		
	}
	
	
	
	
	
}
