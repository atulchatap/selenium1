package listbox;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fb_listbox_year {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(4000);
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		
		Select m1= new Select(month);
		
		// m1.selectByVisibleText("1995");
		
		List<WebElement> getoptions = m1.getOptions();
		
		TreeSet<String> sort= new TreeSet<>();
		
		for(WebElement all:getoptions)
		{
			sort.add(all.getText());
			System.out.println(all.getText());
		}
	
		System.out.println("after sorting");
		
		for(String s1:sort)
		{
			System.out.println(s1);
		}
		
		
		
		
	}
}
