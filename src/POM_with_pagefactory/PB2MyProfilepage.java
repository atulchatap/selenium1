package POM_with_pagefactory;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB2MyProfilepage {

	@FindBy(xpath="//input[@name='personName']") private WebElement Name;
	WebDriver driver1;
	public PB2MyProfilepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void SwitchtoPB2MyProfilepageWindow() 
	{
		Set<String> allid = driver1.getWindowHandles();
		ArrayList<String> a1 = new ArrayList<>(allid);
		driver1.switchTo().window(a1.get(1));
	}
	
	public void VerifyNamePB2MyProfilepageUsername(String Exptext) 
	{
		String Acttext = Name.getAttribute("value");
	
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
