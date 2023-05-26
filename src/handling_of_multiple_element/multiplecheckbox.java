package handling_of_multiple_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplecheckbox {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.zomato.com/india");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//h5[text()='Nagpur Restaurants']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//div[text()='Cuisines']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//label[text()='Coffee']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//label[text()='French']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//label[text()='Ice Cream']")).click();
		 Thread.sleep(1000);
		 
		 
		// List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		 
		 //for(int i=0; i<=10; i++)
		 //{
		//	 checkbox.get(i).click();
		//	 Thread.sleep(200);
		 //}
		 
		 
	}
}
