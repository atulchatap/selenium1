package POM_with_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB4Pwdpage {

	@FindBy(xpath="//input[@name='password']") private WebElement Pwd;
	@FindBy(xpath="//span[text()='Sign in']") private WebElement Login;
	
	public PB4Pwdpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterPwd() 
	{
		Pwd.sendKeys("atul@1432");
	}
	public void ClickOnLogin() 
	{
		Login.click();
	}
	
	
	
	
}
