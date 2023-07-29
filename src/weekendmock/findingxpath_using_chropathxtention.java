package weekendmock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findingxpath_using_chropathxtention {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[22]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("9752699306");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[22]/div[1]/div[1]/div[3]/div[1]/a[2]/span[1]")).click();
	
	
	}
}
