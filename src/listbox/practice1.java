package listbox;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import handling_of_multiple_element.select_multiplecheckbox;

public class practice1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Select s1 = new Select(month);
		
		List<WebElement> allmonth = s1.getOptions();
		
		TreeSet<String> t1 = new TreeSet<>();
		
		System.out.println("before sorting");
		for(WebElement a1:allmonth)
		{
			t1.add(a1.getText());
			System.out.println(a1.getText());
		}
		Thread.sleep(3000);
		
		System.out.println("after sorting");
		
		for(String sor:t1)
		{
			System.out.println(sor);
		}
		
		
		
		
		
		
		
	}
	
	
}
