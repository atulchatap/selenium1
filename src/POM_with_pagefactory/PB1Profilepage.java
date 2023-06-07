package POM_with_pagefactory;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB1Profilepage {
	
	@FindBy(xpath="//input[@name='personName']") private WebElement Username;
	WebDriver driver1;
	
	public PB1Profilepage(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
		driver1=driver;
	}
	
	public void SwitchtoPB1ProfilepageWindow() 
	{
		Set<String> windows = driver1.getWindowHandles();
		ArrayList<String> a1 = new ArrayList<>(windows);
		driver1.switchTo().window(a1.get(1));
	}
	
    public void VerifyNamePB1ProfilepageUsername(String Exptext) 
    {
    	String Acttext = Username.getAttribute("value");
		
		
		if(Acttext.equals(Exptext))
		{
			System.out.println("tc pass");		
		}
		else
		{
			System.out.println("tc fail");
		}
	}
	
	
	
	

}
