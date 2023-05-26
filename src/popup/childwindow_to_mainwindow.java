package popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindow_to_mainwindow {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver= new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		//get child window id
		Set<String> allids = driver.getWindowHandles();
		
		ArrayList<String> s1= new ArrayList<String>(allids);
   
		//mainpage(0),childwindowid(1)
		String childwindow = s1.get(1);           //can combine in one line
		//switch to child window
		driver.switchTo().window(childwindow);
		
		//driver.switchTo().window(s1.get(1));    //we can use this in one line
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		Thread.sleep(3000);
		//get focus on main page 
		driver.switchTo().window(s1.get(0));
		
		Thread.sleep(3000);
		//click on "new window" tab from main page
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
		
		
		
		
	}
}
