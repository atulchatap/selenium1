package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3_get_currenturl {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.cricbuzz.com/");
	
	String url1= driver.getCurrentUrl();
	System.out.println(url1);
	
	
}
	
	
}
