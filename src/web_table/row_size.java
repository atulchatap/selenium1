package web_table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class row_size {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///F:/software%20testing/html/table.html");
		
		//List<WebElement> rows = driver.findElements(By.xpath("//table[@id='1234']//tr"));
		//int size = rows.size();
		//System.out.println(size);
		
		int rowsize = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
		System.out.println(rowsize);
		
	}

}
