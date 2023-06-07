package logical_program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class2_popup_un_pwd {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//username = admin;
		//password = admin;
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		
	}

}
