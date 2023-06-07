package POM_with_pagefactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PB2LoginTest {
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("F:\\software testing\\apache foi\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		PB2loginpage login = new PB2loginpage(driver);
		login.ClickPB2loginpageLogin();
		Thread.sleep(1000);
		
		PB2MobNumpage mob = new PB2MobNumpage(driver);
		String mobilenum = sh.getRow(0).getCell(0).getStringCellValue();
		mob.InpPB2MobNumpageMobNum(mobilenum);
		mob.ClickPB2MobNumpageLoginPwd();
		Thread.sleep(1000);
		
		PB1Pwdpage pwd = new PB1Pwdpage(driver);
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		pwd.InpPB1PwdpagePwd(password);
		pwd.ClickPB1PwdpageLogin();
		Thread.sleep(3000);
		
		PB1Homepage home = new PB1Homepage(driver);
		home.OpenDropDownPB1HomepageMyAcc();
		Thread.sleep(3000);
		
		PB1MyAccpage myacc = new PB1MyAccpage(driver);
		myacc.ClickPB1MyAccpageMyProfile();
		Thread.sleep(2000);
		
		PB1Profilepage profile = new PB1Profilepage(driver);
		String Exptext = sh.getRow(0).getCell(2).getStringCellValue();
		profile.SwitchtoPB1ProfilepageWindow();
		profile.VerifyNamePB1ProfilepageUsername(Exptext);
		
		driver.quit();
		
		
		
	}

}
