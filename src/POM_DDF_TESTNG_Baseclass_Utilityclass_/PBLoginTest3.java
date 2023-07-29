package POM_DDF_TESTNG_Baseclass_Utilityclass_;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_with_pagefactory.PB2loginpage;

public class PBLoginTest3 extends Baseclass3 {

	PB2loginpage login;
	PB2MobNumpage mobnum;
	PB2Pwdpage pwd;
	PB2Homepage home;
	PB2MyAccpage myacc;
	PB2Profilepage myprofile;
	int TCID;
	
	
	@BeforeClass
	public void openbrowser() throws IOException 
	{
		initializebrowser();
		
		login = new PB2loginpage(driver);
		mobnum = new PB2MobNumpage(driver);
		pwd = new PB2Pwdpage(driver);
		home = new PB2Homepage(driver);
		myacc = new PB2MyAccpage(driver);
		myprofile = new PB2Profilepage(driver);
		
	}
	@BeforeMethod
	public void login() throws IOException, InterruptedException 
	{
		login.ClickPB2loginpageLogin();
		mobnum.InpPB2MObNumPageMobNum(Utilityclass3.getpfdata("mobnum"));
		mobnum.ClickPB2MObNumPageLoginWithPwd();
		Thread.sleep(2000);
		pwd.InpPB2PwdpagePassword(Utilityclass3.getpfdata("pwd"));
		Thread.sleep(2000);
		pwd.ClickPB2PwdpageLogin();
		Thread.sleep(2000);
	}
	
	@Test
	public void verifyusername() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		TCID = 102;
		home.MovetoPB2HomepageMyAcc();
		Thread.sleep(2000);
		myacc.ClickonPB2MyProfilepageProfile();
		Thread.sleep(2000);
		myprofile.SwitchtoPB2ProfilepageChildWindow();
		
		String actext = myprofile.GetPB2ProfilepageUsename();
		String exptext = Utilityclass3.getdata(0,2);
		Assert.assertEquals(actext, exptext);
		
	}
	@AfterMethod
	public void logout(ITestResult a1) throws IOException 
	{
		if(a1.getStatus()==ITestResult.FAILURE)
		{
			Utilityclass3.captureSS(driver, TCID);
		}
		
	}
	@AfterClass
	
	public void closebrowser() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.quit();
		
	}
	

}
