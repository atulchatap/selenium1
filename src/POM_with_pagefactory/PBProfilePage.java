package POM_with_pagefactory;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBProfilePage {

	@FindBy (xpath="//input[@name='personName']")private WebElement Fullname;
	WebDriver driver1;
	
	public PBProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void SwitchtoPBProfilePageWindow() 
	{
		Set<String> allwindow = driver1.getWindowHandles();
		ArrayList<String> a1 = new ArrayList<>(allwindow);
		driver1.switchTo().window(a1.get(1));
	}
	public void VerifyNamePBProfilePageUsername(String Exptext) 
	{
		String Acttext = Fullname.getAttribute("value");
		
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
