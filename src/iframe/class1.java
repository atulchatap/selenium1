package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//switch to iframe
		
		//driver.switchTo().frame("iframeResult");   //frameid
		//driver.switchTo().frame("iframeResult");    //framename
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		
		
		//click on "click me to display" button from iframe
		driver.findElement(By.xpath("//button[contains(text(),'Click me to display ')]")).click();
		
		//switch to main page
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		//click on "open menu" option from main page
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
		
		
		
		
		
		
		
	}
	
}
