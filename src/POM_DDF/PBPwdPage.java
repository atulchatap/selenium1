package POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPwdPage {
	
	@FindBy(xpath="//input[@name='password']") private WebElement Pwd;
	@FindBy(xpath="//span[text()='Sign in']") private WebElement Signin;

	public PBPwdPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void InpPBPwdPagePwd(String password) 
	{
		Pwd.sendKeys(password);
	}
	
	public void ClickPBPwdPageSignin() 
	{
		Signin.click();
	}
	
	
	
	
}
