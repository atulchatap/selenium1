package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
	
		File dest = new File("F:\\software testing\\automation testing\\screenshot\\abc2.jpg");
	    
		org.openqa.selenium.io.FileHandler.copy(src, dest);
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
