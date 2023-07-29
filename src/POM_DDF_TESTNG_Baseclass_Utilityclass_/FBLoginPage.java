package POM_DDF_TESTNG_Baseclass_Utilityclass_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FBLoginPage {

	@FindBy(xpath="//a[@class='site-nav__link site-nav__link--icon medium-down--hide']") private WebElement Signup;
	
	public FBLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void ClickFBLoginPageSignup() 
	{
		Signup.click();
	}

	
	
	
	
}
