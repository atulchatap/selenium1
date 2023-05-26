package scroll_up_down;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class scroll_up_down1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//scrolldown
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
		Thread.sleep(2000);
		
		//scrollup
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-200)");
		
	}
}
