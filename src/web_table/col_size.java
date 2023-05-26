package web_table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class col_size {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///F:/software%20testing/html/table.html");
		
		int colsize = driver.findElements(By.xpath("//table[@id='1234']//tr//th")).size();
		
		System.out.println(colsize);
		
		
		
		
		
	}
}
