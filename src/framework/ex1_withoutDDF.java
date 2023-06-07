package framework;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex1_withoutDDF {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys("9752699306");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@id='central-loggin-with-pwd'])[2]")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='central-login-password']")).sendKeys("atul@1432");
        Thread.sleep(2000); 
        driver.findElement(By.xpath("//span[text()='Sign in']")).click();
        Thread.sleep(2000);
		WebElement account = driver.findElement(By.xpath("//div[text()='My Account']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(account).perform();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
		
		Set<String> allid = driver.getWindowHandles();
		ArrayList<String> s1 = new ArrayList<String>(allid);
		driver.switchTo().window(s1.get(1));
		Thread.sleep(2000);
		
		String acttext = driver.findElement(By.xpath("//input[@name='personName']")).getAttribute("value");
		String exptext = "atul chatap";
		
		if(acttext.equals(exptext))
		{
			System.out.println("tc pass");
		}
		else
		{
			System.out.println("tc fail");
		}
		driver.quit();
		
		
		
		
		
	}

}
