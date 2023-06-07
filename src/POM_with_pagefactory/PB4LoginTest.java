package POM_with_pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PB4LoginTest {
	
	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		PB4loginpage l = new PB4loginpage(driver);
		l.ClickOnsignup();
		Thread.sleep(1000);
		
		PB4MobNumpage m = new PB4MobNumpage(driver);
		m.EnterMobNum();
		m.ClickOnLoginWithPwd();
		Thread.sleep(1000);
		
		PB4Pwdpage p = new PB4Pwdpage(driver);
		p.EnterPwd();
		p.ClickOnLogin();
		Thread.sleep(4000);
		
		PB4Homepage h = new PB4Homepage(driver);
		h.ClickOnMyAccDropDown();
		Thread.sleep(2000);
		
		PB4MyAccpage a = new PB4MyAccpage(driver);
		a.ClickOnMyProfile();
		Thread.sleep(3000);
		
		PB4Profilepage r= new PB4Profilepage(driver);
		r.SwitchToChildWindow();
		r.VerifyUsername();
		Thread.sleep(1000);
		
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
