package handling_of_autosuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement dropdown = driver.findElement(By.xpath("//a[@qa='categoryDD']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(dropdown).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='Fruits & Vegetables'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@qa='searchBar']")).sendKeys("apple");
		Thread.sleep(3000);
		List<WebElement> allsug = driver.findElements(By.xpath("//ul[@class='search-item-suggesion']/li"));
		
		
		
		driver.findElement(By.xpath("(//div[@class='form-group add-btn ng-scope'])[1]")).click();
	}
}
