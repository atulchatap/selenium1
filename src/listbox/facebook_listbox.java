package listbox;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook_listbox {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s1= new Select(month);
		
		List<WebElement> alloptions = s1.getOptions();
		
		TreeSet<String> sort= new TreeSet<>();

		for(WebElement all:alloptions)
		{
			sort.add(all.getText());
			System.out.println(all.getText());
		}
		System.out.println("-----after sorting-----");
		
		
		for(String sr:sort)
		{
			System.out.println(sr);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
