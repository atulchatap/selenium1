package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(ss);
		
		File path = new File("F:\\software testing\\automation testing\\screenshot");
		
	    org.openqa.selenium.io.FileHandler.copy(ss, path);
		
		
		
		
	}

}
