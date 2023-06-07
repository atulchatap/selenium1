package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class zomato {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.zomato.com/india");
		driver.manage().window().maximize();
		WebElement ngpr = driver.findElement(By.xpath("//h5[text()='Nagpur Restaurants']"));
		Thread.sleep(3000);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",ngpr);
		
		Actions a1 = new Actions(driver);
		Thread.sleep(3000);
		a1.click(ngpr).perform();
		Thread.sleep(2000);
		WebElement night = driver.findElement(By.xpath("//div[text()='Nightlife']"));
		a1.contextClick(night).perform();
	    //a1.doubleClick(night).perform();
		
	}

}
