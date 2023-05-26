package handling_of_multiple_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class print_alllinks_from_webpage {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		
		System.out.println(alllinks.size());
		
		for( WebElement a1:alllinks)
		{
			System.out.println(a1.getText());
		}
		
		
	}
	
	
}
