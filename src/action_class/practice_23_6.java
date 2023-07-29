package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class practice_23_6 {
	
	@Test
	public void MOveToElement() throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fireboltt.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(2000);
		WebElement notify = driver.findElement(By.xpath("(//button[text()='Notify Me'])[1]"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(notify).perform();
		Thread.sleep(2000);
		//WebElement rightclick = driver.findElement(By.xpath("//img[@alt='Ninja Call Pro Max']"));
		//a1.contextClick(rightclick).perform();
		//a1.contextClick(driver.findElement(By.xpath("//img[@alt='Ninja Call Pro Max']")));
		Thread.sleep(2000);
		a1.doubleClick(notify);
		Thread.sleep(2000);
		notify.click();
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
	}
	
	

}
