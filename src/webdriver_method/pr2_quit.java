package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pr2_quit {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.whatsapp.com/");
		driver.get("https://www.instagram.com/");
		driver.quit();
		
		
	}
	
	
	
}
