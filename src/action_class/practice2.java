package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.zomato.com/india");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ngpr = driver.findElement(By.xpath("//a[text()='Add restaurant']"));
		Actions a1 = new Actions(driver);
		
		a1.moveToElement(ngpr);
		Thread.sleep(3000);
		a1.contextClick(ngpr);
		
		
		
		
		
		
		
		
		
		
		
	}
}
