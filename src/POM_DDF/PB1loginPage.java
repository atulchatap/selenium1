package POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB1loginPage {

	
	@FindBy(xpath="//a[text()='Sign in']") private WebElement login;
	
	public PB1loginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void ClickPBloginpagelogin() 
	{
		login.click();
	}
	
	
	
	
	
	
	
	
}
