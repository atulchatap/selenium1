package POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyAccPage {

	@FindBy(xpath="//span[text()=' My profile ']") private WebElement MyProfile;
	@FindBy(xpath="//span[text()='Sign out']") private WebElement Signout;
	
	public PBMyAccPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void ClickPBMyAccPageMyProfile() 
	{
		MyProfile.click();
	}
	public void ClickPBMyAccPageSignout() 
	{
		Signout.click();
	}
	
	
	
}
