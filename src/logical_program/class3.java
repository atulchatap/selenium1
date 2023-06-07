package logical_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//for facebook name
		String fontsize1 = driver.findElement(By.xpath("(//img)[1]")).getCssValue("font-size");
		System.out.println(fontsize1);
		
		//for below details of facebok
		String fontsize2 = driver.findElement(By.xpath("//h2")).getCssValue("font-size");
		System.out.println(fontsize2);
		
		
	}
}
