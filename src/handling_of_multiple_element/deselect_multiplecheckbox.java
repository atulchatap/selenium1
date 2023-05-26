package handling_of_multiple_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class deselect_multiplecheckbox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("F:\\software testing\\html\\checkbox.html");
		
		List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		allcheckbox.size();
		
		//for(int i=0; i<=allcheckbox.size(); i++)
		//{
		//	allcheckbox.get(i).click();
		//	Thread.sleep(500);
		//}
		
		for(WebElement a1:allcheckbox)
		{
			a1.click();
			Thread.sleep(500);
		}
		
		for(int j=allcheckbox.size()-1; j>=0; j--)
		{
			allcheckbox.get(j).click();
			Thread.sleep(500);
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
