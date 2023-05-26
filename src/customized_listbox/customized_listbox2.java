package customized_listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class customized_listbox2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Actions a1 = new Actions(driver);
		
		a1.click(month).perform();
		Thread.sleep(2000);
		a1.sendKeys(Keys.HOME).perform();
		
		for(int i=1; i<=5; i++)
		{
			a1.sendKeys(Keys.DOWN).perform();
			Thread.sleep(2000);
			
		}
		a1.sendKeys(Keys.ENTER).perform();
		
		
		
	}
}
