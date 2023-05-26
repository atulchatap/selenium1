package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_alertpopup {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("atul");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		
		//get text from popup
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
		//click on cancle button
		//driver.switchTo().alert().dismiss();
		
		//click on "ok" button 1st alertpopup
		driver.switchTo().alert().accept();
		
		//click on "ok" button 2nd alertpopup
		driver.switchTo().alert().accept();
		
		
		
		
	}
	
	
	
	
}
