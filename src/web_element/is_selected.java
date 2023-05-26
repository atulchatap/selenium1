package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_selected {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(4000);
		
	    driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@type='radio'][1]")).click();
		
		Thread.sleep(4000);
		
	    boolean result=	driver.findElement(By.xpath("//input[@type='radio'][1]")).isSelected();
		
		System.out.println(result);
		
		
		
	}
	
	
	
	
	

}
