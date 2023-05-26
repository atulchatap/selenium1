package method_with_return_type;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bigbasket {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@qa='categoryDD']")).click();
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//a[text()='Fruits & Vegetables'])[2]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@qa='searchBar']")).sendKeys("oil");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='ADD']")).click();
		
		
		
	}
}
