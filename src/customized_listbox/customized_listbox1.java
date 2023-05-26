package customized_listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class customized_listbox1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Actions a1 = new Actions(driver);
		Thread.sleep(2000);
		a1.click(month).perform();
		
		a1.sendKeys(Keys.UP).perform();
		Thread.sleep(2000);
		
		a1.sendKeys(Keys.ENTER).perform();
		
	}
	
}
