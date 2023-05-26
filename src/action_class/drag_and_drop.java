package action_class;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_and_drop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		
		WebElement drag = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		
		WebElement drop = driver.findElement(By.xpath("//ol[@id='amt7']"));
		
		Actions a1 = new Actions(driver);
		Thread.sleep(3000);
		a1.dragAndDrop(drag, drop).perform();
		
		
		
	}
}
