package framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex2_withDDF2 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileInputStream file = new FileInputStream("F:\\software testing\\apache foi\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@id='central-loggin-with-pwd'])[2]")).click();
		Thread.sleep(2000);
		
        driver.findElement(By.xpath("//input[@id='central-login-password']")).sendKeys(sh.getRow(0).getCell(1).getStringCellValue());
        Thread.sleep(2000); 
        driver.findElement(By.xpath("//span[text()='Sign in']")).click();
        Thread.sleep(2000);
		WebElement account = driver.findElement(By.xpath("//div[text()='My Account']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(account).perform();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
		
		Set<String> allid = driver.getWindowHandles();
		ArrayList<String> s1 = new ArrayList<String>(allid);
		driver.switchTo().window(s1.get(1));
		Thread.sleep(2000);
		
		String acttext = driver.findElement(By.xpath("//input[@name='personName']")).getAttribute("value");
		
		String exptext = sh.getRow(0).getCell(2).getStringCellValue();
		
		if(acttext.equals(exptext))
		{
			System.out.println("tc pass");
		}
		else
		{
			System.out.println("tc fail");
		}
		driver.quit();
		
		
	}
		

}
