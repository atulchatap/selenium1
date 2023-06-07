package POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobNumPage {

	@FindBy(xpath="(//input[@id='central-login-module-sign-mobile'])[2]") private WebElement MobNum;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]") private WebElement SigninWithPwd;
	
	public PBMobNumPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void InpPBMobNumPageMobNum(String Mobn) 
	{
		MobNum.sendKeys(Mobn);
	}
	
	public void ClickPBMobNumPageSigninWithPwd() 
	{
		SigninWithPwd.click();
	}
	
	
}
