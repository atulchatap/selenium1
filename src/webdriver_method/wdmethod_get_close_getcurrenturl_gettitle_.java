package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wdmethod_get_close_getcurrenturl_gettitle_ {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		
		Thread.sleep(4000);
		
		String currenturl = driver.getCurrentUrl();
		System.out.println("current url of facebook=  "+currenturl);
		
		
		
		Thread.sleep(4000);
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(4000);
		
		String title = driver.getTitle();
		System.out.println("title of current page=  "+title);
		
		
		
		
		
		
		
		
		
	}
	
}
