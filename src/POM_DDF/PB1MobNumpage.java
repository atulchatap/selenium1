package POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB1MobNumpage {
	
	@FindBy(xpath="(//input[@id='central-login-module-sign-mobile'])[2]") private WebElement EnterMobnum;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]") private WebElement LoginWithPwd;
	
	public PB1MobNumpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void InpPB1MobNumpageMobnum(String mobnum) 
	{
		EnterMobnum.sendKeys(mobnum);
	}
	
	public void ClickPB1MobNumpageLoginPwd() 
	{
		LoginWithPwd.click();
	}
	

}
