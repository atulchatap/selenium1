package web_table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class webtable_rowsize {
	
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		//int rowsize = driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();
		
		//System.out.println(rowsize);
		
		
		String text = driver.findElement(By.xpath("//table[@class='dataTable']//tr[5]//td[1]")).getText();
		
		System.out.println(text);
	}
	
	
	
	
	

}
