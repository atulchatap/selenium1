package screenshot;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ex1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.zomato.com/india");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//h5[text()='Nagpur Restaurants']")).click();
		Thread.sleep(3000);
		
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(ss);
		
		File f1 = new File("F:\\software testing\\automation testing\\screenshot\\zomato.jpg");
		FileHandler.copy(ss, f1);
		
		
		
	}

}
