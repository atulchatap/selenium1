package logical_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1_file_upload {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		
		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\hp\\Pictures\\Screenshots\\Screenshot (1).png");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
		Thread.sleep(2000);
		
	}

}
