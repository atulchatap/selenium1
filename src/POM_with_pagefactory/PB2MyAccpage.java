package POM_with_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB2MyAccpage {

	@FindBy(xpath="//span[text()=' My profile ']") private WebElement MyProfile;
	
	public PB2MyAccpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickPB2MyAccpageMyProfile() 
	{
		MyProfile.click();
	}
	
	
	
	
	
	
	
}
