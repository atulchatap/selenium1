package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class get_size_ofoption {

	public static void main(String[] args) throws InterruptedException {
		
	     WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			
			Thread.sleep(3000);
			
		    WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
			
			Select s = new Select(month);
			
		    List<WebElement> getoptions = s.getOptions();

		    int size= getoptions.size();

		    System.out.println(size);
		 
		
		
	}
	
	
}
