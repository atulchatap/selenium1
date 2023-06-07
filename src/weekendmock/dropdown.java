package weekendmock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select")).click();
		Thread.sleep(2000);
		WebElement a1 = driver.findElement(By.xpath("//select"));
		
		Select s1 = new Select(a1);
		s1.selectByVisibleText("India");
		

		
		
		
		
		
		
		
		
	}
}
