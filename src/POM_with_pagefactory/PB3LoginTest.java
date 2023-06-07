package POM_with_pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PB3LoginTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		PB3loginpage login = new PB3loginpage(driver);
		login.CLickOnlogin();
		Thread.sleep(1000);
		
		PB3MobNumpage mob = new PB3MobNumpage(driver);
		mob.EnterMobNum();
		mob.ClickOnLoginPwd();
		Thread.sleep(1000);
		
		PB3Pwdpage pwd = new PB3Pwdpage(driver);
		pwd.EnterPwd();
		pwd.ClickOnLoginWithPwd();
		Thread.sleep(3000);
		
		PB1Homepage home = new PB1Homepage(driver);
		home.OpenMyAccDropDown();
		Thread.sleep(3000);
		
		PB1MyAccpage myacc = new PB1MyAccpage(driver);
		myacc.ClickOnMyProfile();
		Thread.sleep(2000);
		
		PB1Profilepage profile = new PB1Profilepage(driver);
		profile.SwitchToChildWindow();
		profile.VerifyUsername();
		Thread.sleep(1000);
		
		driver.quit();
		
		
		
		
		
		
		
	}

}
