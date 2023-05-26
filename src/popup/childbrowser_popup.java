package popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowser_popup {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		//get child window id
		Set<String> allids = driver.getWindowHandles();
		
		ArrayList<String> s1= new ArrayList<String>(allids);
    //mainpage(0),childwindowid(1)
		String childwindow = s1.get(1);
		
		//switch to child window
		driver.switchTo().window(childwindow);
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	}
	
	
}
