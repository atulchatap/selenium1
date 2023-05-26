package handling_of_autosuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("hyundai");
		Thread.sleep(2000);
		List<WebElement> allsearch = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		String exptext = "hyundai verna";
		for(WebElement a1:allsearch)
		{
			String allresult = a1.getText();
			if(allresult.equals(exptext))
			{
				a1.click();
				break;
			}
				
			
		}
		
		
		
	}

}
