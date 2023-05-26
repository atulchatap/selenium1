package scroll_up_down;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollintoview {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.zomato.com/india");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement english = driver.findElement(By.xpath("//div[@class='sc-zqptxt-7 iFttwN']"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",english);
		Thread.sleep(3000);
		
		WebElement indore = driver.findElement(By.xpath("//h5[text()='Indore Restaurants']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",indore);
		
	}
}
