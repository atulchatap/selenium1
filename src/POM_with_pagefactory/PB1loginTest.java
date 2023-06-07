package POM_with_pagefactory;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PB1loginTest {
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("F:\\\\software testing\\\\apache foi\\\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		
		PB1loginpage login = new PB1loginpage(driver);
		login.ClickPB1loginpageSignup();
		Thread.sleep(1000);
		
		PB1MobNumpage mob = new PB1MobNumpage(driver);
		String mobnum = sh.getRow(0).getCell(0).getStringCellValue();
		mob.InpPB1MobNumpageMobNum(mobnum);
		mob.ClickPB1MobNumpageSigninPwd();
		Thread.sleep(1000);
		
		PB1Pwdpage pwd = new PB1Pwdpage(driver);
		String Pwd = sh.getRow(0).getCell(1).getStringCellValue();
		pwd.InpPB1PwdpagePwd(Pwd);
		pwd.ClickPB1PwdpageLogin();
		Thread.sleep(3000);
		
		PB1Homepage home = new PB1Homepage(driver);
		home.OpenDropDownPB1HomepageMyAcc();
		Thread.sleep(3000);
		
		PB1MyAccpage acc = new PB1MyAccpage(driver);
		acc.ClickPB1MyAccpageMyProfile();
		Thread.sleep(1000);
		
		PB1Profilepage profile = new PB1Profilepage(driver);
		String exptext = sh.getRow(0).getCell(2).getStringCellValue();
		profile.SwitchtoPB1ProfilepageWindow();
		profile.VerifyNamePB1ProfilepageUsername(exptext);
		Thread.sleep(1000);
		
		driver.quit();
		
		
	}


}
