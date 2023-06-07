package POM_DDF;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBProfilePage {
	
	@FindBy(xpath="//input[@name='personName']") private WebElement Fullname;
	WebDriver driver1;
	
	public PBProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	public void SwitchtoPBProfilePageChildWindow()
	{
		Set<String> allwindow = driver1.getWindowHandles();
		ArrayList<String> a1 = new ArrayList<>(allwindow);
		driver1.switchTo().window(a1.get(1));
	}
	
	
	public void VerifynamePBProfilePageUsername(String exptext) 
	{
		String acttext = Fullname.getAttribute("value");
		
		if(acttext.equals(exptext))
		{
			System.out.println("tc pass");
		}
		else
		{
			System.out.println("tc fail");
		}
	}
	

}
