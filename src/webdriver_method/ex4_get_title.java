package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4_get_title {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
	    driver.get("https://www.flipkart.com/");
		
	   String title = driver.getTitle();
	    
		System.out.println(title);
		
	}
	
	
	
	
}
