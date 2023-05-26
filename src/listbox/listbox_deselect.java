package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox_deselect {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(4000);

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		Thread.sleep(4000);
		
		WebElement month=  driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s = new Select(month);
		
		s.selectByVisibleText("Mar");
		
		Thread.sleep(3000);
		                              //3 ways to select 
		s.selectByValue("11");
		
		Boolean result=  s.isMultiple();
	
	    System.out.println(result);
		
		if(result)
		{
			System.out.println("listbox is of multi selectable");
		}
		else
		{
			System.out.println("listbox is of single selectable");
		}
		
		
		
		
		
		
		
}
}	

