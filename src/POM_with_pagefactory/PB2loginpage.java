package POM_with_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB2loginpage {

	@FindBy(xpath="//a[text()='Sign in']") private WebElement login;
	
	public PB2loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickPB2loginpageLogin() 
	{
		login.click();
	}
	
	
	
	
}
