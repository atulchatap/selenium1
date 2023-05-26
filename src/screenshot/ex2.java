package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/india");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement ngpr = driver.findElement(By.xpath("//h5[text()='Nagpur Restaurants']"));
	    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",ngpr);
		
	    Thread.sleep(2000);
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(ss);
		File f1 = new File("F:\\software testing\\automation testing\\screenshot\\znagpur.jpg");
		org.openqa.selenium.io.FileHandler.copy(ss, f1);
	
	}

}
