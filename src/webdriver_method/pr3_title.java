package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pr3_title {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		String title= driver.getTitle();
		System.out.println(title);
		
		
	}
	

}
