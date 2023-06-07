package customized_listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Actions a1 = new Actions(driver);
		a1.click(month).perform();
		//a1.sendKeys(Keys.DOWN).perform();
		//Thread.sleep(2000);
		//a1.sendKeys(Keys.ENTER).perform();
		a1.sendKeys(Keys.HOME).perform();
		Thread.sleep(2000);
		for(int i=0; i<=9; i++)
		{
			a1.sendKeys(Keys.DOWN).perform();
			Thread.sleep(200);
			
		}
		a1.sendKeys(Keys.ENTER).perform();
		
		
		
	}
	
}
