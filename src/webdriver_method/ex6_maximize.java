package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex6_maximize {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");

		Thread.sleep(4000);
		
		driver.manage().window().maximize();
		
	//	Options s1 = driver.manage();
	//	Window s2 = s1.window();
	//	s2.maximize();
		
		
	}
	
	
	
}
