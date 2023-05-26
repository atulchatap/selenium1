package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();     //maximize compolsury
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//switchto iframe
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		
		Thread.sleep(4000);
		
		//click on "display" button
		driver.findElement(By.xpath("//button[contains(text(),' display Date and Time')]")).click();
		
		Thread.sleep(4000);
		
		//back to main page
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@title='Change Theme']")).click();
	}

}
