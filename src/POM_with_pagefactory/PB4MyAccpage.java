package POM_with_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB4MyAccpage {
	
	@FindBy(xpath="//span[text()=' My profile ']") private WebElement MyProfile;

	public PB4MyAccpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void ClickOnMyProfile() 
	{
		MyProfile.click();
	}








}
