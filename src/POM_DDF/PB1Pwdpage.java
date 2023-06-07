package POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB1Pwdpage {

	@FindBy(xpath="//input[@name='password']") private WebElement EnterPwd;
	@FindBy(xpath="//span[text()='Sign in']") private WebElement Signin;

	public PB1Pwdpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void InpPB1PwdpagePwd(String pwd) 
	{
		EnterPwd.sendKeys(pwd);
	}
	
	public void ClickPB1PwdpageSignin() 
	{
		Signin.click();
	}
	
	
}
