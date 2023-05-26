package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CREATE_FB_ACCOUNT {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("shubham");
		
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("sengar");
		
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8999483178");
		
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("shubh1234");
		
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//select[@id='day']")).sendKeys("19");
		
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//select[@id='month']")).sendKeys("oct");
		
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1995");
		
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@value='2']")).click();
		
		
	}
	
	
	
	
}
