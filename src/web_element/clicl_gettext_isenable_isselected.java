package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clicl_gettext_isenable_isselected {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		String gt = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
		System.out.println(gt);       //get text
		
		Thread.sleep(4000);
		                                  //click
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(4000);
		
		WebElement female = driver.findElement(By.xpath("//input[@type='radio'][1]"));
		female.click();                         //click
		
		Thread.sleep(4000);
		
		boolean result = female.isSelected();         //is selected
		
		if(result)
		{
			System.out.println("button is selected");
		}
		else
		{
			System.out.println("button is not selected");
		}
		Thread.sleep(4000);
		
		boolean ie = driver.findElement(By.xpath("//button[text()='Sign Up']")).isEnabled();
		System.out.println(ie);                //is enable
		
		
	}
	
}

