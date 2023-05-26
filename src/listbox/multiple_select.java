package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiple_select {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///F:/software%20testing/html/listbox2.html");
		
		WebElement selectcountry= driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s = new Select(selectcountry);
		
		s.selectByIndex(1);
		s.selectByIndex(0);
		s.selectByIndex(2);
		
	 	List<WebElement> multipletext = s.getAllSelectedOptions();
		
	 	//System.out.println(multipletext.size());
	 	
	 	int size = multipletext.size();
	 	System.out.println(size);
	 	
	 	
	 	
		for(WebElement m1:multipletext)
		{
			System.out.println(m1.getText());
		}
		
		
		
	}
	
	
}
