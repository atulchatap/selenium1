package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_byindex {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("atul");
		
		Thread.sleep(2000);
		
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("chatap");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9752699306");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("atul1234@");
	}
	
	
	
}
