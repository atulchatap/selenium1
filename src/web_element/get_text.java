package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_text {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(4000);
		
	String fp=	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
		
		System.out.println(fp);
		
		
		
	}
	
	
	
	
	

}
