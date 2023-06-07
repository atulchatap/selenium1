package POM_DDF;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB1MyProfilepage {
	
	@FindBy(xpath="//input[@name='personName']") private WebElement Username;
	
	WebDriver driver1;
	public PB1MyProfilepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void SwitchtoPB1MyProfilepageChildwindow() 
	{
		Set<String> windows = driver1.getWindowHandles();
		ArrayList<String> a1 = new ArrayList<>(windows);
		driver1.switchTo().window(a1.get(1));
	}
	
	public void VerifyPB1MyProfilepageUsername(String exptext) 
	{
		String Acttext = Username.getAttribute("value");
		
		if(Acttext.equals(exptext))
		{
			System.out.println("tc is pass");
		}
		else
		{
			System.out.println("tc is fail");
		}
		
		
		
		
		
		
	}
	
	
	
	

}
