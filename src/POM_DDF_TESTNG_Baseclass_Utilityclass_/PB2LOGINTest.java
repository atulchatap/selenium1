package POM_DDF_TESTNG_Baseclass_Utilityclass_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_with_pagefactory.PB2loginpage;

public class PB2LOGINTest extends BaseClass {
	
	PB2loginpage login;
	PB2MobNumpage mobnum;
	PB2Pwdpage pwd;
	PB2Homepage MyAcc;
	PB2MyAccpage MyProfile;
	PB2Profilepage Username;
	int TCID;
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException 
	{
		
	//	driver = new ChromeDriver();
	//	driver.get("https://www.policybazaar.com/");
	//	driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(15));
		
		Initializebrowser();
		
		login = new PB2loginpage(driver);
		mobnum = new PB2MobNumpage(driver);
		pwd = new PB2Pwdpage(driver);
		MyAcc = new PB2Homepage(driver);
		MyProfile = new PB2MyAccpage(driver);
		Username = new PB2Profilepage(driver);
		
		
	}
	@BeforeMethod
	public void Login() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		login.ClickPB2loginpageLogin();
		mobnum.InpPB2MObNumPageMobNum(UtilityClass.GetPFdata("mobnum"));
		mobnum.ClickPB2MObNumPageLoginWithPwd();
		Thread.sleep(2000);
		pwd.InpPB2PwdpagePassword(UtilityClass.GetPFdata("pwd"));
		Thread.sleep(2000);
		pwd.ClickPB2PwdpageLogin();
		Thread.sleep(4000);
	}
	@Test
	public void verifyusername() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		TCID= 101;
		MyAcc.MovetoPB2HomepageMyAcc();
		Thread.sleep(2000);
		MyProfile.ClickonPB2MyProfilepageProfile();
		Thread.sleep(2000);
		Username.SwitchtoPB2ProfilepageChildWindow();
		Thread.sleep(2000);
		String acttext = Username.GetPB2ProfilepageUsename();
		String exptext = UtilityClass.GetTestData(0, 2);
		
		Assert.assertEquals(acttext, exptext);
	}
	@AfterMethod
	public void logout(ITestResult s1) throws IOException 
	{
		if(s1.getStatus()== ITestResult.FAILURE)
		{
			UtilityClass.CaptureSS(driver, TCID);
		}
		
	}

	@AfterClass
	public void closebrowser() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.quit();
	}
}
