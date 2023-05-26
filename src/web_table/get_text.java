package web_table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_text {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///F:/software%20testing/html/table.html");
		
		//String text = driver.findElement(By.xpath("//table[@id='1234']//tr[3]//td[5]")).getText();
		//System.out.println(text);
		
		//String alltable = driver.findElement(By.xpath("//table[@id='1234']")).getText();
		//System.out.println(alltable);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='1234']//tr//td"));
        
		for(WebElement r1:rows)
		{
			System.out.println(r1.getText());
			
		}
		
		
	}

}
