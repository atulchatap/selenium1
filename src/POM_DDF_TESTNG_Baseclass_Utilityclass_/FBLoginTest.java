package POM_DDF_TESTNG_Baseclass_Utilityclass_;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FBLoginTest extends Baseclass_FB{
	
	FBLoginPage login;
	FBEmailPwdPage emailpwd;
	FBMyprofilePage myprofile;
	FBSearchPage search;
	FBResultPage result;
	int TCID;
	
	@BeforeClass
	public void openbrowser () throws IOException 
	{
		initializebrowser();
		
		login = new FBLoginPage(driver);
		emailpwd = new FBEmailPwdPage(driver);
		myprofile = new FBMyprofilePage(driver);
		search = new FBSearchPage(driver);
		result = new FBResultPage(driver);
		
	}
	
	@BeforeMethod
	public void login() throws InterruptedException, IOException 
	{
		login.ClickFBLoginPageSignup();
		Thread.sleep(2000);
		emailpwd.InpFBEmailPwdPageEmail(Utilityclass_FB.GetPFData("email"));
		Thread.sleep(2000);
		emailpwd.InpFBEmailPwdPagePwd(Utilityclass_FB.GetPFData("pwd"));
		Thread.sleep(2000);
		emailpwd.ClickFBEmailPwdPagesignin();
		Thread.sleep(2000);
		myprofile.ClickFBMyprofilePageSearchbutton();
		search.InpFBMyprofilePageSearchbox(Utilityclass_FB.GetPFData("uti"));
		Thread.sleep(2000);
		search.ClickFBMyprofilePageResult();
		Thread.sleep(2000);
	}
	
	@Test
	public void Buyproduct() throws InterruptedException 
	{
		TCID=104;
		result.OpenDDFBResultPageMore();
		Thread.sleep(2000);
		result.ClickFBResultPagegold();
		Thread.sleep(2000);
		result.ClickFBResultPageNotify();
		
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
