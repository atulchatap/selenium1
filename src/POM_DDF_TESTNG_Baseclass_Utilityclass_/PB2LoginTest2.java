package POM_DDF_TESTNG_Baseclass_Utilityclass_;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PB2LoginTest2 extends baseclass2{
	
	PB2Loginpage login;
	PB2MobNumpage mobnum;
	PB2Pwdpage pwd;
	PB2Homepage home;
	PB2MyAccpage myacc;
	PB2Profilepage myprofile;
	
	@BeforeClass
	public void openbrowser()
	{
		initializebrowser1();
		
		login = new PB2Loginpage(driver);
		mobnum = new PB2MobNumpage(driver);
		pwd = new PB2Pwdpage(driver);
		home = new PB2Homepage(driver);
		myacc = new PB2MyAccpage(driver);
		myprofile = new PB2Profilepage(driver);
	}
	
	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException, InterruptedException
	{
		login.ClickPB2LoginpageSignin();
		mobnum.InpPB2MObNumPageMobNum(utilityclass2.getdata(0, 0));
		mobnum.ClickPB2MObNumPageLoginWithPwd();
		Thread.sleep(2000);
		pwd.InpPB2PwdpagePassword(utilityclass2.getdata(0, 1));
		Thread.sleep(2000);
		pwd.ClickPB2PwdpageLogin();
		Thread.sleep(2000);
	}
	@Test
	public void verifyusername() throws InterruptedException, EncryptedDocumentException, IOException
	{
		home.MovetoPB2HomepageMyAcc();
		Thread.sleep(2000);
		myacc.ClickonPB2MyProfilepageProfile();
		Thread.sleep(2000);
		myprofile.SwitchtoPB2ProfilepageChildWindow();
		
		String acttext = myprofile.GetPB2ProfilepageUsename();
		String exptext = utilityclass2.getdata(0, 2);
		Assert.assertEquals(acttext, exptext);
		
	}
	@AfterMethod
	public void logout()
	{
		
	}
	@AfterClass
	public void closebrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
	

}
