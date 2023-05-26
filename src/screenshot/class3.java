package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class class3 {

	public static void main(String[] args) throws IOException {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String rs = RandomString.make(4);
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		
		
		File path= new File("F:\\software testing\\automation testing\\screenshot\\image2"+rs+".jpg");
		
		FileHandler.copy(src, path);

		
		
		
		
	}









}
