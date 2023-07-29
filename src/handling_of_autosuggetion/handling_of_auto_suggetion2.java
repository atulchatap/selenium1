package handling_of_autosuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_of_auto_suggetion2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("one plus");
		
		Thread.sleep(3000);
		
		List<WebElement> allresult = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		String exptext= "oneplus 11";
		
		for(WebElement a1:allresult)
		{
			String acctualtext = a1.getText();
			if(acctualtext.equals(exptext))
			{
				a1.click();
				break;
			}
		}
		
		
		
	}
	
	
}
