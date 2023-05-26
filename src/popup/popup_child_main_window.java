package popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_child_main_window {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Set<String> alltabs = driver.getWindowHandles();
		
		ArrayList<String> tabs= new ArrayList<>(alltabs);
		
		driver.switchTo().window(tabs.get(1));
		
		driver.findElement(By.xpath("//span[text()='Training']")).click();
		
		driver.switchTo().window(tabs.get(0));
		
		driver.findElement(By.xpath("//input[@value='New Window']")).click();
		
		
		
		
		
		
		
	}
	
}
