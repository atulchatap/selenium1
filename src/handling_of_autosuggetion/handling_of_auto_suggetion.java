package handling_of_autosuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_of_auto_suggetion {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
		
		Thread.sleep(3000);
		
		 List<WebElement> allsearch = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		 String exptext= "redmi note 10";
		 
		for( WebElement a1:allsearch)
		{
		      String alloption = a1.getText();
			 if(alloption.equals(exptext))
			 {
				 a1.click();
				 break;
			 }
		      
		}
		
		
		
	}
}
