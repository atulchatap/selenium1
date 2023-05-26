package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex8_navigate {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");    //navigate().to
		Thread.sleep(2000);
		driver.manage().window().maximize();                //for maximize
		driver.navigate().to("https://www.flipkart.com/");  //navigate().to
		Thread.sleep(2000);
        driver.navigate().back();                           //navigate().back
        Thread.sleep(2000);
        driver.navigate().forward();                        //navigate().forward
        Thread.sleep(2000);
	    driver.navigate().refresh();                        //navigate().refresh
	    driver.close();
	
	
	}
	
	
	
}
