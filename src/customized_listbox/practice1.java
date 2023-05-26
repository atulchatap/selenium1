package customized_listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		//to select day
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Actions a2 = new Actions(driver);
		a2.click(day).perform();
		Thread.sleep(1000);
		a2.sendKeys(Keys.END).perform();
		Thread.sleep(1000);
		for(int j=1; j<=8; j++)
		{
			a2.sendKeys(Keys.UP).perform();
			Thread.sleep(300);
		}
		a2.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		//to select month
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Actions a3 = new Actions(driver);
		a3.click(month).perform();
		a3.sendKeys(Keys.END).perform();
		Thread.sleep(1000);
		a3.sendKeys(Keys.UP).perform();
		Thread.sleep(1000);
		a3.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		
		//to select year
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Actions a1= new Actions(driver);
		a1.click(year).perform();
		Thread.sleep(1000);
		a1.sendKeys(Keys.HOME).perform();
		Thread.sleep(1000);
		//a1.sendKeys(Keys.DOWN).perform();
		for(int i=1; i<=28; i++)
		{
			a1.sendKeys(Keys.DOWN).perform();
			Thread.sleep(200);
		}
		a1.sendKeys(Keys.ENTER).perform();
		
		
		
	}

}
