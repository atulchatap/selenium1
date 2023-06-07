package POM_with_pagefactory;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBloginTest {
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("F:\\software testing\\apache foi\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		
		PBloginPage login = new PBloginPage(driver);
		login.ClickPBloginPageSignin();
		
		PBMobNumPage mobile = new PBMobNumPage(driver);
		String mobnum = sh.getRow(0).getCell(0).getStringCellValue();
		mobile.InpPBMobNumPageMobNum(mobnum);
		mobile.ClickPBMobNumPageSigninPwd();
		Thread.sleep(2000);
		
		PBPwdPage pwd = new PBPwdPage(driver);
		String enterpwd = sh.getRow(0).getCell(1).getStringCellValue();
		pwd.InpPBPwdPagePwd(enterpwd);
		pwd.ClickPBPwdPageSignin();
		Thread.sleep(2000);
		
		PBHomePage home = new PBHomePage(driver);
		home.MoveToElementPBHomePageMyAcc();
		Thread.sleep(2000);
		
		PBMyAccPage myacc = new PBMyAccPage(driver);
		myacc.ClickPBMyAccPageMyProfile();
		Thread.sleep(2000);
		
		PBProfilePage profile = new PBProfilePage(driver);
		String expname = sh.getRow(0).getCell(2).getStringCellValue();
		profile.SwitchtoPBProfilePageWindow();
		profile.VerifyNamePBProfilePageUsername(expname);
		Thread.sleep(2000);
		
		driver.quit();	
	}

}
