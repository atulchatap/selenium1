package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class class2 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File path= new File("F:\\software testing\\automation testing\\screenshot\\abc4.jpg");
		
		FileHandler.copy(src, path);
		
		//click on create new account
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(5000);
		
        File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File path1 = new File("F:\\software testing\\automation testing\\screenshot\\abc5.jpg");
		
		FileHandler.copy(src1, path1);
		
		
	}
	
	

}
